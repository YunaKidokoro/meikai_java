package Ensyu10_4;

import static java.util.Calendar.*;

//GregorianCalendarをインポートする
import java.util.GregorianCalendar;
//スキャナークラスをインポートする
import java.util.Scanner;
/*クラス名：Day
* 概要:日付クラス
* 作成日:2023/04/27
* 作成者:城所佑奈
* */
public class Day {
	//日にちの比較結果を表す変数
	static int compareResult = 0;
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	
	//各フィールドを初期化
	GregorianCalendar today = new GregorianCalendar();
	//西暦何年かを表すフィールド
	private int year = today.get(YEAR);
	//月を表すフィールド
	private int month = today.get(MONTH) +1;
	//日にちを表すフィールド
	private int date  = today.get(DATE);
	
	/*
	 * 関数名:isLeep
	 * 概　要:うるう年かどうかの判定をする
	 * 引　数:なし
	 * 戻り値:うるう年かどうか
	 * 作成日:2023/5/2
	 * */
	public static boolean isLeep(int y) {
		//うるう年の判定に用いる基準のひとつ
		final int baseNumberA = 4;
		//うるう年の判定に用いる基準のひとつ
		final int baseNumberB = 100;
		//うるう年の判定に用いる基準のひとつ
		final int baseNumberC = 400;
		/* 4で割り切れて、かつ、100で割り切れなくて、または400で割り切れるような年
		をうるう年とする */
		return y%baseNumberA==0 && y%baseNumberB!=0 || y%baseNumberC==0;
	}
	
	//現在の日付を受け取る静的初期化子
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) +1;
		int d = today.get(DATE);
	}
	
	
	//コンストラクタ・引数を受け取らない各フィールドは宣言時の値で初期化される
	//年月日を受け取らずにコンストラクタを定義
	public Day() {} 
	//年のみを受け取るコンストラクタ、不適当な値は現在の時間に調整する
	public Day(int year) {
		//引数で初期化
		this.year = year;
		if(year<=0) {
			int yearAdjust = 1;
			this.year = yearAdjust;
		}
	} 
	//年・月のみを受け取るコンストラクタ、不適当な値は１に調整する
	public Day(int year, int month){
		//年のみを受け取るコンストラクタを参照
		this(year);
		//引数で初期化
		this.month = month;
		if(month<0 || month>12) {
			int monthAdjust = 12;
			this.month = monthAdjust;
		}
	}
	//年・月・日を受け取るコンストラクタ
	public Day(int year, int month, int date){
		//年・月のみを受け取るコンストラクタを参照
		this(year, month);
		//引数で初期化
		this.date= date;
		if(month==4 || month==6 || month==9 || month==11) {
			if(date>30) {
				int dayAdjust = 30;
				this.date= dayAdjust;
			}
		}
		//うるう年の２月の場合
		else if(month==2 && isLeep(year)==true) {
			if(date>29) {
				int dayAdjust = 29;
				this.date = dayAdjust;
			}
		}
		else if(month==2 && isLeep(year)==false) {
			if(date>28) {
				int dayAdjust = 28;
				this.date = dayAdjust;
			}
		}
		else {
			if(date>31) {
				int dayAdjust = 31;
				this.date = dayAdjust;
			}
		}
	} 
	//クラス型引数ｄの参照する値を受け取るコンストラクタ
	public Day(Day d) {
		this(d.year, d.month, d.date);
		} 
	
	//ゲッタ
	/*
	 * 関数名:getYear
	 * 概　要:年を取得
	 * 引　数:なし
	 * 戻り値:int型・year・取得した年を返す
	 * 作成日:2023/4/28
	 * */
	public int getYear() { 
		return year;
	}
	/*
	 * 関数名:getMonth
	 * 概　要:月を取得
	 * 引　数:なし
	 * 戻り値:int型・month・取得した月を返す
	 * 作成日:2023/4/28
	 * */
	public int getMonth() { 
		return month;
	}
	/*
	 * 関数名:getDate
	 * 概　要:日にちを取得
	 * 引　数:なし
	 * 戻り値:int型・date・取得した日にちを返す
	 * 作成日:2023/4/28
	 * */
	public int getDate() { 
		return date;
	}
	
	//セッタ
	/*
	 * 関数名:setYear
	 * 概　要:年を設定
	 * 引　数:なし
	 * 戻り値:int型・year・設定した年を返す
	 * 作成日:2023/4/28
	 * */
	public void setYear(int year) {
		this.year = year;
	}
	/*
	 * 関数名:setMonth
	 * 概　要:月を設定
	 * 引　数:なし
	 * 戻り値:int型・year・設定した月を返す
	 * 作成日:2023/4/28
	 * */
	public void setMonth(int month) {
		this.month = month;
	}
	/*
	 * 関数名:getDate
	 * 概　要:日にちを設定
	 * 引　数:なし
	 * 戻り値:int型・year・設定した日を返す
	 * 作成日:2023/4/28
	 * */
	public void setDate(int date) {
		this.date = date;
	}
	
	/*
	 * 関数名:set
	 * 概　要:年・月・日を引数にしてまとめて設定
	 * 引　数:int型・year,month,date・年・月・日
	 * 戻り値:設定した年・月・日を返す
	 * 作成日:2023/4/28
	 * */
	 public void set(int year, int month, int date) {
		//年を表すフィールドに仮引数を代入
		this.year = year;
		//月を表すフィールドに仮引数を代入
		this.month = month;
		//日を表すフィールドに仮引数を代入
		this.date = date;	
	}
	/*
	 * 関数名:isLeep
	 * 概　要:うるう年かどうかの判定をする
	 * 引　数:なし
	 * 戻り値:うるう年かどうか
	 * 作成日:2023/5/2
	 * */
	 public boolean isLeep() {
		 //フィールド変数のyearがうるう年かどうかの判定
		 return isLeep(year);
	 }
	 
	 
	/*
	 * 関数名:dayOfWeek
	 * 概　要:曜日を求める
	 * 引　数:なし
	 * 戻り値:0~6が日曜日～土曜日に対応した値を返す
	 * 作成日:2023/4/28
	 * */
	public int dayOfWeek() {
		//ｙに年の値を代入
		int y = year;
		//ｍに月の値を代入
		int m = month;
		//１月か２月のどちらかの場合
		if(m == 1 || m == 2) {
			//年をデクリメント
			y--;
			//月に１２を加える
			m += 12;
		}
		//0~6が日曜日～土曜日に対応した値を返す
		return (y+ y/4 -y/100 + y/400 + (13*m+8)/5 + date)%7;
	}
	/*
	 * 関数名:dayOfWeek
	 * 概　要:日付ｄと等しいか
	 * 引　数:Day型・ｄ・年月日
	 * 戻り値:日付ｄと等しいか確認し等しければtureを返す
	 * 作成日:2023/4/28
	 * */
	public boolean equalTo(Day d) {
		//フィールドの値をひとつずつ確認し、等しければtureを返す
		return year == d.year && month == d.month && date == d.date;
	}
	
	/*
	 * 関数名:toString
	 * 概　要:〇年〇月〇日（曜日）の文字列を作る
	 * 引　数:なし
	 * 戻り値:文字列表現を返却
	 * 作成日:2023/4/28
	 * */
	public String toString() {
		//曜日を表す文字を格納する配列
		String[] wd = {"日","月","火","水","木","金","土"};
		//dayOfWeekメソッドで求めた値から曜日を表示する
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
	//各月の日数を格納した配列(うるう年でない)
	static int[] monthlyDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//元旦から数えた月末の経過日数を格納した配列（うるう年でない）
	static int[] elapseArray = {31,59,90,120,150,181,212,243,273,304,334,365};
	//元旦から数えた月末の経過日数を格納した配列（うるう年）
	static int[] elapseArray_= {31,60,91,121,151,182,213,244,274,305,335,366};
	
	//元旦から数えた月初めの経過日数を格納した配列（うるう年でない）
	static int[] earlyArray  = { 1,32,61, 92,122,152,183,214,245,275,306,336};
	//元旦から数えた月初めの経過日数を格納した配列（うるう年でない）
	static int[] earlyArray_  = {1,32,62, 93,123,153,184,215,246,276,307,337};

	/*
	 * 関数名:elapsedDay
	 * 概　要:年内の経過日数を取得する
	 * 引　数:任意の日付の年月日
	 * 戻り値:経過日数を返す
	 * 作成日:2023/5/2
	 * */
	public static int elapseDay(int year_, int month_, int day_) {
		int elapseDay = 0;
		//１月の場合
		if(month_ ==1) {
			elapseDay = day_;
		}
		//2月以降でうるう年の場合
		else if(isLeep(year_)==true) {
			//先月までの経過日数と今月の経過日数を加える
			elapseDay =  elapseArray_[month_-2]+day_;
		}
		//２月以降でうるう年でない場合
		else {
			//先月までの経過日数と今月の経過日数を加える
			elapseDay =  elapseArray[month_-2]+day_;
		}
		return elapseDay;
	}
	
	/*
	 * 関数名:remainDay
	 * 概　要:年内の残り日数を取得する
	 * 引　数:任意の日付の年月日
	 * 戻り値:残り日数を返す
	 * 作成日:2023/5/2
	 * */
	public static int remainDay(int year_, int month_, int day_) {
		//残り日数を表す変数
		int remainDay = 0;
		//一年間の日数を表す変数
		int oneYearDay = 365;
		//うるう年の場合
		if(isLeep(year_)==true) {
			//一年間の日数から経過日数を引く
			remainDay = (oneYearDay+1)-elapseDay(year_, month_, day_);
		}
		//うるう年でない場合
		else{
			//一年間の日数から経過日数を引く
			remainDay = oneYearDay-elapseDay(year_, month_, day_);
		}
		//残り日数を返す
		return remainDay;
	}
	
	/*
	 * 関数名:compareDay
	 * 概　要:2つの日付の時間関係を判定
	 * 引　数:任意の日付の年月日
	 * 戻り値:日付の時間関係を判定
	 * 作成日:2023/5/2
	 * */
	public static void compareDay
	(int baseYear, int baseMonth, int baseDay,
			int inputYear, int inputMonth, int inputDay) {
		//判定結果が基準よりも後の場合を１とする
		final int compareAfter = 1;
		//判定結果が基準と等しい場合を２とする
		final int compareSame  = 2;
		//判定結果が基準よりも前の場合を０とする
		final int compareBefore= 0;
		
		//判定結果を表す変数
		int compareAnswer = 0;
		//基準の年よりも後の場合
		if(baseYear<inputYear) {
			compareAnswer = compareAfter;
		}
		//基準の年よりも前の場合
		else if(baseYear>inputYear) {
			compareAnswer =compareBefore;
		}
		//基準の年と等しい場合
		else{
			//年内の経過日数が基準よりも多い場合
			if(Day.elapseDay(baseYear,baseMonth,baseDay)
					<Day.elapseDay(inputYear,inputMonth,inputDay)){
				compareAnswer = compareAfter;
			}
			//年内の経過日数が基準よりと等しい場合
			else if(Day.elapseDay(baseYear,baseMonth,baseDay)
					==Day.elapseDay(inputYear,inputMonth,inputDay)) {
				compareAnswer = compareSame;
			}
		}
		switch(compareAnswer) {
		case 0: System.out.println("より前の日付です");
		case 1: System.out.println("より後の日付です");
		case 2: System.out.println("同じ日付です");
		}	
	}
}

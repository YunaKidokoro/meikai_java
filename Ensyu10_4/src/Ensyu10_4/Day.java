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
		//GregorianCalendarのインスタンスを初期化
		GregorianCalendar today = new GregorianCalendar();
		//変数yに今日の年を代入
		int y = today.get(YEAR);
		//変数mに今日の月を代入
		int m = today.get(MONTH) +1;
		//変数dに今日の日にちを代入
		int d = today.get(DATE);
	}
	
	
	//コンストラクタ・引数を受け取らない各フィールドは宣言時の値で初期化される
	//年月日を受け取らずにコンストラクタを定義
	public Day() {} 
	//年のみを受け取るコンストラクタ、不適当な値は現在の時間に調整する
	public Day(int year) {
		//引数で初期化
		this.year = year;
		//年を表す変数が0以下の場合
		if(year<=0) {
			//年を調整する変数を１で宣言
			int yearAdjust = 1;
			//年を1年で調整する
			this.year = yearAdjust;
		}
	} 
	//年・月のみを受け取るコンストラクタ、不適当な値は１に調整する
	public Day(int year, int month){
		//年のみを受け取るコンストラクタを参照
		this(year);
		//引数で初期化
		this.month = month;
		//月を表す変数が0以下、又は13以上の場合
		if(month<0 || month>12) {
			//月を調整する変数を１２で宣言
			int monthAdjust = 12;
			//月を１２で調整する
			this.month = monthAdjust;
		}
	}
	//年・月・日を受け取るコンストラクタ
	public Day(int year, int month, int date){
		//年・月のみを受け取るコンストラクタを参照
		this(year, month);
		//引数で初期化
		this.date= date;
		//引数の月が４，６，９，１１月の場合
		if(month==4 || month==6 || month==9 || month==11) {
			//引数の日にちが31以上の場合
			if(date>30) {
				//日にちを調整する変数を30で宣言
				int dayAdjust = 30;
				//日にちを30日で調整
				this.date= dayAdjust;
			}
		}
		//うるう年の２月の場合
		else if(month==2 && isLeep(year)==true) {
			//引数の日にちが29以上の場合
			if(date>29) {
				//日にちを調整する変数を29で宣言
				int dayAdjust = 29;
				//日にちを29日で調整
				this.date = dayAdjust;
			}
		}
		//うるう年でない２月の場合
		else if(month==2 && isLeep(year)==false) {
			//引数の日にちが28以上の場合
			if(date>28) {
				//日にちを調整する変数を28で宣言
				int dayAdjust = 28;
				//日にちを28日で調整
				this.date = dayAdjust;
			}
		}
		//1,3,5,7,8,10,12月の場合
		else {
			//引数の日にちが31以上の場合
			if(date>31) {
				//日にちを調整する変数を31で宣言
				int dayAdjust = 31;
				//日にちを31日で調整
				this.date = dayAdjust;
			}
		}
	} 
	//クラス型引数ｄの参照する値を受け取るコンストラクタ
	public Day(Day d) {
		//引数のインスタンスで初期化する
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
		//フィールドの年を返す
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
		//フィールドの月を返す
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
		//フィールドの日にちを返す
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
		//フィールドの年を引数の値で設定する
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
		//フィールドの月を引数の値で設定する
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
		//フィールドの日にちを引数の値で設定する
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
		 //フィールド変数のyearがうるう年かどうかの判定を返す
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
	 * 概　要:引数の日付の曜日を求める
	 * 引　数:曜日を知りたい日付
	 * 戻り値:0~6が日曜日～土曜日に対応した値を返す
	 * 作成日:2023/4/28
	 * */
	public int dayOfWeek(int year, int month, int date) {
		//１月か２月のどちらかの場合
		if(month == 1 || month == 2) {
			//年をデクリメント
			year--;
			//月に１２を加える
			month += 12;
		}
		//0~6が日曜日～土曜日に対応した値を返す
		return (year+ year/4 -year/100 + year/400 + (13*month+8)/5 + date)%7;
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
		//経過日数を返す
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
	 * 概　要:インスタンスの日付を引数の日付と比較したときの時間関係を表示する
	 * 引　数:比較の基準となる日付
	 * 戻り値:日付の時間関係を判定
	 * 作成日:2023/5/2
	 * */
	public void compareDay(int baseYear, int baseMonth, int baseDay) {
		//インスタンスから年を取得して変数に代入する
		int inputYear = getYear();
		//インスタンスから月を取得して変数に代入する
		int inputMonth= getMonth();
		//インスタンスから日付を取得して変数に代入する
		int inputDate = getDate();
		//引数の値を基準にインスタンスから取得した日付の時間関係を調べる
		compareDay(baseYear,baseMonth, baseDay, inputYear,inputMonth, inputDate);
	}
	
	/*
	 * 関数名:compareDay
	 * 概　要:2つの日付の時間関係を判定するクラスメソッド
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
			//判定結果を基準よりも後とする
			compareAnswer = compareAfter;
		}
		//基準の年よりも前の場合
		else if(baseYear>inputYear) {
			//判定結果を基準よりも前とする
			compareAnswer =compareBefore;
		}
		//基準の年と等しい場合
		else{
			//年内の経過日数が基準よりも多い場合
			if(Day.elapseDay(baseYear,baseMonth,baseDay)
					<Day.elapseDay(inputYear,inputMonth,inputDay)){
				//判定結果を基準よりも後とする
				compareAnswer = compareAfter;
			}
			//年内の経過日数が基準と等しい場合
			else if(Day.elapseDay(baseYear,baseMonth,baseDay)
					==Day.elapseDay(inputYear,inputMonth,inputDay)) {
				//判定結果を基準と等しいとする
				compareAnswer = compareSame;
			}
		}
		//比較していた２つの日付を表示する
		System.out.print(inputYear+"年"+inputMonth+"月"+inputDay+"日は"
						+baseYear+"年"+baseMonth+"月"+baseDay+"日");
		//判定結果が0の場合
		if(compareAnswer==0){
			//基準の日付よりも前の日付であることを表示する
			System.out.println("より前の日付です");
		}
		//判定結果が１の場合
		if(compareAnswer==1){
			//基準の日付よりも後の日付であることを表示する
			System.out.println("より後の日付です");
		}
		//判定結果が２の場合
		if(compareAnswer==2){
			//基準の日付と同じ日付であることを表示する
			System.out.println("同じ日付です");
		}
	}

	/*
	 * 関数名:nextDay
	 * 概　要:インスタンスの日付の次の日を新にインスタンスに代入する
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void nextDay() {
		//インスタンスから年を取得して変数に代入する
		int inputYear = getYear();
		//インスタンスから月を取得して変数に代入する
		int inputMonth= getMonth();
		//インスタンスから日付を取得して変数に代入する
		int inputDate = getDate();
		//うるう年の場合
		if(isLeep(inputYear)==true) {
			//指定した日付が月末の場合
			if(elapseArray_[inputMonth-1] == elapseDay(inputYear,inputMonth,inputDate)) {
				//12月の場合
				if(inputMonth == 12) {
					//来年にする
					inputYear++;
					//一月にする
					inputMonth=1;
					//一日にする
					inputDate =1;
				}
				//1月から11月の月末の場合
				else {
					//翌月にする
					inputMonth++;
					//一日にする
					inputDate = 1;
				}
			}
		}
		//うるう年でない場合
		else if(elapseArray[inputMonth-1] == elapseDay(inputYear,inputMonth,inputDate)) {
			//12月の場合
			if(inputMonth == 12) {
				//来年にする
				inputYear++;
				//一月にする
				inputMonth=1;
				//一日にする
				inputDate =1;
			}
			//1月から11月の月末の場合
			else {
				//翌月にする
				inputMonth++;
				//一日にする
				inputDate = 1;
			}
		}
		//月末以外の日の場合
		else {
			//次の日にする
			inputDate++;
		}
		
		//インスタンスの値を変更する
		//次の日の年を代入する
		setYear(inputYear);
		//次の日の月を代入する
		setMonth(inputMonth);
		//次の日の日にちを代入する
		setDate(inputDate);
	}
	/*
	 * 関数名:printBeforeDayN
	 * 概　要:インスタンスの日付の次の日を表示する
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void printAfterDay() {
		//もとの日付を表示
		System.out.printf("%2d年%2d月%2d日の次の日は\n",year,month,date);
		//次の日を取得
		nextDay();
		//次の日を表示する
		System.out.printf("%2d年%2d月%2d日\n",year,month,date);
	}

	/*
	 * 関数名:nextDay
	 * 概　要:インスタンスの日付のn日後を新にインスタンスに代入する
	 * 引　数:int型・n・何日日付を進めるか
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void nextNDay(int n) {
		//引数の回数分ループする
		for(int i=0 ; i<n; i++) {
			//インスタンスを次の日に変える
			nextDay();
		}
	}
	/*
	 * 関数名:printAfterDayN
	 * 概　要:インスタンスの日付のn日後の日を表示する
	 * 引　数:int型・n・何日日付を進めるか
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void printAfterDayN(int n) {
		//もとの日付からどれだけずらすかを表示
		System.out.printf("%2d年%2d月%2d日の%2d日後は\n",year,month,date, n);
		//ずらした後の日付を取得
		nextNDay(n);
		//ずらした後の日付を表示
		System.out.printf("%2d年%2d月%2d日\n",year,month,date);
	}
	
	
	//元旦から数えた月初めの経過日数を格納した配列（うるう年でない）
	static int[] earlyArray  = { 1,32,61, 92,122,152,183,214,245,275,306,336};
	//元旦から数えた月初めの経過日数を格納した配列（うるう年でない）
	static int[] earlyArray_  = {1,32,62, 93,123,153,184,215,246,276,307,337};
	/*
	 * 関数名:beforeDay
	 * 概　要:インスタンスの日付の前の日を新にインスタンスに代入する
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void beforeDay() {
		//インスタンスから年を取得して変数に代入する
		int inputYear = getYear();
		//インスタンスから月を取得して変数に代入する
		int inputMonth= getMonth();
		//インスタンスから日付を取得して変数に代入する
		int inputDate = getDate();
		
		//指定した日付が月はじめの場合
		if(earlyArray_[inputMonth-1] == elapseDay(inputYear,inputMonth,inputDate)
				|| earlyArray[inputMonth-1] == elapseDay(inputYear,inputMonth,inputDate)) {
			//1月の場合
			if(inputMonth == 1) {
				//去年にする
				inputYear--;
				//12月にする
				inputMonth=12;
				//31日にする
				inputDate =31;
			}
			//3月の場合
			else if(inputMonth-1==2) {
				//前の月にする
				inputMonth--;
				//うるう年の場合
				if(isLeep(inputYear)==true) {
					//29日にする
					inputDate = 29;
				}
				//うるう年でない場合
				else {
					//28日にする
					inputDate = 28;
				}
			}
			//4,6,9,11月の月初めの場合
			else if(inputMonth-1==4 || inputMonth-1==6 || inputMonth-1==9 || inputMonth-1==11){
				//前の月にする
				inputMonth--;
				//30日にする
				inputDate = 30;
			}
			//それ以外の月初めの場合
			else {
				//前の月にする
				inputMonth--;
				//31日にする
				inputDate=31;
			}
		}
		//月初めでない場合
		else {
			//前の日にする
			inputDate--;
		}
		//インスタンスの値を変更する
		//次の日の年を代入する
		setYear(inputYear);
		//次の日の月を代入する
		setMonth(inputMonth);
		//次の日の日にちを代入する
		setDate(inputDate);
	}
	/*
	 * 関数名:printBeforeDay
	 * 概　要:インスタンスの日付の前の日を表示する
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void printBeforeDay() {
		//もとの日付を表示
		System.out.printf("%2d年%2d月%2d日の前日は\n",year,month,date);
		//ずらした後の日付を取得
		beforeDay();
		//ずらした後の日付を表示
		System.out.printf("%2d年%2d月%2d日\n",year,month,date);
	}

	/*
	 * 関数名:beforeNDay
	 * 概　要:インスタンスの日付のn日前を新にインスタンスに代入する
	 * 引　数:int型・n・何日日付を戻すか
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void beforeNDay(int n) {
		//引数の回数分ループ
		for(int i=0 ; i<n; i++) {
			//前の日付に変える
			beforeDay();
		}
	}
	/*
	 * 関数名:printBeforeDayN
	 * 概　要:インスタンスの日付のn日前の日を表示する
	 * 引　数:int型・n・何日日付を進めるか
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void printBeforeDayN(int n) {
		//もとの日付からどれだけずらすかを表示
		System.out.printf("%2d年%2d月%2d日の%2d日前は\n",year,month,date,n );
		//ずらした後の日付を取得
		beforeNDay(n);
		//ずらした後の日付を表示
		System.out.printf("%2d年%2d月%2d日\n",year,month,date);
	}
}

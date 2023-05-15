package Ensyu15_8;
//カレンダークラスをインポートする
import static java.util.Calendar.*;

//GregorianCalendarをインポートする
import java.util.GregorianCalendar;

/**
 * Day<br>日付Dayクラス<br>
 * 作成日:2023/5/12
 * @author yuna
 */
public class Day {
	
	//各フィールドを初期化
	GregorianCalendar today = new GregorianCalendar();
	//西暦何年かを表すフィールド
	protected int year = today.get(YEAR);
	//月を表すフィールド
	protected int month = today.get(MONTH) +1;
	//日にちを表すフィールド
	protected int date  = today.get(DATE);
	
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
			//月を調整する変数を1で宣言
			int monthAdjust = 1;
			//月を1で調整する
			this.month = monthAdjust;
		}
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
	 * 関数名:isLeep
	 * 概　要:うるう年かどうかの判定をする
	 * 引　数:なし
	 * 戻り値:うるう年かどうか
	 * 作成日:2023/5/2
	 * */
	public static boolean isLeep(int y) {
		//うるう年の判定に用いる基準のひとつ
		final int BASE_NUMBER_A = 4;
		//うるう年の判定に用いる基準のひとつ
		final int BASE_NUMBER_B = 100;
		//うるう年の判定に用いる基準のひとつ
		final int BASE_NUMBER_C = 400;
		/* 4で割り切れて、かつ、100で割り切れなくて、または400で割り切れるような年
		をうるう年とする */
		return y%BASE_NUMBER_A==0 && y%BASE_NUMBER_B!=0 || y%BASE_NUMBER_C==0;
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
}

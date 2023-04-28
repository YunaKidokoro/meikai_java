package Ensyu9_2;
/*クラス名：Day
 * 概要:日付クラス
 * 作成日:2023/04/27
 * 作成者:城所佑奈
 * */
public class Day {
	//各フィールドを初期化
	//西暦何年かを表すフィールド
	private int year = 1;
	//月を表すフィールド
	private int month = 1;
	//日にちを表すフィールド
	private int date  = 1;
	
	//コンストラクタ・引数を受け取らない各フィールドは宣言時の値で初期化される
	//年月日を受け取らずにコンストラクタを定義
	public Day() {} 
	//年のみを受け取るコンストラクタ、不適当な値は１に調整する
	public Day(int year) {if(year<=0)year=1; this.year = year;} 
	//年・月のみを受け取るコンストラクタ、不適当な値は１に調整する
	public Day(int year, int month) {this(year); if(month<=0 || month>12)month=1; this.month = month;}
	//年・月・日を受け取るコンストラクタ
	public Day(int year, int month, int date) {this(year, month); this.date= date;} 
	//クラス型引数ｄの参照する値を受け取るコンストラクタ
	public Day(Day d) {this(d.year, d.month, d.date);} 
	
	//ゲッタ
	//年を取得
	public int getYear() { return year;}
	//月の取得
	public int getMonth() { return month;}
	//日にちの取得
	public int getDate() { return date;}
	
	//セッタ
	//年を設定
	public void setYear(int year) {this.year = year;}
	//月を設定
	public void setMonth(int month) {this.month = month;}
	//日にちを設定
	public void setDate(int date) {this.date = date;}
	
	//年・月・日を引数にしてまとめて設定
	public void set(int year, int month, int date) {
		//年を表すフィールドに仮引数を代入
		this.year = year;
		//月を表すフィールドに仮引数を代入
		this.month = month;
		//日を表すフィールドに仮引数を代入
		this.date = date;	
	}
	
	//曜日を求める
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
	
	//日付ｄと等しいか
	public boolean equalTo(Day d) {
		//フィールドの値をひとつずつ確認し、等しければtureを返す
		return year == d.year && month == d.month && date == d.date;
	}
	
	//文字列表現を返却
	public String toString() {
		//曜日を表す文字を格納する配列
		String[] wd = {"日","月","火","水","木","金","土"};
		//dayOfWeekメソッドで求めた値から曜日を表示する
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

}

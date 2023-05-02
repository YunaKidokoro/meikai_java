package Ensyu9_5;
import java.util.Scanner;

/*クラス名：Day
 * 概要:日付クラス
 * 作成日:2023/04/27
 * 作成者:城所佑奈
 * */
public class Day {
	static int compareResult = 0;
	static Scanner inputNumber = new Scanner(System.in);
	
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
		/*
		 * 関数名:getYear
		 * 概　要:年を取得
		 * 引　数:なし
		 * 戻り値:int型・year・取得した年を返す
		 * 作成日:2023/4/28
		 * */
		public int getYear() { return year;}
		/*
		 * 関数名:getMonth
		 * 概　要:月を取得
		 * 引　数:なし
		 * 戻り値:int型・month・取得した月を返す
		 * 作成日:2023/4/28
		 * */
		public int getMonth() { return month;}
		/*
		 * 関数名:getDate
		 * 概　要:日にちを取得
		 * 引　数:なし
		 * 戻り値:int型・date・取得した日にちを返す
		 * 作成日:2023/4/28
		 * */
		public int getDate() { return date;}
		
		//セッタ
		/*
		 * 関数名:setYear
		 * 概　要:年を設定
		 * 引　数:なし
		 * 戻り値:int型・year・設定した年を返す
		 * 作成日:2023/4/28
		 * */
		public void setYear(int year) {this.year = year;}
		/*
		 * 関数名:setMonth
		 * 概　要:月を設定
		 * 引　数:なし
		 * 戻り値:int型・year・設定した月を返す
		 * 作成日:2023/4/28
		 * */
		public void setMonth(int month) {this.month = month;}
		/*
		 * 関数名:getDate
		 * 概　要:日にちを設定
		 * 引　数:なし
		 * 戻り値:int型・year・設定した日を返す
		 * 作成日:2023/4/28
		 * */public void setDate(int date) {this.date = date;}
		
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
		/*
		 * 関数名：inputWhatDay
		 * 概要：日にちを入力させる、不適当な場合は繰り返す
		 * 引数：int型・inputYear, inputMonth・年と月
		 * 戻り値：int型・whatDay・入力された日にち
		 * 作成日：2023.04.28
		 * */
		public static  int inputWhatDay(int inputYear, int inputMonth) {
			//入力された日付を表す変数
			int whatDay = 1;
			Scanner inputNumber = new Scanner(System.in);
			//31日まである月の場合
			if(inputMonth==1 || inputMonth==3 || inputMonth==5 || inputMonth==7 ||
				inputMonth==8 || inputMonth==10 || inputMonth==12) {
				do {
					//入力された値を読み込む
					whatDay = inputNumber.nextInt();
					//0以下と32以上が入力させた場合
					if(whatDay>31 || whatDay<1) {
						//再入力を求める
						System.out.print("もう一度入力して下さい：");
					}
				//0以下と32以上が入力させると繰り返す
				}while(whatDay>31 || whatDay<1);
			}
			//30日までの月の場合
			else if(inputMonth != 2) {
				do {
					//入力された値を読み込む
					whatDay = inputNumber.nextInt();
					//31以上か0以下が入力された場合
					if(whatDay>30 || whatDay<1) {
						//再入力を求める
						System.out.print("もう一度入力して下さい：");				
					}
				//31以上か0以下が入力されると繰り返す
				}while(whatDay>30 || whatDay<1);
			}
			//2月の場合
			else {
				//うるう年の場合
				if(inputYear%4==0 &&(inputYear%100!=0 || inputYear%400==0)) {
					do {
						//入力された値を読み込む
						whatDay = inputNumber.nextInt();
						//0以下と30以上が入力させた場合
						if(whatDay>29 || whatDay<1) {
							//再入力を求める
							System.out.print("もう一度入力して下さい：");
						}
					//0以下と30以上が入力させると繰り返す
					}while(whatDay>29 || whatDay<1);
				}
				//うるう年じゃない
				else {
					do {
						//入力された値を読み込む
						whatDay = inputNumber.nextInt();
						//0以下と29以上が入力された場合
						if(whatDay>28 || whatDay<1) {
							//再入力を求める
							System.out.print("もう一度入力して下さい：");
						}
					//0以下と29以上が入力させると繰り返す
					}while(whatDay>28 || whatDay<1);
				}
			}
			//入力された日付を返す
			return whatDay;
		}
		/*
		 * 関数名:compareYear
		 * 概要:2つの日付の年を比較する
		 * 引数:開始日と終了日の年
		 * 戻り値:2つの年を比較して、
		 * 		　正しい時系列なら０、反転してれば１,同じ年なら２を返す
		 * 作成日:2023/5/2
		 * */
		public static int compareYear(int beforeYear, int afterYear){
			
			//未来のはずの年の方が過去の場合
			if(beforeYear>afterYear) {
				//戻り値を１にする
				compareResult = 1;
			}
			//同じ年の場合
			else if(beforeYear == afterYear) {
				//戻り値を２にする
				compareResult = 2;
			}
			//２つの日付が時間的に正しいかを数字に変えて返す
			return compareResult;
		}
		/*
		 * 関数名:compareMonth
		 * 概要:2つの日付の月を比較する
		 * 引数:開始日と終了日の年と月
		 * 戻り値:正しい時系列なら０、反転してれば１,同じ年なら２を返す
		 * 作成日:2023/5/2
		 * */
		public static int compareMonth(int beforeYear, int afterYear, 
				int beforeMonth, int afterMonth){
			
			//同じ年のとき
			if(compareYear(beforeYear,afterYear)==2) {
				//未来のはずの月の方が過去の場合
				if(beforeMonth>afterMonth) {
					//戻り値を１にする
					compareResult = 1;
				}
				//同じ月の場合
				else if(beforeMonth == afterMonth) {
					//戻り値を２にする
					compareResult = 2;
				}
				else{
				//未来のはずの月がちゃんと後の場合
				compareResult = 0;}
			}
			//２つの日付が時間的に正しいかを数字に変えて返す
			return compareResult;
		}
		/*
		 * 関数名:compareDay
		 * 概　要:2つの日付の日にちを比較する
		 * 引　数:開始日と終了日の年月日
		 * 戻り値:開始日の方が過去なら正を返す
		 * 作成日:2023/5/2
		 * */
		public static boolean compareDay(int beforeYear,int beforeMonth,int beforeDay,
				int afterYear,int afterMonth, int afterDay){
			//判定結果を表す変数を宣言
			boolean getAnswer = true;
			//月が同じ場合
			if(compareMonth(beforeYear,afterYear, beforeMonth,afterMonth)==2) {
				//未来のはずの日にちが過去の場合
				if(beforeDay > afterDay) {
					//判定結果を１とする
					compareResult = 1;
				}
			}
			//開始日が終了日よりも未来の場合
			if(compareResult == 1) {
				//判定結果をfalseに変える
				getAnswer = false;
			}
			//２つの日付が時間的に正しいか返す
			return getAnswer;
		}
}

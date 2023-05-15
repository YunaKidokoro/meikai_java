package Ensyu15_8;
/**
 * CalendarClass<br> Dayクラスの派生クラス<br>
 * 作成日:2023/5/15
 * @author yuna
 */
public class CalendarClass extends Day{

	//コンストラクタ・引数を受け取らない各フィールドは宣言時の値で初期化される
	//年月日を受け取らずにコンストラクタを定義
	public CalendarClass() {} 
	//年のみを受け取るコンストラクタ、不適当な値は現在の時間に調整する
	public CalendarClass(int year) {
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
	public CalendarClass(int year, int month){
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
	//年・月・日を受け取るコンストラクタ、不適当な値は１に調整する
		public CalendarClass(int year, int month, int day){
			//年と月を受け取るコンストラクタを参照
			this(year,month);
			//うるう年の2月で日にちが0以下、またはその月の最終日より大きい場合
			if(month==2&& isLeep(year)==true && day>monthlyDays_[month-1]) {
				//日にちを１で調整する
				this.date= 1;
			}
			//日にちが0以下、またはその月の最終日より大きい場合
			else if(day<1 || day>monthlyDays[month-1]) {
				//日にちを１で調整する
				this.date= 1;
			}	
		}
	
	//各月の日数を格納した配列(うるう年でない)
	static int[] monthlyDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	//各月の日数を格納した配列(うるう年)
	static int[] monthlyDays_ = {31,29,31,30,31,30,31,31,30,31,30,31};

	//カレンダーの行数を表す変数
	final int CALENDAR_LINE = 6;
	//カレンダーの列数を表す変数
	final int CALENDAR_ROWS = 7;
	//カレンダーのテンプレートになる配列を宣言する
	String[][] calendarArray = new String[CALENDAR_LINE][CALENDAR_ROWS]; 
	
	/**
	 * monthlyCalendar <br> カレンダーの曜日に従って日付を並べる
	 * @param なし
	 * @return calendarArray 曜日の順に日付の並んだ配列
	 * @author yuna
	 */
	public String[][] makeMonthlyCalendar(){
		//日付をカウントする変数
		int countDay = 1;
		//カレンダーの行のループ
		for(int i=0; i<calendarArray.length; i++) {
			//カレンダーの列のループ
			for(int j=0; j<calendarArray[i].length; j++) {
				//カレンダーでその月の最初の曜日の前を埋める
				//フィールドの月の一日の曜日より前の場合
				if(i==0 && j<dayOfWeek(year,month,1)) {
					//カレンダーのますに空白を入れておく
					calendarArray[i][j] = "";
				}
				//一日から月末までの場合
				else if(countDay<=monthlyDays_[month-1]) {
					//日付のカウントしている数値を文字列に変える
					String dayString = String.valueOf(countDay);
					//日付を格納する
					calendarArray[i][j] = dayString;
					
					//うるう年でない場合の2/29目の場合
					if(month==2&& isLeep(year)==false && countDay==29) {
						//空白を入れなおす
						calendarArray[i][j] = "";
						//日付をカウントして次の日を表す値へ
						countDay++;
					}
					//日付をカウントして次の日を表す値へ
					countDay++;
				}
				//月末まで格納し終わった場合
				else {
					//残りの配列に空白を格納しておく
					calendarArray[i][j] = "";
				}
			}
		}
		//適切な位置の配列に日付、または空白が格納された配列を返却する
		return calendarArray;
	}

	/**
	 * printCalendar<br>任意の月のカレンダーを表示する<br>
	 * 作成日:2023/5/12
	 * @author yuna
	 */
	public void printCalendar() {
		//何月のカレンダーかを表示する
		System.out.println(month+"月");
		//カレンダー用の配列を生成
		String[][] calendarArray = makeMonthlyCalendar();
		//曜日のインデックスを表示
		char dayOfWeek[] = {'日','月','火','水','木','金','土',};
		//曜日を表す配列をループ
		for(char charArray:dayOfWeek) {
			//曜日を日曜日から順に表示する
			System.out.printf("%3c",charArray);
		}
		//次に日にちを表示するために改行する
		System.out.println();
		//カレンダーの１行目からループ
		for(int i=0; i<calendarArray.length; i++) {
			//カレンダーの１列目からループ
			for(int j=0; j<calendarArray[i].length; j++) {
				//カレンダーの左上から順に適切な日付または空白を表示
				System.out.printf("%4s",calendarArray[i][j]);
			}
			//次の列を表示させるために改行する
			System.out.println();
		}
	}
	
	/**
	 * printYearCalendar<br>任意の年のカレンダーを表示する<br>
	 * 作成日:2023/5/12
	 * @author yuna
	 */
	public void printYearCalendar() {
		//一月から１２月までのループ
		for(int i=1 ; i<13; i++) {
			//フィールドの月の値を１月から１２月に変えていく
			this.month = i;
			//その月のカレンダーを表示する
			printCalendar();
		}
	}
	
}

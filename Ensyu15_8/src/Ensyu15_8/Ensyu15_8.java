package Ensyu15_8;

/**
 * Ensyu15_8<br>演習15-8<br>
 * 作成日:2023/5/12
 * @author yuna
 */
public class Ensyu15_8 {
	 /**
	 * main<br>コマンドライン引数からカレンダーを表示する<br>
	 * 月のみ→その月のカレンダー・年のみ→その年のカレンダー・なし→今月のカレンダー
	 * 作成日:2023/5/12
	 * @param args
	 * @return 無し
	 * @author yuna
	 */
	public static void main(String[]args) {
		 //引数がない場合
		 if(args.length == 0) {
			 //引数を渡さずにカレンダークラスのインスタンスを生成する
			 CalendarClass calendarInstance = new CalendarClass();
			 //カレンダーを表示する
			 calendarInstance.printCalendar();
		 }
		 //引数が２つの場合
		 if(args.length == 2) {
			 //引数をint型に変えて格納するための配列を生成
			 int[] argsIntArray = new int[2];
			 //引数の個数分ループする
			 for(int i=0; i<2; i++) {
				 //引数をint型に変えて配列に格納
				 argsIntArray[i] = Integer.parseInt(args[i]); 
			 }
			 //カレンダークラスのインスタンスを生成する
			 CalendarClass calendarInstance = new CalendarClass(argsIntArray[0],argsIntArray[1]);
			 //カレンダーを表示する
			 calendarInstance.printCalendar();
		 }
		 //引数が1つの場合
		 if(args.length == 1) {
			 //引数をint型に変えて格納するための配列を生成
			 int[] argsIntArray = new int[1];
			 ////引数をint型に変えて配列に格納
			 argsIntArray[0] = Integer.parseInt(args[0]); 
			//カレンダークラスのインスタンスを生成する
			 CalendarClass calendarInstance = new CalendarClass(argsIntArray[0]);
			//カレンダーを表示する
			 calendarInstance.printYearCalendar();
		 }
	}
}

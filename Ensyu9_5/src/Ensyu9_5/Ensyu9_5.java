package Ensyu9_5;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu9_5
 * 概要:演習9-5
 * 作成日:2023/5/1
 * 作成者:城所佑奈
 * */
public class Ensyu9_5 {
	//入力値を受け取る変数を宣言する
	static int inputYear=0, inputMonth=0, inputDay=0;
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputDate = new Scanner(System.in);
	
	/*
	 * 関数名：inputDate
	 * 概　要：年月日を入力される
	 * 引　数：なし
	 * 戻り値：なし
	 * 作成日：2023/5/1
	 * */
	static public void inputDate() {
		//何年からの入力を促す文を表示する
		System.out.print("何年：");
		//入力された年を変数に読み込む
		inputYear = inputDate.nextInt();
		//何月からの入力を促す文を表示する
		System.out.print("何月：");
		//入力された月を変数に読み込む
		inputMonth = inputDate.nextInt();
		//何日からの入力を促す文を表示する
		System.out.print("何日：");
		//入力された日にちを変数に読み込む
		inputDay = Day.inputWhatDay(inputYear, inputMonth);
	}
	/*
	 * 関数名:main
	 * 概　要:Periodクラスのテスト
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/5/1
	 * */
	public static void main(String[]args) {
		//開始日の入力を促す
		System.out.println("開始日を入力してください。");
		//年月日を入力させる
		inputDate();
		//入力された値を開始日のインスタンスに代入する
		Day startDay= Period.getFrom(new Day(inputYear,inputMonth , inputDay));
		//終了日の入力を促す
		System.out.println("終了日を入力してください。");
		//年月日を入力させる
		inputDate();
		//入力された値を終了日のインスタンスに代入する
		Day finishDay= Period.getFrom(new Day(inputYear,inputMonth , inputDay));
		//開始日と終了日のインスタンスを用いて期間を表すインスタンスに代入する
		Period period = new Period(startDay, finishDay);
		//開始日と終了日を表示する
		period.printPeriod();
	}
}

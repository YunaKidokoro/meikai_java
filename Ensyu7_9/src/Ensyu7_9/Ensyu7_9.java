package Ensyu7_9;
//Scannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_9
* 概要:演習7-9
* 作成者:城所佑奈
* 作成日:2023/04/19
* */
public class Ensyu7_9 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	/*
	 * 関数名:readPlusInt
	 * 概要:正の整数値の入力を求め、その値を返す
	 * 引数:なし
	 * 戻り値:int型・plusInteger・入力された値を表す変数
	 * 作成日:2023/04/19
	 * */
	static int readPlusInt() {
		//正の整数を表す変数を宣言
		int plusInteger = 0;
		do {
			//正の整数値の入力を促す文を表示
			System.out.print("正の整数値:");
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
		//入力が0以下の場合は繰り返す
		}while(plusInteger <=0);
		//入力された値を返す
		return plusInteger;
	}
	/*
	 * 関数名:main
	 * 概要:正の整数値の入力を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//入力された値を表示する
		System.out.println("入力した値は"+readPlusInt()+"です");
	}
}
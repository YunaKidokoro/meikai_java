package Ensyu5_2;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu5_2
 * 概要:演習5_2
 * 作成者:城所佑奈
 * 作成日:2023/04/13
 * */
public class Ensyu5_2 {
	/*
	 * 関数名:main
	 * 概要:float型の変数とdouble型の変数に値を読み込んで表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/13
	 * */
	public static void main (String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		//これから表示する変数の型を伝える分を表示する
		System.out.println("変数xはfloat型で、変数yはdouble型です");
		//変数xの値の入力を促す文を表示する
		System.out.print("x：");
		//xの値を読み込む
		float inputIntegerX = inputNumber.nextFloat();
		//変数yの値の入力を促す文を表示する
		System.out.print("y：");
		//変数yの値を読み込む
		double inputIntegerY = inputNumber.nextDouble();		
		//xの値を表示する
		System.out.println("x=" + inputIntegerX );
		//yの値を表示する
		System.out.println("y=" + inputIntegerY );
	}
}
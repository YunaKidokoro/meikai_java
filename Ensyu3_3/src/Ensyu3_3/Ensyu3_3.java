package Ensyu3_3;
//キーボードからの入力を行うためにjava.util.Scannerをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu3_3
 * 概要:演習問題3-3
 * 作成者:城所佑奈
 * 作成日:2023/04/06
 * */
public class Ensyu3_3 {
	/*
	 * 関数名:main
	 * 概要:入力された２つの値の関係の判定
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/06
	 * */
	public static void main(String[]args) {
		//変数に入力ストリームを読み込む
		Scanner inputNumber = new Scanner (System.in);
		//1つめの整数値の入力を促す。
		System.out.print("整数A:");
		//整数Aに入力された値を読み込む。
		int intengerA = inputNumber.nextInt();
		//2つめの整数値の入力を促す。
		System.out.print("整数B:");
		//整数Aに入力された値を読み込む。
		int intengerB = inputNumber.nextInt();
		//BがAの約数の場合
		if(intengerA % intengerB == 0)
			//Bが約数であったことを表示する
			System.out.println("BはAの約数です。");
		//BがAの約数でなかった場合
		else
			//Bが約数でなかったことを表示する
			System.out.println("BはAの約数ではありません。");
	}
}

package Ensyu2_8;
//ランダムな値を生成するためにRandamクラスをインポート
import java.util.Random;
//キーボードから入力するためにScannerクラスをインポート
import java.util.Scanner;
/*
* クラス名:Ensyu2_8
* 概要:演習2-8
* 作成者:城所佑奈
* 作成日:2023/04/05
* */
public class Ensyu2_8 {
	/*
	* 関数名:main
	* 概要:入力した値から±5の範囲のランダムな値を表示
	* 引数:なし
	* 戻り値:なし
	* 作成者:城所佑奈
	* 作成日:2023/04/05
	* */
	public static void main(String[]args) {
		//ランダムクラスのインスタンスを初期化する。
		Random randomNumber = new Random();
		//変数inputValueを用意して、入力ストリームを渡す。
		Scanner inputNumber = new Scanner (System.in);
		//整数値の入力を促す
		System.out.print("整数値:");
		//変数xに入力さえた値を読み込む。
		int inputValue = inputNumber.nextInt();
		//指定したい範囲の下限と上限を表す変数をそれぞれ用意する
		int lowerLimit, upperLimit;
		//下限の値を入力した値から-5した値で初期化する。
		lowerLimit = -inputValue -5;
		//上限の値を入力した値から+5した値で初期化する。
		upperLimit = inputValue +5;
		//入力した値から±5の範囲のランダムな値を生成する。
		int randomIntenger = randomNumber.nextInt(upperLimit)-lowerLimit;
		//生成されたランダムな値を表示する。
		System.out.println(lowerLimit + "から" + upperLimit + "の範囲のランダムな整数:"+ randomIntenger );
	}
}
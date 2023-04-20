package Ensyu7_8;
//Randomクラスをインポートする
import java.util.Random;
//Scannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_5
* 概要:演習7-5
* 作成者:城所佑奈
* 作成日:2023/04/19
* */
public class Ensyu7_8 {
	/*
	 * 関数名:random
	 * 概要:a以上b未満の乱数を生成する
	 * 引数:int型・a,b・乱数生成の範囲を決める変数
	 * 戻り値:int型・randomReturn・生成された乱数を返す
	 * 作成日:2023/04/19
	 * */
	static int random(int a, int b) {
		//ランダムクラスのインスタンスを初期化する
		Random randomNumber = new Random();
		//生成された乱数を表す変数を宣言
		int randomValue = a;
		//aの値がbの値より小さいとき、aからb-1の範囲で乱数を生成する
		if(a<b) {randomValue = randomNumber.nextInt(b-a)+a;}
		//生成された乱数を返す
		return randomValue;
	}
	/*
	 * 関数名:main
	 * 概要:入力した値の範囲で乱数を生成する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputValue = new Scanner(System.in);
		//整数の入力を促す文を表示
		System.out.print("a：");
		//入力された値を読み込む
		int lowLimit = inputValue.nextInt();
		//整数の入力を促す文を表示
		System.out.print("b：");
		//入力された値を読み込む
		int highLimit = inputValue.nextInt();
		//生成された乱数を表示する
		System.out.println(random(lowLimit, highLimit));
	}
}
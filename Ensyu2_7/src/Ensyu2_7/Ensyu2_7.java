package Ensyu2_7;
//ランダムな値を生成するためにjava.util.Randamをインポート
import java.util.Random;
/*
 * クラス名:Ensyu2_7
 * 概要:演習2-7
 * 作成者:城所佑奈
 * 作成日:2023/04/10
 * */
public class Ensyu2_7 {
	/*
	* 関数名:main
	* 概要:ランダムな値の生成
	* 引数:なし
	* 戻り値:なし
	* 作成者:城所佑奈
	* 作成日:2023/04/10
	* */
	public static void main(String[]args) {
		//ランダムクラスのインスタンスを初期化する。
		Random randomNumber = new Random();
		//一桁の正の整数を表す変数randomPlusIntengerにランダムな値を代入する。
		int randomPlusIntenger = randomNumber.nextInt(10)+1;
		//生成されたランダムな値を表示する。
		System.out.println("一桁のランダムな正の整数値："+randomPlusIntenger);
		//一桁の負の整数を表す変数randomMinusIntengerにランダムな値を代入する。
		int randomMinusIntenger = randomNumber.nextInt(9)+1;
		//生成されたランダムな値を表示する。
		System.out.println("一桁のランダムな負の整数値："+-randomMinusIntenger);
		//二桁の正の整数を表す変数TwoDigitIntengerにランダムな値を代入する。
		int twoDigitIntenger = randomNumber.nextInt(90)+10;
		//生成されたランダムな値を表示する。
		System.out.println("二桁のランダムな正の整数値:"+ twoDigitIntenger);
	}
}

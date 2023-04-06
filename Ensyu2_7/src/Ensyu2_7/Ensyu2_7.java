package Ensyu2_7;
//ランダムな値を生成するためにjava.util.Randamをインポート
import java.util.Random;
/*
 * クラス名:Ensyu2_7
 * 概要:演習2-7
 * 作成者:城所佑奈
 * 作成日:2023/04/05
 * */
public class Ensyu2_7 {
	/*
	* 関数名:main
	* 概要:ランダムな値の生成
	* 引数:なし
	* 戻り値:なし
	* 作成者:城所佑奈
	* 作成日:2023/04/05
	* */
	public static void main(String[]args) {
		//ランダムクラスのインスタンスを初期化する。
		Random RandomNumber = new Random();
		//一桁の正の整数を表す変数RandomPlusIntengerにランダムな値を代入する。
		int RandomPlusIntenger = RandomNumber.nextInt(10)+1;
		//生成されたランダムな値を表示する。
		System.out.println("一桁のランダムな正の整数値："+RandomPlusIntenger);
		//一桁の負の整数を表す変数RandomMinusIntengerにランダムな値を代入する。
		int RandomMinusIntenger = RandomNumber.nextInt(9)+1;
		//生成されたランダムな値を表示する。
		System.out.println("一桁のランダムな負の整数値："+-RandomMinusIntenger);
		//二桁の正の整数を表す変数TwoDigitIntengerにランダムな値を代入する。
		int TwoDigitIntenger = RandomNumber.nextInt(90)+10;
		//生成されたランダムな値を表示する。
		System.out.println("二桁のランダムな正の整数値:"+ TwoDigitIntenger);
	}
}

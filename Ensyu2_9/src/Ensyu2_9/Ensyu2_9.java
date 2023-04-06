package Ensyu2_9;
//ランダムな値を生成するためにjava.util.Randamをインポート
import java.util.Random;
/*
 * クラス名:Ensyu2_9
 * 概要:演習2-9
 * 作成者:城所佑奈
 * 作成日:2023/04/06
 * */
public class Ensyu2_9 {
	/*
	 * 関数名:main
	 * 概要:ランダムな実数値の生成
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/06
	 * */
	public static void main(String[]args) {
		//ランダムクラスのインスタンスを初期化する。
		Random RandomNumber = new Random();
		//0.0以上1.0未満の実数をランダムに生成する。
		Double RealNumber1 = RandomNumber.nextDouble(1.0);
		//生成されたランダムな値を表示する。
		System.out.println("0.0以上1.0未満の実数:"+ RealNumber1);
		//0.0以上10.0未満の実数をランダムに生成する。
		Double RealNumber2 = RandomNumber.nextDouble(10.0);
		//生成されたランダムな値を表示する。
		System.out.println("0.0以上10.0未満の実数:"+ RealNumber2);
		//-1.0以上1.0未満の実数をランダムに生成する。
		Double RealNumber3 = RandomNumber.nextDouble(1.0)-1.0;
		//生成されたランダムな値を表示する。
		System.out.println("-1.0以上1.0未満の実数:"+ RealNumber3);
	}
}

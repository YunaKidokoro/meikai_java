package Ensyu7_31;
//Randomクラスをインポートする
import java.util.Random;
/*
* クラス名:Ensyu7_31
* 概要:演習7-31
* 作成者:城所佑奈
* 作成日:2023/04/25
* */
public class Ensyu7_31 {
	//Randomクラスのインスタンスを初期化する
	static Random randomNumber = new Random();

	/*
	 * 関数名：absolute
	 * 概要:int型整数の絶対値を返す
	 * 　引数:int型・x・絶対値を求めたい値
	 * 戻り値:int型・absoluteNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static int absolute(int x) {
		//絶対値を表す変数を宣言する
		int absoluteNumber = x;
		//xが負の場合
		if(absoluteNumber<0) {
			//変数の絶対値を求める
			absoluteNumber = -x;
		}
		//絶対値を返す
		return absoluteNumber;
	}

	/*
	 * 関数名：absolute
	 * 概要:long型整数の絶対値を返す
	 * 　引数:long型・x・絶対値を求めたい値
	 * 戻り値:long型・absoluteNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static long absolute(long x) {
		//絶対値を表す変数を宣言する
		long absoluteNumber = x;
		//xが負の場合
		if(absoluteNumber<0) {
			//変数の絶対値を求める
			absoluteNumber = -x;
		}
		//絶対値を返す
		return absoluteNumber;
	}
	
	/*
	 * 関数名：absolute
	 * 概要:float型整数の絶対値を返す
	 * 　引数:float型・x・絶対値を求めたい値
	 * 戻り値:float型・absoluteNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static float absolute(float x) {
		//絶対値を表す変数を宣言する
		float absoluteNumber = x;
		//xが負の場合
		if(absoluteNumber<0) {
			//変数の絶対値を求める
			absoluteNumber = -x;
		}
		//絶対値を返す
		return absoluteNumber;
	}
	
	/*
	 * 関数名：absolute
	 * 概要:double型整数の絶対値を返す
	 * 　引数:double型・x・絶対値を求めたい値
	 * 戻り値:double型・absoluteNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static double absolute(double x) {
		//絶対値を表す変数を宣言する
		double absoluteNumber = x;
		//xが負の場合
		if(absoluteNumber<0) {
			//変数の絶対値を求める
			absoluteNumber = -x;
		}
		//絶対値を返す
		return absoluteNumber;
	}

	/*
	 * 関数名:main
	 * 概要:様々な整数型の値の絶対値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/25
	 * 作成者:城所佑奈
	 */
	public static void main(String[]argd) {
		//プログラムの説明文
		System.out.println("各数値型で絶対値を表示します");
		
		
		//int型の乱数を生成する
		int intInteger = randomNumber.nextInt();
		//数値型が何か表示
		System.out.println("int型");
		//乱数の絶対値を表示
		System.out.println(absolute(intInteger));
		
		
		//long型の範囲内の乱数を生成
		long longInteger = randomNumber.nextLong();
		//数値型が何か表示
		System.out.println("long型");
		//乱数の絶対値を表示
		System.out.println(absolute(longInteger));
		
		//float型で乱数を生成するときの下限を表す変数
		final float LOWER_LIMIT = -10;
		//float型で乱数を生成するときの上限を表す変数
		final float HIGHER_LIMIT = 10;
		//float型
		float floatInteger = randomNumber.nextFloat(LOWER_LIMIT+HIGHER_LIMIT+2)+LOWER_LIMIT;	
		//数値型が何か表示
		System.out.println("float型");
		//乱数の絶対値を表示
		System.out.println(absolute(floatInteger));
		
		//float型で乱数を生成するときの下限を表す変数
		final double LOWER_LIMIT_ = -10;
		//float型で乱数を生成するときの上限を表す変数
		final double HIGHER_LIMIT_ = 10;
		//double型
		double doubleInteger = randomNumber.nextDouble(LOWER_LIMIT_+HIGHER_LIMIT_+2)+LOWER_LIMIT_;
		//数値型が何か表示
		System.out.println("double型");
		//乱数の絶対値を表示
		System.out.println(absolute(doubleInteger));

	}
}

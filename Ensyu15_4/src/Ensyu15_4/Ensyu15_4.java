package Ensyu15_4;
//スキャナークラスをインポートする
import java.util.Scanner;
/**
 * Ensyu15_4<br> 演習15-4 <br>
 * 作成日：2023/5/11
 * @author yuna
 */
public class Ensyu15_4 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	
	/**
	 * inputNumber<br> double型の値を取得<br>
	 * 作成日：2023/5/11
	 * @param message 入力させたい値についての文字列
	 * @return double型の入力された値
	 * @author yuna
	 */
	static double inputNumber(String message) {
		//入力された値を読み込む変数
		double inputDouble = 0;
		//引数の文字列を表示して入力を促す
		System.out.print(message);
		//入力された値を変数によみこむ
		inputDouble = inputNumber.nextDouble();
		//入力値を返却する
		return inputDouble;
	}
	
	/**
	 * inputPlusNumber<br> int型の正の整数の値を取得する<br>
	 * 作成日：2023/5/11
	 * @param message
	 * @return 正の整数の入力値を返却
	 * @author yuna
	 */
	static int inputPlusNumber(String message) {
		//入力された値を読み込む変数
		int inputInteger = 0;
		//ループの開始
		do {
			//引数の文字列を表示して入力を促す
			System.out.print(message);
			//入力された値を変数によみこむ
			inputInteger = inputNumber.nextInt();
			//入力値が0以下の場合
			if(inputInteger<=0) {
				//再入力を求める
				System.out.println("もう一度入力して下さい。");
			}
		//入力値が0以下の場合は繰り返す
		}while(inputInteger<=0);
		//入力値を返却する
		return inputInteger;
	}
	
	/**
	 * printDouble<br> 
	 * 浮動小数点数値を小数点以下がｐ桁で、全体を少なくともw桁で表示する<br>
	 * 作成日：2023/5/11
	 * @param x 浮動小数点数値
	 * @param p 小数点以下の桁数
	 * @param w 全体の桁数
	 * @author yuna
	 */
	static void printDouble(double x, int p, int w) {
		//小数点以下がｐ桁で全体がw桁になるようにxを表示する
		System.out.printf(String.format("%%%d.%df\n",w,p), x);
	}
	
	/**
	 * main<br> printDoubleメソッドの確認<br>
	 * 作成日：2023/5/11
	 * @param args
	 * @return なし
	 * @author yuna
	 */
	public static void main(String[]args) {
		//浮動小数点数値を入力させて変数によみこむ
		double inputDouble = inputNumber("浮動小数点数値：");
		//小数点以下の桁数を入力させて変数によみこむ
		int pDigits = inputPlusNumber("小数点以下の桁数：");
		//全体の桁数を入力させて変数によみこむ
		int allDigits = inputPlusNumber("全体の最低桁数：");
		//浮動小数点数値を表示する
		printDouble(inputDouble,pDigits,allDigits);
	}
}

package Ensyu7_1;
//Sucannerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_1
 * 概要:演習7-1
 * 作成者:城所佑奈
 * 作成日:2023/02/19
 * */
public class Ensyu7_1 {
	/*
	 * メソッド名:stin0f
	 * 概要:入力された値の正負に応じて-1、0、1のいずれかを返す
	 * 引数:int型・n・整数の値を受け取る変数
	 * 戻り値:int型・returnValue・ｎの値が正なら1を負なら-1を0なら0を返す
	 * 作成者:城所佑奈
	 * 作成日:2023/02/19
	 * */
	static int stin0f(int n) {
		//戻り値を表す変数を宣言
		int returnValue = 0;
		//引数が0より大きい場合
		if (n>0) {
			//戻り値を１にする
			returnValue = 1;
		}
		//引数が0より小さい場合
		else if (n<0) {
			//戻り値を-１にする
			returnValue = -1;
		}
		//戻り値としてreturnValueの値を返す
		return returnValue;
	}
	
	/*
	 * 関数名:main
	 * 概要:入力された値の正負に応じて-1、0、1のいずれかを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		//入力されたに対して-1、0、1のいずれかを表示することを説明
		System.out.println("入力した値が正なら１を負なら－１を\n０なら０を表示します");
		//値の入力を促す文を表示
		System.out.print("整数：");
		//入力された値を読み込む
		int inputInteger = inputNumber.nextInt();
		//入力された値に応じた値を表示する
		System.out.println(stin0f(inputInteger));	
	}
}

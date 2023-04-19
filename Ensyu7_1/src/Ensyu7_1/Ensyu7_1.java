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
	//引数の正負に応じて-1、0、1を返すメソッドを作る
	//メソッド名や引数は教本の指示に従った命名
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
	 * 引数:inputInteger, 入力させた整数を表す
	 * 戻り値:returnValue、入力した値が正なら1を負なら-1を0なら0を返す
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

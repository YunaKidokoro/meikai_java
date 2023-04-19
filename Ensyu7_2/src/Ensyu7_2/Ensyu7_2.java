package Ensyu7_2;
//Sucannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_2
* 概要:演習7-2
* 作成者:城所佑奈
* 作成日:2023/02/19
* */
public class Ensyu7_2 {
	//3つのint型の引数の最小値を求めるメソッド
	//メソッド名や引数は教本の指示に従った命名
	static int min(int a, int b, int c) {
		//最小値を表す変数を前言（仮にaが最小とする）
		int minimumValue = a;
		//仮の最小値がbよりaが大きい場合
		if (minimumValue>b) {
			//最小値をbに変える
			minimumValue = b;
		}
		//仮の最小値がcより大きい場合
		if (minimumValue>c) {
			//最小値をcに変える
			minimumValue = c;
		}
		//戻り値としてminimumValueの値を返す
		return minimumValue;
	}
	
	/*
	 * 関数名:main
	 * 概要:入力された3つの値の最小値を表示する
	 * 引数:inputIntegerA,inputIntegerB,inputIntegerC、入力された３つの値
	 * 戻り値:minimumValue、引数のうち最小値の値を返す
	 * 作成者:城所佑奈
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		//入力されたの中の最小値を表示することを説明
		System.out.println("3つの整数の最小値を表示します");
		//値の入力を促す文を表示
		System.out.print("整数a：");
		//入力された値を読み込む
		int inputIntegerA = inputNumber.nextInt();
		System.out.print("整数b：");
		//入力された値を読み込む
		int inputIntegerB = inputNumber.nextInt();
		System.out.print("整数c：");
		//入力された値を読み込む
		int inputIntegerC = inputNumber.nextInt();
		
		//入力された値の最小値を表示する
		System.out.println(min(inputIntegerA,inputIntegerB,inputIntegerC));	
	}
}
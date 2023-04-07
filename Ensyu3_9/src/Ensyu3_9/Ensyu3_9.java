package Ensyu3_9;

import java.util.Scanner;

//キーボードからの入力を行うためにjava.util.Scannerをインポート
/*
 * クラス名:Ensyu3_9
 * 概要:演習3-9
 * 作成者:城所佑奈
 * 作成日:2023/04/07
 * */
public class Ensyu3_9 {
	/*
	 * 関数名:main
	 * 概要:入力された値の大小を比較し大きいほうを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/07
	 * */
	public static void main(String[]ars) {
		//変数に入力ストリームを渡す
		Scanner InputNumber = new Scanner(System.in);
		//１つめの実数の入力を促す。
		System.out.print("整数a:");
		//入力された値を読み込む
		int IntengerA = InputNumber.nextInt();
		//2つめの実数の入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int IntengerB = InputNumber.nextInt();
		//２つの実数値の大きさを比較する。
		//2つの値は同値
		if (IntengerA == IntengerB)
			System.out.println("整数aと整数bは同値です。。");
		//aの方が大きい場合。
		else if(IntengerA > IntengerB)
			System.out.println("大きいほうの値は"+ IntengerA +"です。");
		//bの方が大きい場合。
		else 
			//大きいほうの値を表示する。
			System.out.println("大きいほうの値は"+ IntengerB +"です。");
	}
}

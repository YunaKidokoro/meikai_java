package Ensyu3_14;
//キーボードからの入力を行うためにjava.util.Scannerをインポートする
import java.util.Scanner;
	/*
	* クラス名:Ensyu3_14
	* 概要:演習3-14
	* 作成者:城所佑奈
	* 作成日:2023/04/07
	* */
public class Ensyu3_14 {
	/*
	 * 関数名:main
	 * 概要入力された値の大きいほうと小さいほうで表示する。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/07
	 * */
	public static void main(String[]args) {
		//変数に入力ストリームを渡す。
		Scanner InputNumber = new Scanner(System.in);
		//変数aの入力を促す。
		System.out.print("整数a:");
		//入力された値を読み込む。
		int inputIntegerA = InputNumber.nextInt();
		
		//変数bの入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int inputIntegerB = InputNumber.nextInt();
			
		//整数aとbのどちらが大きいかを判定する。
		if(inputIntegerA>inputIntegerB) {
			System.out.println("大きいほうの値は："+inputIntegerA 
					+"\n小さいほうの値は："+inputIntegerB);
		}
		else if(inputIntegerA<inputIntegerB) {
			System.out.println("大きいほうの値は："+inputIntegerB 
					+"\n小さいほうの値は："+inputIntegerA);
		}
		else
			System.out.println("二つの値は同じです。");
	}
}

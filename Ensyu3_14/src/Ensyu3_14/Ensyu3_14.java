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
		int IntengerA = InputNumber.nextInt();
		
		//変数bの入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int IntengerB = InputNumber.nextInt();
			
		//整数aとbのどちらが大きいかを判定する。
		if(IntengerA>IntengerB) {
			System.out.println("大きいほうの値は："+IntengerA 
					+"\n小さいほうの値は："+IntengerB);
		}
		else if(IntengerA<IntengerB) {
			System.out.println("大きいほうの値は："+IntengerB 
					+"\n小さいほうの値は："+IntengerA);
		}
		else
			System.out.println("二つの値は同じです。");
	}
}

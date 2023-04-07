package Ensyu3_12;
//キーボードからの入力を行うためにjava.util.Scannerをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu3_12
 * 概要:演習3-12
 * 作成者:城所佑奈
 * 作成日:2023/04/07
 * */
public class Ensyu3_12 {
	/*
	 * 関数名:main
	 * 概要:最小値を求める。
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
		//変数cの入力を促す。
		System.out.print("整数c:");
		//入力された値を読み込む。
		int IntengerC = InputNumber.nextInt();
		//最小値を表す変数MinimumValueを整数aの値で初期化する。
		int MinimumValue = IntengerA;
		//MinimumValueと整数bの大きさを比較する。
		if(MinimumValue > IntengerB)
			//MinimumValueに整数bの値を代入する。
			MinimumValue = IntengerB;
		else;
		//MinimumValueと整数ｃの大きさを比較する。
		if(MinimumValue > IntengerC)
			//MinimumValueに整数ｃの値を代入する。
			MinimumValue = IntengerC;
		else;
		//最小値を表示する。
		System.out.println("最小値は"+ MinimumValue +"です。");
	}
}

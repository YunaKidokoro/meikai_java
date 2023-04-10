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
		Scanner inputNumber = new Scanner(System.in);
		//変数aの入力を促す。
		System.out.print("整数a:");
		//入力された値を読み込む。
		int inputIntegerA = inputNumber.nextInt();
		//変数bの入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int inputIntegerB = inputNumber.nextInt();
		//変数cの入力を促す。
		System.out.print("整数c:");
		//入力された値を読み込む。
		int inputIntegerC = inputNumber.nextInt();

		//最小値を表す変数MinimumValueを整数aの値で初期化する。
		int minimumValue = inputIntegerA;
		//minimumValueと整数bの大きさを比較する。
		//整数ｂが仮の最小値よりも小さい場合
		if(minimumValue > inputIntegerB)
			//minimumValueに整数bの値を代入する。
			minimumValue = inputIntegerB;
		//整数ｂが仮の最小値よりも大きい場合
		else;	//この場合にはなにも実行しない

		//minimumValueと整数ｃの大きさを比較する。
		//整数ｃが仮の最小値よりも小さい場合
		if(minimumValue > inputIntegerC)
			//minimumValueに整数ｃの値を代入する。
			minimumValue = inputIntegerC;
		//整数ｃが仮の最小値よりも大きい場合
		else;	//この場合にはなにも実行しない

		//最小値を表示する。
		System.out.println("最小値は"+ minimumValue +"です。");
	}
}

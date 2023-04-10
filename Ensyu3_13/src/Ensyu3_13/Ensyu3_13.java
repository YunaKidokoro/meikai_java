package Ensyu3_13;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
* クラス名:Ensyu3_13
* 概要:演習3-13
* 作成者:城所佑奈
* 作成日:2023/04/07
* */
public class Ensyu3_13 {
	/*
	 * 関数名:main
	 * 概要:中央値を求める。
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
		int intengerA = inputNumber.nextInt();
		
		//変数bの入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int intengerB = inputNumber.nextInt();
		
		//変数cの入力を促す。
		System.out.print("整数c:");
		//入力された値を読み込む。
		int intengerC = inputNumber.nextInt();
		
		//中央値を表す変数CenterValueを宣言する。
		int centerValue = intengerA; //仮に整数aが中央値として初期化する。
		
		//入力された値は2つ以上同じ場合
		//整数aと整数bが同じ値の場合。
		if (intengerA == intengerB)
			//中央値に2つ以上ある値を代入
			centerValue = intengerA;
		//整数aと整数cが同じ値の場合
		else if(intengerA == intengerC)
			//中央値に2つ以上ある値を代入
			centerValue = intengerC;
		//整数bと整数cが同じ値の場合
		else if(intengerB == intengerC)
			//中央値に2つ以上ある値を代入
			centerValue = intengerB;
		
		//入力された値がすべて異なるとき。
		//最小値を表す変数minimumValueを整数aの値で初期化する。
		int minimumValue = intengerA;
		//最大値を表す変数maximumValueを整数aの値で初期化する。
		int maximumValue = intengerA;
		
		//整数bが整数aよりも大きい場合
		if (intengerB > maximumValue)		maximumValue = intengerB;
		else;
		//整数cが整数aよりも大きい場合
		if (intengerC > maximumValue)		maximumValue = intengerC;
		else;
		//整数bが整数aよりも小さい場合
		if (minimumValue > intengerB)		minimumValue = intengerB;
		else;
		//整数cが整数aよりも小さい場合
		if (minimumValue > intengerC)		minimumValue = intengerC;
		else;
		
		//整数aが最小値でも最大値でもないなら中央値になる。
		if(intengerA != minimumValue && intengerA != maximumValue)
			//この条件を満たす場合の中央値はＡ
			centerValue = intengerA;

		//整数bが最小値でも最大値でもない場合。
		else if(intengerB != minimumValue && intengerB != maximumValue)
			//この条件を満たす場合の中央値はB
			centerValue = intengerB;

		//整数cが最小値でも最大値でもないなら中央値になる。
		else if(intengerC != minimumValue && intengerC != maximumValue)
			//この条件を満たす場合の中央値はC
			centerValue = intengerC;
		//中央値をひょうじする。
		System.out.println("中央値は"+centerValue+"です。");
	}
}

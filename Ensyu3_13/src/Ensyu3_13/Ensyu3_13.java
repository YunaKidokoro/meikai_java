package Ensyu3_13;
//キーボードからの入力を行うためにjava.util.Scannerをインポートする。
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
		
		//中央値を表す変数CenterValueを宣言する。
		int CenterValue = IntengerA; //仮に整数aが中央値として初期化する。
		
		//入力された値は2つ以上同じとき
		//整数aと整数bが同じ値の場合。
		if (IntengerA == IntengerB)
			CenterValue = IntengerA;
		//整数aと整数cが同じ値の場合
		else if(IntengerA == IntengerC)
			CenterValue = IntengerC;
		//整数bと整数cが同じ値の場合
		else if(IntengerB == IntengerC)
			CenterValue = IntengerB;
		
		//入力された値がすべて異なるとき。
		//最小値を表す変数MinimumValueを整数aの値で初期化する。
		int MinimumValue = IntengerA;
		//最大値を表す変数MaximumValueを整数aの値で初期化する。
		int MaximumValue = IntengerA;
		
		//整数bが整数aよりも大きいとき
		if (IntengerB>MaximumValue)		MaximumValue = IntengerB;
		else;
		//整数cが整数aよりも大きいとき
		if (IntengerC>MaximumValue)		MaximumValue = IntengerC;
		else;
		//整数bが整数aよりも小さいとき
		if (MinimumValue>IntengerB)		MinimumValue = IntengerB;
		else;
		//整数cが整数aよりも小さいとき
		if (MinimumValue>IntengerC)		MinimumValue = IntengerC;
		else;
		
		//整数aが最小値でも最大値でもないなら中央値になる。
		if(IntengerA != MinimumValue && IntengerA != MaximumValue)
			CenterValue = IntengerA;
		//整数bが最小値でも最大値でもないなら中央値になる。
		else if(IntengerB != MinimumValue && IntengerB != MaximumValue)
			CenterValue = IntengerB;
		//整数cが最小値でも最大値でもないなら中央値になる。
		else if(IntengerC != MinimumValue && IntengerC != MaximumValue)
			CenterValue = IntengerC;
		
		System.out.println("中央値は"+CenterValue+"です。");
	}
}

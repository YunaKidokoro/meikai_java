package Ensyu3_16;
//キーボードからの入力を行うためにjava.util.Scannerをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu3_16
* 概要:演習3-16
* 作成者:城所佑奈
* 作成日:2023/04/07
* */
public class Ensyu3_16 {
	/*
	 * 関数名:main
	 * 概要入力された3つの値を昇順にソートする。
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
		//変数bの入力を促す。
		System.out.print("整数c:");
		//入力された値を読み込む。
		int IntengerC = InputNumber.nextInt();
		

		//値の入れ替え用の仮置き用変数を宣言する。
		int OnlynowNumber;
		
		//入力された整数の大小を判定する。
        //aとbを比較
		if (IntengerA > IntengerB) {
			//整数aの値を仮置きしておく
	    	OnlynowNumber = IntengerA;
	    	//整数aとbの値を入れ替える
	    	IntengerA = IntengerB;
	    	//整数bにもともとのaの値を入れる
	    	IntengerB = OnlynowNumber;
	    	}
			//0番目と2番目を比較
		if (IntengerA > IntengerC) {
				//整数aの値を仮置きしておく
			OnlynowNumber = IntengerA;
			//整数aとcの値を入れ替える
			IntengerA = IntengerC;
			//整数cにもともとのaの値を入れる
			IntengerC = OnlynowNumber;
			}
		
		//1番目と2番目を比較
		if (IntengerB > IntengerC) {
			//整数bの値を仮置きしておく
			OnlynowNumber = IntengerB;
			//整数bとcの値を入れ替える
			IntengerB = IntengerC;
			//整数cにもともとのbの値を入れる
			IntengerC =OnlynowNumber;
			}

		System.out.println("昇順にソートしました。");
		System.out.println("整数aは"+IntengerA+"です。");
		System.out.println("整数bは"+IntengerB+"です。");
		System.out.println("整数cは"+IntengerC+"です。");	
	}
}
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
		Scanner inputNumber = new Scanner(System.in);
		//変数aの入力を促す。
		System.out.print("整数a:");
		//入力された値を読み込む。
		int inputIntegerA = inputNumber.nextInt();
		//変数bの入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int inputIntegerB = inputNumber.nextInt();
		//変数bの入力を促す。
		System.out.print("整数c:");
		//入力された値を読み込む。
		int inputIntegerC = inputNumber.nextInt();
		

		//値の入れ替え用の仮置き用変数を宣言する。
		int onlyNowNumber;
		
		//入力された整数の大小を判定する。
        //aとbを比較
		if (inputIntegerA > inputIntegerB) {
			//整数aの値を仮置きしておく
	    	onlyNowNumber = inputIntegerA;
	    	//整数aとbの値を入れ替える
	    	inputIntegerA = inputIntegerB;
	    	//整数bにもともとのaの値を入れる
	    	inputIntegerB = onlyNowNumber;
	    	}
			//0番目と2番目を比較
		if (inputIntegerA > inputIntegerC) {
			//整数aの値を仮置きしておく
			onlyNowNumber = inputIntegerA;
			//整数aとcの値を入れ替える
			inputIntegerA = inputIntegerC;
			//整数cにもともとのaの値を入れる
			inputIntegerC = onlyNowNumber;
			}
		
		//1番目と2番目を比較
		if (inputIntegerB > inputIntegerC) {
			//整数bの値を仮置きしておく
			onlyNowNumber = inputIntegerB;
			//整数bとcの値を入れ替える
			inputIntegerB = inputIntegerC;
			//整数cにもともとのbの値を入れる
			inputIntegerC =onlyNowNumber;
			}
		
		System.out.println("昇順にソートしました。");
		System.out.println("整数aは"+inputIntegerA+"です。");
		System.out.println("整数bは"+inputIntegerB+"です。");
		System.out.println("整数cは"+inputIntegerC+"です。");	
	}
}
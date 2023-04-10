package Ensyu4_3;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_3
 * 概要:演習4-3
 * 作成者:城所佑奈
 * 作成日:2023/04/10
 * */
public class Ensyu4_3 {
	/*
	 * 関数:main
	 * 概要:入力された2つの値の間の数字を順に表示する。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/10
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//整数Aの入力を行う促す
		System.out.print("整数A：");
		//入力された値を変数に読み込む
		int inputIntegerA = inputNumber.nextInt();
		//整数Bの入力を行う促す
		System.out.print("整数B：");
		//入力された値を変数に読み込む
		int inputIntegerB = inputNumber.nextInt();
		//整数の大きさを比較する
		if(inputIntegerA > inputIntegerB) {
		//整数Aの方が大きいとき
		//整数Aの値を仮置きする変数宣言
			int OnlyNowNumber;
			//整数Aの値を仮置き。
			OnlyNowNumber = inputIntegerA;
			//整数AにBの値を入れ替える。
			inputIntegerA = inputIntegerB;
			//整数Bに元の整数Aの値を入れる。
			inputIntegerB = OnlyNowNumber;
		}
		else;	
			
		//ループを開始
		do {	
			//整数Aの値に数を加えつつ表示
			System.out.print(inputIntegerA+" ");
			//整数Aの値に次の整数の値を代入
			inputIntegerA = inputIntegerA+1;
			//整数Aの大きさがBと一致するまでループする。
		}while(inputIntegerA != inputIntegerB+1 );
	}

}

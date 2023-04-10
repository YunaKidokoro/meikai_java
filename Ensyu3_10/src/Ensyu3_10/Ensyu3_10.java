package Ensyu3_10;
//キーボードからの入力を行うためにjava.util.Scannerをインポート
import java.util.Scanner;
/*
 * クラス名:Ensyu3_10
 * 概要:演習3-10
 * 作成者:城所佑奈
 * 作成日:2023/04/07
 * */
public class Ensyu3_10 {
	/*
	 * 関数名:main
	 * 概要:入力された値の差を表示する。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/07
	 * */
	public static void main(String[]ars) {
		//変数に入力ストリームを渡す
		Scanner inputNumber = new Scanner(System.in);
		//１つめの実数の入力を促す。
		System.out.print("整数a:");
		//入力された値を読み込む
		int intengerA = inputNumber.nextInt();
		//2つめの実数の入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int intengerB = inputNumber.nextInt();
		//差分を表す変数を宣言
		int differenceValue; 
		//入力された値の大小を判定
		if(intengerA>intengerB)
			//整数aの方が大きいときの差を求める
			differenceValue = intengerA - intengerB;
		else
			//整数bの方が大きいときの差を求める
			differenceValue = intengerB - intengerA;
		//入力された値の差を表示する。
		System.out.println("2つの整数の差は"+ differenceValue +"です。");
	}
}
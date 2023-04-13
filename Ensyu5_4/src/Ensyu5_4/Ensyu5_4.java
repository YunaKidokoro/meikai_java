package Ensyu5_4;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu5_4
 * 概要:演習5_4
 * 作成者:城所佑奈
 * 作成日:2023/04/13
 * */
public class Ensyu5_4 {
	/*
	 * 関数名:main
	 * 概要:3つの入力された値から合計と平均を求めて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/13
	 * */
	public static void main (String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);

		//入力された値の合計と平均を求める
		System.out.println("入力された値の合計と平均を求めます。");
		
		//入力された値を読み込むための変数の宣言
		int firstInteger = 0, secondInteger = 0, thirdInteger =0;
		//ループ回数を数える変数を宣言
		int countValue = 0;
		
		
		//値の入力を求める
		System.out.print("整数a:");
		//入力された値を読み込む
		firstInteger  = inputNumber.nextInt();
		//値の入力を求める
		System.out.print("整数b:");
		//入力された値を読み込む
		secondInteger = inputNumber.nextInt();
		//値の入力を求める
		System.out.print("整数c:");
		//入力された値を読み込む
		thirdInteger = inputNumber.nextInt();
		//ループ回数を数える
		countValue++;
		
		//合計を計算する
		int totalValue   = firstInteger + secondInteger + thirdInteger;
		//平均を計算する、int型をdouble型で割ってるので、平均はdouble型になる
		double averageValue = totalValue/3.0;
		
		//合計と平均を表示をする
		System.out.println("合計は " + totalValue +"\n平均は"+averageValue);
	}
}
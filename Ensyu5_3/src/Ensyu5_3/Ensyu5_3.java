package Ensyu5_3;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu5_3
 * 概要:演習5_3
 * 作成者:城所佑奈
 * 作成日:2023/04/13
 * */
public class Ensyu5_3 {
	/*
	 * 関数名:main
	 * 概要:論理型の変数にtrueやfalseを代入してその値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/12
	 * */
	public static void main (String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		//論理型の変数を宣言する
		boolean bool = false;
		//入力された値の大小比較をする
		System.out.println("入力された整数の大きさを比較します。");
		
		//入力された値を読み込むための変数の宣言
		double firstInteger = 0, secondInteger = 0;
		//ループ回数を数える変数を宣言
		int countValue = 0;
		
		//ループの開始
		do {
			//2回目以降のループの場合
			if(countValue!=0) {
				//再入力を求める表示を行う
				System.out.println("もう一度入力してください。");
			}
			//値の入力を求める
			System.out.print("整数a:");
			//入力された値を読み込む
			firstInteger  = inputNumber.nextDouble();
			//値の入力を求める
			System.out.print("整数b:");
			//入力された値を読み込む
			secondInteger = inputNumber.nextDouble();
			//ループ回数を数える
			countValue++;
		//小数点以下を含むのであればもう一度入力させる
		}while(firstInteger%1 !=0 || secondInteger%1 !=0);
		
		//論理型変数の条件を整数aの方が小さいときに正となる、と決める
		bool = firstInteger < secondInteger;
		//判定結果の表示をする
		System.out.println("a < b = " + bool);
	}
}
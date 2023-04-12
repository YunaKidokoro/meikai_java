package Ensyu4_4;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_4
 * 概要:演習4-4
 * 作成者:城所佑奈
 * 作成日:2023/04/10
 * */
public class Ensyu4_4 {
	/*
	 * 関数:main
	 * 概要:読み込んだ正の整数値からカウントダウンするプログラムで
	 * 	while文終了時にxの値が－1になることを確認する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/10
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//カウントダウンを行うことを表示
		System.out.println("カウントダウンします。");
		//入力された値を読み込むための変数を宣言する。
		//演習の内容が「ｘの値が－1になることを確認する」なのでこの名前
		int x;
		//ループを開始
		do {	
			//正の整数値の入力を促す文を表示する
			System.out.print("正の整数値：");
			//変数ｘに入力された値を読み込む。
			x = inputNumber.nextInt();
		}while(x <= 0); //xの値が負の数なら繰り返す。
		
		//xの値が0になるまで繰り返すループを開始
		while (x >= 0) {
			//xの値を表示する
			System.out.println(x);
			//ｘの値をデクリメント
			x--;
		} 
		//while文終了後のｘの値を確認する。
		System.out.print("x=" + x);
	}
}
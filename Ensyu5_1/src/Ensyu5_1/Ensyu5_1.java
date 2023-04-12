package Ensyu5_1;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu5_1
 * 概要:演習5_1
 * 作成者:城所佑奈
 * 作成日:2023/04/12
 * */
public class Ensyu5_1 {
	/*
	 * 関数名:main
	 * 概要:10進数整数を読み込んで8進数と16進数で表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/12
	 * */
	public static void main (String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		//整数の入力を促す文を表示する
		System.out.print("整数：");
		//整数を読み込む
		int inputInteger = inputNumber.nextInt();
		//8進数で表示する
		System.out.printf(" 8進数では%oです\n",inputInteger );
		//16進数で表示する
		System.out.printf("16進数では%xです\n",inputInteger );
	}
}
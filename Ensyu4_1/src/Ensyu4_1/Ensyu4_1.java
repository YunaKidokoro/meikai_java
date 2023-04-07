package Ensyu4_1;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名
 * 概要
 * 作成者
 * 作成日
 * */
public class Ensyu4_1 {
	/*
	 * 関数名
	 * 概要
	 * 引数
	 * 戻り値
	 * 作成者
	 * 作成日
	 * */
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		int Retry;
		do {
			System.out.print("整数値:");
			int n = stdIn.nextInt();
			if(n>0)
				System.out.println("その値は正です。");
			else if(n<0)
				System.out.println("その値は負です。");
			else
				System.out.println("その値は0です。");
			System.out.print("もう一度？ 1...Yes/0...No:");
			Retry = stdIn.nextInt();
		}while(Retry==1);
	}
}

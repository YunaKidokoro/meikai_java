package Ensyu4_1;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_1
 * 概要:Ensyu4_1
 * 作成者:城所佑奈
 * 作成日:2023/04/12
 * */
public class Ensyu4_1 {
	/*
	 * 関数名:main
	 * 概要:入力値の正負判定
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/12
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner stdIn = new Scanner(System.in);
		//繰り返すかを判断するための変数を宣言
		int retryValue;
		//ループの開始
		do {
			//整数の入力を促す文を表示する
			System.out.print("整数値:");
			//入力された値を読み込む
			int inputNumber = stdIn.nextInt();
			//入力された値が0より大きい場合
			if(inputNumber>0)
				//入力された値が正であると表示する
				System.out.println("その値は正です。");
			//入力された値が0より小さい場合
			else if(inputNumber<0)
				//入力された値が負であると表示する
				System.out.println("その値は負です。");
			//入力された値が0の場合
			else
				//入力された値が0であると表示する
				System.out.println("その値は0です。");
			//もう一度行うかの確認文の表示
			System.out.print("もう一度？ 1...Yes/1以外の数字...No:");
			retryValue = stdIn.nextInt();
		}while(retryValue ==1);
		//終了したことを表示
		System.out.print("終了");
	}
}

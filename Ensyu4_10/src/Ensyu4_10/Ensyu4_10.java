package Ensyu4_10;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_10
 * 概要:演習4-10
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_10 {
	/*
	 * 関数:main
	 * 概要:読み込んだ個数だけ＊を表示して入力が１未満のときに改行しない
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/11
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//入力された値を読み込む変数を宣言
		int starValue;
		//ループの回数を数える変数を用意する
		int countNumber = 0 ;
		//ループの開始
		do {
			//ループ回数が１以上の場合
			if(countNumber >= 1) {
				//入力を促す文を表示する
				System.out.println("正の整数値を入力してください。");
			}
			//カウント数を増やす
			countNumber++;
			
			//＊の数の入力を促す文を表示
			System.out.print("何個*を表示しますか：");
			//入力された値を読み込む
			starValue = inputNumber.nextInt(); 
			
		}while(starValue < 0);	//入力された値が負の場合は繰り返し入力を求める。
		
		for(int i=0; i<starValue ;i++ ) {
			System.out.print("*");			
		}
		//最後の＊が入力されたら改行を行う
		System.out.println();
		
	}

}
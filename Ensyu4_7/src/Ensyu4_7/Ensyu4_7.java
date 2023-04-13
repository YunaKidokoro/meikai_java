package Ensyu4_7;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_7
 * 概要:演習4-7
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_7 {
	/*
	 * 関数:main
	 * 概要:読み込んだ個数だけ＊と+を交互に表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/11
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//入力された値を読み込む変数を宣言
		int symbolValue=0;
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
			
			//記号の数の入力を促す文を表示
			System.out.print("何個記号を表示しますか：");
			//入力された値を読み込む
			symbolValue = inputNumber.nextInt(); 
		//入力された値が負の場合は繰り返し入力を求める。
		}while(symbolValue <= 0);	
		
		//次のループ回数を数えるために変数の値を0に戻す
		countNumber = 1;
				
		//ループの回数が入力された値より小さい間繰り返す
		while (countNumber <= symbolValue) {
			//ループの回数が奇数の場合
			if(countNumber%2 != 0) {
				//*を表示する。
				System.out.print("*");
			}
			//ループの回数が偶数の場合
			else {
				//+を表示する。
				System.out.print("+");
			}
			//１ループめが終わるのでループ回数を１増やす
			countNumber++;
		} 
		//最後の記号が入力されたら改行を行う
		System.out.println();
		
	}

}
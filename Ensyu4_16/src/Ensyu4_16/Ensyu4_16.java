package Ensyu4_16;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_16
 * 概要:演習4-16
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_16 {
	/*
	 * 関数:main
	 * 概要:読み込んだ個数だけ＊を表示して５個ずつ改行する
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
		int firstCount = 0 ;
		//ループの開始
		do {
			//ループ回数が１以上の場合
			if(firstCount >= 1) {
				//入力を促す文を表示する
				System.out.println("正の整数値を入力してください。");
			}
			//カウント数を増やす
			firstCount++;
			
			//＊の数の入力を促す文を表示
			System.out.print("何個*を表示しますか：");
			//入力された値を読み込む
			starValue = inputNumber.nextInt(); 
		//入力された値が負の場合は繰り返し入力を求める。
		}while(starValue < 0);
		
		//カウント数を１ずつ増加させて、１から入力された値になるまでループする
		for(int secoundCount=1; secoundCount<=starValue ;secoundCount++ ) {
			//カウント数が５の倍数の場合
			if(secoundCount%5 == 0) {
				//*と改行を表示する
				System.out.print("*\n");
			}
			//カウント数が５の倍数でない場合
			else {
				//*のみを表示する
				System.out.print("*");
			}
		}
		//最後の＊が入力されたら改行を行う
		System.out.println();
		
	}

}
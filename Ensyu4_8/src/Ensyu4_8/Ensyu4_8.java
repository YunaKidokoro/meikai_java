package Ensyu4_8;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_8
 * 概要:演習4-8
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_8 {
	/*
	 * 関数:main
	 * 概要:入力された正の整数値の桁数を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/11
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//入力された値を読み込む変数を宣言
		int inputValue=0;
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
			
			//整数の入力を促す文を表示
			System.out.print("整数値：");
			//入力された値を読み込む
			inputValue = inputNumber.nextInt(); 
			
		}while(inputValue <= 0);	//入力された値が負の場合は繰り返し入力を求める。
		
		//次のループ回数を数えるために変数の値を0に戻す
		countNumber = 0;
				
		//入力された値が0より大きい間繰り返す
		while (inputValue > 0) {
			//入力された値を１０で割る
			inputValue /= 10;
			//１ループめが終わるのでループ回数を１増やす
			countNumber++;
		} 
		//桁数を表示する。ループの回数が桁数と等しい。
		System.out.println("その値は"+ countNumber +"桁です。");	
	}
}
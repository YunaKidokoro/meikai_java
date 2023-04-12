package Ensyu4_13;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_13
 * 概要:演習4-13
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_13 {
	/*
	 * 関数:main
	 * 概要:1から入力された正の整数値までの和をfor文を用いて求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/11
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//入力された値を読み込む変数を宣言
		int inputValue = 0;
		//ループの開始
		do {
			//ループの回数を数える変数を用意する
			int countNumber = 0 ;
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
		//入力された値が負の場合は繰り返し入力を求める。
		}while(inputValue < 0);
		
		//１から入力値までの合計を表す変数を宣言する
		int sumValue = 0;
		//カウント数が0から入力値になるまでループ
		for(int countNumber=0; countNumber<=inputValue ;countNumber++) {
			//それまでの合計値に値を加算する
			sumValue += countNumber;
		} 
		//求めた積の値を表示する
		System.out.println("1から"+ inputValue +"までの和は"+sumValue +"です");	
	}
}
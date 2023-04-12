package Ensyu4_14;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_14
 * 概要:演習4-13
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_14 {
	/*
	 * 関数:main
	 * 概要:1から入力された正の整数値までの和をfor文を用いて求め、式とともに表示する
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
			//整数の入力を促す文を表示
			System.out.print("整数値：");
			//入力された値を読み込む
			inputValue = inputNumber.nextInt(); 
		//入力された値が0以下場合は繰り返し入力を求める。
		}while(inputValue <= 0);

		//１から入力値までの合計を表す変数を宣言する
		int sumValue = 0;
		//カウント数を１ずつ増やしながら、１から入力値になるまでまでループする
		for(int secondCount=1; secondCount<=inputValue ;secondCount++) {
			//合計値を表す変数にカウント数を足す
			sumValue += secondCount;
			//カウント数が入力された値と一致しない場合
			if(secondCount != inputValue) {
				//いまのループで足した値と記号＋を表示する
				System.out.print(secondCount + "+");
			}
			//カウント数が入力された値と一致する場合
			else {
				//いまのループで足した値と記号＝を表示する
				System.out.print(secondCount + "=");
			}
		} 
		//求めた和の値を表示する
		System.out.println(sumValue);	
	}
}
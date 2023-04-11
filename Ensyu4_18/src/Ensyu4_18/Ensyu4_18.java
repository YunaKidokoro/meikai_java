package Ensyu4_18;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_18
 * 概要:演習4-18
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_18 {
	/*
	 * 関数:main
	 * 概要:1から読み込んだ整数値までの2乗値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/11
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//入力された値を読み込む変数を宣言
		double inputValue;
		//ループの回数を数える変数を用意する
		int firstCount = 0 ;
		//ループの開始
		do {
			//ループ回数が１以上の場合
			if(firstCount >= 1) {
				//入力を促す文を表示する
				System.out.println("整数を入力してください。");
			}
			//カウント数を増やす
			firstCount++;
			
			//整数値の入力を促す文を表示
			System.out.print("nの値：");
			//入力された値を読み込む
			inputValue = inputNumber.nextDouble();
		//入力された値が小数点以下を含む場合は繰り返し入力を求める
		}while(inputValue%1 != 0);
		
		//カウント数を１ずつ増加させて、１から入力された値になるまでループする
		for(int secondCount = 1; secondCount<=inputValue ;secondCount++ ) {
			System.out.println(secondCount +"の2乗の値は"+ secondCount*secondCount);
		}
	}
}
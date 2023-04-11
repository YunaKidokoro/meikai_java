package Ensyu4_12;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_12
 * 概要:演習4-12
 * 作成者:城所佑奈
 * 作成日:2023/04/10
 * */
public class Ensyu4_12 {
	/*
	 * 関数:main
	 * 概要:読み込んだ正の整数値までカウントアップする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/10
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//カウントアップを行うことを表示
		System.out.println("カウントアップします。");
		//入力された値を読み込むための変数を宣言する。
		int inputValue;
		//ループを開始
		do {	
			//正の整数値の入力を促す文を表示する
			System.out.print("正の整数値：");
			//変数inputValueに入力された値を読み込む。
			inputValue = inputNumber.nextInt();
		//inputValueの値が負の数なら繰り返す。
		}while(inputValue <= 0);
		
		
		//カウント用の変数countupValueが0から入力された値になるまでループする
		for(int countupValue = 0; countupValue <= inputValue ; countupValue++) {
			//カウント数を表示
			System.out.println(countupValue);
		} 
	}
}
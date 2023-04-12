package Ensyu4_11;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_11
 * 概要:演習4-11
 * 作成者:城所佑奈
 * 作成日:2023/04/10
 * */
public class Ensyu4_11 {
	/*
	 * 関数:main
	 * 概要:読み込んだ正の整数値からカウントダウンするプログラムをfor文を用いて表現する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/10
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//カウントダウンを行うことを表示
		System.out.println("カウントダウンします。");
		//入力された値を読み込むための変数を宣言する。
		int inputValue = 0;
		//ループを開始
		do {	
			//正の整数値の入力を促す文を表示する
			System.out.print("正の整数値：");
			//変数inputValueに入力された値を読み込む。
			inputValue = inputNumber.nextInt();
		//inputValueの値が0以下なら繰り返す。
		}while(inputValue <= 0);
		
		
		//カウント用の変数countdownValueが入力された値から１ずつ減って、0になるまでループする
		for(int countdownValue=inputValue; countdownValue>=0 ; countdownValue--) {
			//カウント数を表示
			System.out.println(countdownValue);
		} 
	}
}
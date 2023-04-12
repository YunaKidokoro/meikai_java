package Ensyu4_17;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_17
 * 概要:演習4-17
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_17 {
	/*
	 * 関数:main
	 * 概要:読み込んだ整数値の約数を列挙しその数を表示する
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
				System.out.println("正の整数を入力してください。");
			}
			//カウント数を増やす
			firstCount++;
			
			//整数値の入力を促す文を表示
			System.out.print("整数値：");
			//入力された値を読み込む
			inputValue = inputNumber.nextInt(); 
		//入力された値が負の場合は繰り返し入力を求める
		}while(inputValue < 0);
		
		//約数の個数を数える変数を宣言
		int divisorValue= 0;
		//カウント数を１ずつ増加させて、１から入力された値になるまでループする
		for(int secondCount = 1; secondCount<inputValue ;secondCount++ ) {
			//入力された値をカウント数で割ったあまりが0の場合
			if(inputValue % secondCount ==0) {
				//この時のカウント数が約数となるので表示する
				System.out.println(secondCount);
				//約数の個数を1増やす
				divisorValue++;
			}
		}
		//約数の個数を表示する
		System.out.println("約数は"+ divisorValue +"個です。");	
	}
}
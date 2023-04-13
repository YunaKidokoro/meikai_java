package Ensyu4_9;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_9
 * 概要:演習4-9
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_9 {
	/*
	 * 関数:main
	 * 概要:1から入力された正の整数値までの積を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/11
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//入力された値を読み込む変数を宣言
		int inputValue  = 0;
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
		//入力された値が負の場合は繰り返し入力を求める。
		}while(inputValue <=0);
		
		//積の値を表す変数を宣言する
		int multiplyValue = 1;
		
		//次のループ回数を数えるために変数の値を1に戻す
		countNumber = 1;
		
		//入力された値が0より大きい間繰り返す
		while (inputValue >= countNumber) {
			//積をもとめる
			multiplyValue *= countNumber;
			//１ループめが終わるのでループ回数を１増やす
			countNumber++;
			System.out.println(multiplyValue);
		} 
		//求めた積の値を表示する
		System.out.println("1から"+ inputValue +"までの積は"+multiplyValue +"です");	
	}
}
package Ensyu4_22;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_22
 * 概要:演習4-22
 * 作成者:城所佑奈
 * 作成日:2023/04/12
 * */
public class Ensyu4_22 {
	/*
	 * 関数:main
	 * 概要:入力された段数の数字ピラミッドを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/12
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//入力された値を読み込む変数を宣言
		double inputValue;
		//ループの回数を数える変数を用意する
		int firstCount = 0;
		//ループの開始
		do {
			//ループ回数が１以上の場合
			if(firstCount >= 1) {
				//入力を促す文を表示する
				System.out.println("正の整数を入力してください。");
			}
			//カウント数を増やす
			firstCount++;

			//数字ピラミッドを表示することを伝える文を表示
			System.out.println("数字ピラミッドを表示します。");
			//整数値の入力を促す文を表示
			System.out.print("nの値：");
			//入力された値を読み込む
			inputValue = inputNumber.nextDouble();
			
		//入力された値が小数点以下を含むか0以下の場合は繰り返し入力を求める
		}while(inputValue%1 != 0 || inputValue<=0);
		
		//行ループの開始
		//カウント数を1ずつ増加させて、1から入力値になるまでループする。
		for(int lineCount=1; lineCount<=inputValue; lineCount++) {
			//列ループの開始
			//空白のカウント数が入力値-行数から0に減少するまでループ
			for(double spaceCount=inputValue-lineCount ; spaceCount>0; spaceCount--) {
				//空白を表示する
				System.out.print(" ");
			}
			//数字のカウント数を0から(段数×２-1)に増加するまでループ
			for(double starCount=0 ; starCount<lineCount*2-1 ; starCount++) {
				//表示する数字の値を計算する
				int outputInteger = lineCount%10;
				//数字を表示する
				System.out.print(outputInteger);
			}
			//改行を入れて、また列ループをさせる
			System.out.println();
		}
	}
}
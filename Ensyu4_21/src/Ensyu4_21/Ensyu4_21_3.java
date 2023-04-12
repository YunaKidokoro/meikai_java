package Ensyu4_21;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_21
 * 概要:演習4-21
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_21_3 {
	/*
	 * 関数:main
	 * 概要:読み込んだ整数段の直角三角形を表示する(右下が直角var.)
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

			//右上直角の三角形を表示することを伝える文を表示
			System.out.println("右下直角の三角形を表示します");
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
			//空白のカウント数が入力値-行数にから0に減少するまでループ
			for(double spaceCount=inputValue-lineCount ; spaceCount>0; spaceCount--) {
				//空白を表示する
				System.out.print(" ");
			}
			//*のカウント数を入力値-行数から入力値に増加するまでループ
			for(double starCount=inputValue-lineCount ; starCount<inputValue ; starCount++) {
				//*を表示する
				System.out.print("*");
			}
			//改行を入れて、また列ループをさせる
			System.out.println();
		}
	}
}
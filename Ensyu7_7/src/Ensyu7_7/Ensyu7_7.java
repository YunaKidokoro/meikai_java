package Ensyu7_7;
//Scannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_7
* 概要:演習7-7
* 作成者:城所佑奈
* 作成日:2023/04/19
* */
public class Ensyu7_7 {
	/*
	 * メソッド名:putChars
	 * 概要:引数の文字をn個連続で表示する
	 * 引数:char型・ｃ・表示する文字を表す
	 * 		int型・ｎ・文字の表示する個数を表す
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	static void putChars(char c, int n) {
		//個数を表す変数が1まで1ずつ減る間、文字ｃを表示する
		while(n-->0) {System.out.print(c);}
	}
	/*
	 * メソッド名:putStars
	 * 概要:*をn個連続で表示する
	 * 引数:int型・ｎ・文字の表示する個数を表す
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	static void putStars(int n) {
		//個数を表す変数が1まで1ずつ減る間、*を表示する
		putChars('*',n);
	}
	/*
	 * 関数名:main
	 * 概要:左下直角三角形を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputText = new Scanner(System.in);
		//左下直角三角形を表示することを説明
		System.out.println("左下直角三角形を表示します");
		//三角形の段数の入力を促す文を表示
		System.out.print("段数：");
		//入力された値を読み込む
		int inputline = inputText.nextInt();
		//イテレータが0から段数まで変化する間ループする
		for(int indexNumber=0;indexNumber<=inputline;indexNumber++) {
			//記号＊を表示
			putStars(indexNumber);
			//次の段数へ改行する
			System.out.println();
		}
	}
}

package Ensyu7_6;
//Scannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_6
* 概要:演習7-6
* 作成者:城所佑奈
* 作成日:2023/04/19
* */
public class Ensyu7_6 {
	/*
	 * メソッド名:printSeason
	 * 概要:引数の値によって季節を表示する、
	 * 		月以外の数字のときは何も表示しない
	 * 引数:int型・m・何月かを表す変数
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	static void printSeason(int m) {
		//mが３月から５月の場合、春と表示する
		if(m>=3 && m<=5) { System.out.println("春");}
		//mが６月から８月の場合、夏と表示する
		else if(m>=6 && m<=8) { System.out.println("夏");}
		//mが９月から10月の場合、秋と表示する
		else if(m>=9 && m<=10) { System.out.println("秋");}
		//mが12月・1月・２月の場合、冬と表示する
		else if(m==12 || m>=1 && m<=2) { System.out.println("冬");}
	}
	/*
	 * 関数名:main
	 * 概要:入力された月の季節を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputText = new Scanner(System.in);
		//月の入力を促す文を表示
		System.out.print("何月？：");
		//入力された値を読み込む
		int inputMonth = inputText.nextInt();
		//入力された月の季節を表示する
		printSeason(inputMonth);
	}
}

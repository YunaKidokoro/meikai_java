package Ensyu4_19;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_19
 * 概要:演習4-19
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_19 {
	/*
	 * 関数:main
	 * 概要:入力された月の季節を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/11
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//入力された値を読み込む変数と、do文の繰り返しを決める変数を宣言
		int monthNumber = 0;		int retryValue  = 0;
		//季節の表示するループの開始
		do {
			//適切な入力がされるまで繰り返すループの開始
			do {
				//月の入力を促す文を表示する
				System.out.print("季節を求めます。\n何月ですか？：");
				//入力された値を変数に読み込む。
				monthNumber = inputNumber.nextInt();
			//入力が0以下、または13以上の場合には繰り返す
			}while(monthNumber<=0 || monthNumber>=13);
			
			//３月から5月の場合
			if(monthNumber >= 3 && monthNumber <= 5) {
				//季節は春と表示する
				System.out.println("それは春です");
			}
			//６月から８月の場合
			else if(monthNumber >= 6 && monthNumber <= 8) {
				//季節は夏と表示する
				System.out.println("それは夏です");
			}
			//９月から１１月の場合
			else if(monthNumber >= 9 && monthNumber <= 11) {
				//季節は秋と表示する
				System.out.println("それは秋です");
			}
			//１２月か１月か２月の場合
			else if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
				//季節は冬と表示する
				System.out.println("それは冬です");
			}
			//もう一度行うか尋ねる文を表示
			System.out.print("もう一度？ 1...Yes/ 1以外の数字...No:");
			//入力された値をdo文の繰り返しを決める変数に読み込む
			retryValue  = inputNumber.nextInt();
		//もう一度が選択されたらループを行う
		}while(retryValue == 1);
	}
}
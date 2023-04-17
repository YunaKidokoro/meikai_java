package Ensyu6_14;
//ランダムな値を生成するためにRandomクラスをインポートする
import java.util.Random;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu6_14
* 概要:演習6-14
* 作成者:城所佑奈
* 作成日:2023/04/17
* */
public class Ensyu6_14 {
	/*
	 * 関数名:main
	 * 概要:1~12月の英語表現を入力させる英単語学習プログラム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/17
	 * */
	public static void main(String[]args) {
		//Randomクラスのインスタンスを初期化する
		Random randomMonth = new Random();
		//Scannerクラスのインスタンスを初期化する
		Scanner inputString = new Scanner(System.in);
		
		//繰り返し問題を解くかを決める変数
		int oneMoreNumber = 0;
		//各月の英単語で初期化した配列
		String[] monthString = {"January","Febrary","March","April","May",
				"June","July", "August ","September","October","November","December"};
		//月名を英語で解答させることを表示
		System.out.println("英語の月名を入力してください。\n"
				+ "なお、先頭は大文字で、2文字め以降は小文字とします");
		//ループの開始
		do {
			//入力させる文字を代入する変数を宣言
			String answerMonth = "a";
			//問題の月を表す変数
			int questionMonth  = 0;
			//ループの開始
			do {
				//問題の月をランダムに決める
				questionMonth = randomMonth.nextInt(12)+1;
			//全問の月と同じ場合は乱数を生成し直す
			}while(answerMonth.equals(monthString[questionMonth-1]));
			
			//正解しない限りくりかえす
			while(true) {
				//問題文の表示
				System.out.println( questionMonth + "月:");
				//入力された文字列を読み込む
				answerMonth = inputString.next();
				//入力された文字列が答えと等しい場合
				if(answerMonth.equals(monthString[questionMonth-1])) {
					//ループから抜ける
					break;
				}
				//不正解の場合
				else {
					//違うのでもう一度
					System.out.println("違います。");
				}
			}
			//正解したことを表示して、続けるか尋ねる文を表示
			System.out.print("正解です。もう一度？\n1...Yes/それ以外...No:");
			//入力された値を繰り返し問題を解くかを決める変数に読み込む
			oneMoreNumber = inputString.nextInt();
		//1が入力されたならループの最初に戻る
		}while(oneMoreNumber==1);
	}
}
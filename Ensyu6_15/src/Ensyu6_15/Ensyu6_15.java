package Ensyu6_15;
//ランダムな値を生成するためにRandomクラスをインポートする
import java.util.Random;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu6_15
* 概要:演習6-15
* 作成者:城所佑奈
* 作成日:2023/04/17
* */
public class Ensyu6_15 {
	/*
	 * 関数名:main
	 * 概要:曜日の英語表現を入力させる英単語学習プログラム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/17
	 * */
	public static void main(String[]args) {
		//Randomクラスのインスタンスを初期化する
		Random randomDay = new Random();
		//Scannerクラスのインスタンスを初期化する
		Scanner inputString = new Scanner(System.in);
		
		//繰り返し問題を解くかを決める変数
		int oneMoreNumber = 0;
		//各曜日の英単語で初期化した配列
		String[] dayString = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		//各曜日の英単語で初期化した配列
		String[] japaneseDay = {"日","月","火","水","木","金","土"};
		//曜日名を英語で解答させることを表示
		System.out.println("英語の曜日名を小文字で入力してください。");
		//ループの開始
		//入力させる文字を代入する変数を宣言
		String answerDay = "a";
		//問題の曜日を表す変数
		int questionDay  = 0;
		do {
			//ループの開始
			do {
				//問題の曜日をランダムに決める
				questionDay = randomDay.nextInt(7)+1;
			//前問の曜日と同じ場合は乱数を生成し直す
			}while(answerDay.equals(dayString[questionDay-1]));
			
			//正解しない限りくりかえす
			while(true) {
				//問題文の表示
				System.out.println(japaneseDay[ questionDay-1 ]+ "曜日:");
				//入力された文字列を読み込む
				answerDay = inputString.next();
				//入力された文字列が答えと等しい場合
				if(answerDay.equals(dayString[questionDay-1])) {
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
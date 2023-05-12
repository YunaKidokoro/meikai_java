package Ensyu15_5;
//スキャナークラスをインポートする
import java.util.Scanner;

/**
 * Ensyu15_5<br>
 * 演習15-5<br>
 * 作成日：2023/5/12
 * @author yuna
 */
public class Ensyu15_5 {
	
	/**
	 * inputNumber<br>
	 * 作成日:2023/5/11
	 * @param message String型 何を入力させるかに関する文字列
	 * @return 入力された値 int型
	 * @author yuna
	 */
	static int inputNumber(String message) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		//入力された値読み込む変数
		int inputSkin = 0;
		//ループの開始
		do {
			//入力を求める文を表示する
			System.out.print(message);
			//入力された値を変数に読み込む
			inputSkin = inputNumber.nextInt();
			//0,1以外が入力された場合
			if(inputSkin<0 || inputSkin>1) {
				//再入力を求める文を表示する
				System.out.println("もう一度入力して下さい。");
			}
		//0~5の数字以外が入力された場合は繰り返す
		}while(inputSkin<0 || inputSkin>1);
		//入力された値を返却する
		return inputSkin;
	}
	
	/**
	 * main <br> ３人でじゃんけんを行うプログラム<br>
	 * 作成日:2023/5/11
	 * @param args
	 * @return なし
	 * @author yuna
	 */
	public static void main(String[]args) {
		//じゃんけんをもう一度行うかどうかを表す変数
		int retryNumber = 0;
		//もう一度行う場合を表す変数
		final int ONE_MORE_GAME = 1;
		//ループの開始
		do {
			//かけごえを表示
			System.out.println("じゃけんぽん");
			//各プレイヤーの出す手を表すインスタンスを生成
			PlayerResult playersHands = new PlayerResult();
			//各プレイヤーの出す手を表示
			System.out.println(playersHands.toString());
			//勝負の結果を表示
			System.out.println(playersHands.StringplayerResult());
			//もう一度行うか尋ねる
			retryNumber = inputNumber("もう一度？\nいいえ…0/はい…1:");
			//見やすくするために改行する
			System.out.println();
		//１が入力されればもう一度行う
		}while(retryNumber==ONE_MORE_GAME);
	}
}

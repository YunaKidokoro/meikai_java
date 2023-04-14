package Ensyu4_27;
//乱数生成のためにRandomクラスをインポートする。
import java.util.Random;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_27
 * 概要:演習4-27
 * 作成者:城所佑奈
 * 作成日:2023/04/12
 * */
public class Ensyu4_27 {
	/*
	 * 関数名:main
	 * 概要:数当てゲーム、回答可能回数に縛りがある名合
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/12
	 * */
	public static void main (String[]args) {
		//Randomクラスのインスタンスを初期化する。
		Random randomNumber = new Random();
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);
		
		//当てるべき数を0~99の乱数として生成。
		int correctNumber = randomNumber.nextInt(100);
		//数当てゲームの開始メッセージを表示
		System.out.println("数当てゲーム開始！");
		//ゲームのルールを説明する。
		System.out.println("0~99の数を当ててください。");
		//入力された回答回数を読み込む変数を宣言
		int answerNumber = 0;
		do {
			//回答回数を入力させる
			System.out.println("回答に挑戦する回数を決めてね:");
			//入力された回答回数を読み込む変数を宣言
			answerNumber = inputNumber.nextInt();
		}while(answerNumber <= 0);
		//プレイヤーの入力する値を読み込む変数を宣言
		int playerChoice = 0; 
		
		//ループの開始
		Outer:
			for(int i=1 ; i<=answerNumber; i++) {
				//入力を促すメッセージを表示
				System.out.print("いくつかな？：");
				//入力された値を変数に読み込む
				playerChoice = inputNumber.nextInt();
				//あたりの数字と入力を比較する
				//範囲外の値が入力されたとき
				if(playerChoice<0 || playerChoice>99) {
					//入力された値が範囲外の値であることを表示
					System.out.println("答えは0~99の間だよ！");
				}
				//入力された値の方が大きいとき
				else if(playerChoice > correctNumber) {
					//入力された値が大きいことを表示
					System.out.println("もっと小さいよ！");
				}
				//入力された値の方が小さいとき
				else if(playerChoice < correctNumber) {
					//入力された値が小さいことを表示
					System.out.println("もっと大きいよ！");	
				}
				//入力された値が正解だったとき
				else if(playerChoice == correctNumber) {
					//正解したことを表示する
					System.out.println("正解です！");
					//ループから抜ける
					break Outer;
				}
				//カウント数が回答回数に到達したとき
				if(answerNumber == i) {
					//正解の値を表示する。
					System.out.println("正解は"+correctNumber+"です！");
				}
			}
	}
}

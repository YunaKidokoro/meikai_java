package Ensyu4_2;
//乱数生成のためにRandomクラスをインポートする。
import java.util.Random;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_2
 * 概要:演習4-2
 * 作成者:城所佑奈
 * 作成日:2023/04/07
 * */
public class Ensyu4_2 {
	/*
	 * 関数名:main
	 * 概要:数当てゲーム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/07
	 * */
	public static void main (String[]args) {
		//Randomクラスのインスタンスを初期化する。
		Random RandomNumber = new Random();
		//Scannerクラスのインスタンスを初期化する。
		Scanner InputNumber = new Scanner(System.in);
		
		//当てるべき数を10~99の乱数として生成。
		int CorrectNumber = RandomNumber.nextInt(89)+10;
		//数当てゲームの開始メッセージを表示
		System.out.println("数当てゲーム開始！");
		//ゲームのルールを説明する。
		System.out.println("10~99の数を当ててください。");
		//プレイヤーの入力する値を読み込む変数を宣言
		int PlayerChoice ; 
		//ループの開始
		do {
		//入力を促すメッセージを表示
			System.out.print("いくつかな？：");
		//入力された値を変数に読み込む
			PlayerChoice = InputNumber.nextInt();
		//あたりの数字と入力を比較する
		//入力された値の方が大きいとき
			if(PlayerChoice > CorrectNumber)
				//入力された値が大きいことを表示
				System.out.println("もっと小さいよ！");
		//入力された値の方が小さいとき
			else if(PlayerChoice < CorrectNumber)
				//入力された値が小さいことを表示
				System.out.println("もっと大きいよ！");				
		//不正解であれば繰り返す。
		}while(PlayerChoice != CorrectNumber);
		//正解であれば正解メッセージを表示する。
		System.out.println("正解です！");
		
	}
}

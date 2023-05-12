package Ensyu15_5;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:HumanPlayer
 * 概要:人間のプレイヤーの出す手に関するクラス
 * 作成者:yuna
 * 作成日:2023/5/9
 * */
public class HumanPlayer extends Player{
	//スキャナークラスのインスタンスを初期化する
	Scanner imputNumber = new Scanner(System.in);
	//人間の出す手を表すフィールド
	private int humanHand;
	//コンストラクタ
	public HumanPlayer() {
		do {
			//出す手と対応する数字を表示する
			System.out.print("グー…0/チョキ…1/パー…2 :");
			//出す手の値を入力で受け取る
			int humanHand = imputNumber.nextInt();
			//入力された値でフィールドを初期化する
			this.humanHand = humanHand;
			//0~2以外の値が入力された場合
			if(humanHand<0 || humanHand>2) {
				//再入力を求める文章を表示する
				System.out.println("もう一度入力して下さい。");
			}
		//1~3以外の値が入力された場合は繰り返す
		}while(humanHand<0 || humanHand>2);
	}
	
	/**　ゲッタ
	 * 関数名:getHumanHand
	 * 概　要:人間の出す手を取得する
	 * 引　数:なし
	 * 戻り値:人間の出す手を表す値を返却する
	 * 作成日:2023/5/10
	 */
	public int getHumanHand() {
		//人間の出す手を表す値を返却する
		return humanHand;
		
	}
	/*
	 * 関数名:toString
	 * 概　要:人間の出す手を表す文字列を返却する
	 * 引　数:なし
	 * 戻り値:出す手を表す文字列
	 * 作成日:2023/5/10
	 * */
	public String toString() {
		//返却する文字列を表す変数
		String backString = "a";
		//出す手がグーのときを0とする
		int handStone = 0;
		//出す手がチョキのときを1とする
		int handScissors = 1;
		//出す手がパーのときを2とする
		int handPaper = 2;

		//出す手がグーのとき
		if(humanHand == handStone){
			//文字列をグーにする
			backString = "あなた：グー";
		}
		//出す手がチョキのとき
		else if(humanHand == handScissors){
			//文字列をチョキにする
			backString = "あなた：チョキ";
		}
		//出す手がパーのとき
		else if(humanHand == handPaper){
			//文字列をパーにする
			backString = "あなた：パー";
		}
		//出す手を表す文字列を返却する
		return backString;
	}	
}
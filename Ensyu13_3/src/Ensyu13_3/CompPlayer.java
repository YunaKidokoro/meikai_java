package Ensyu13_3;
//ランダムクラスをインポートする
import java.util.Random;

/**
 * クラス名:CompPlayer
 * 概　要:コンピューターのじゃんけんの手を決める（抽象クラスplayerの派生クラス）
 * 作成者:yuna
 * 作成日:2023/5/10
 */
public class CompPlayer extends Player{
	//ランダムクラスのインスタンスを初期化
	Random randamNumber  = new Random();
	//コンピューターの出す手を表すフィールド
	private int computerHand;
	//コンストラクタ
	public CompPlayer() {
		//出す手の種類が3種類を表す変数
		final int kindOfHands = 3;
		//0から2の乱数を生成する
		int  computerHand = randamNumber.nextInt(kindOfHands);
		//コンピューターの出す手を乱数で初期化する
		this.computerHand = computerHand;
	}
	/*
	 * 関数名:getComputerHand
	 * 概　要:コンピューターの出す手を取得する
	 * 引　数:なし
	 * 戻り値:コンピューターの出す手を表す値を返却する
	 * 作成日:2023/5/10
	 * */
	public int getComputerHand() {
		//コンピューターの出す手を返却する
		return computerHand;
		
	}
	/*
	 * 関数名:toString
	 * 概　要:コンピューターの出す手の文字列を返す
	 * 引　数:なし
	 * 戻り値:コンピューターの出す手が何かを返却する
	 * 作成日:2023/5/10
	 * */
	public String toString() {
		//返却する文字列を表す変数
		String compHands = "a";
		
		//出す手がグーのときを0とする
		int handStone = 0;
		//出す手がチョキのときを1とする
		int handScissors = 1;
		//出す手がグーのとき
		if(computerHand == handStone) {
			//文字列をグーにする
			compHands =  "コンピュータ：グー";
		}
		//出す手がチョキのとき
		else if(computerHand == handScissors) {
			//文字列をチョキにする
			compHands = "コンピュータ：チョキ";
		}
		//出す手がパーのとき
		else {
			//文字列をパーにする
			compHands = "コンピュータ：パー";
		}
		//出す手を表す文字列を返却する
		return compHands;
	}	
}
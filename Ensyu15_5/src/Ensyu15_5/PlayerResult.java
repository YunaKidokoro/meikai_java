package Ensyu15_5;

/**
 * PlayerResult<br>
 * RockPaperScissorsRulesインタフェースの実装クラス<br>
 * 作成日：2023/5/12
 * @author yuna
 */
public class PlayerResult implements RockPaperScissorsRules  {

	//人間プレイヤーのインスタンスを生成
	HumanPlayer human = new HumanPlayer();
	//コンピュータープレイヤー１のインスタンスを生成
	CompPlayer compcompHand1 = new CompPlayer();
	//コンピュータープレイヤー２のインスタンスを生成
	CompPlayer compcompHand2 = new CompPlayer();
	//人間プレイヤーの出す手を取得
	int humanHand = human.getHumanHand();
	//コンピュータープレイヤー１の出す手を取得
	int compHand1 = compcompHand1.getComputerHand();
	//コンピュータープレイヤー２の出す手を取得
	int compHand2 = compcompHand2.getComputerHand();
		
	//グーの手を表す
	final int HANDSTONE = 0;
	//チョキの手を表す
	int HANDSCISSORS = 1;
	//パーの手を表す
	int HANDPAPER = 2;
	
	/**
	 * winPattern<br>  勝ったかどうか返却する
	 * @return 人間が勝てばtrueを返す
	 * @author yuna
	 */
	public boolean winPattern(){
		//勝ったかどうかを表す変数
		boolean backResult = false;
		//グーで勝つ
		if(humanHand==HANDSTONE &&(compHand1 == HANDSCISSORS || compHand2 == HANDSCISSORS)) {
			backResult = true;
		}
		//チョキで勝つ
		else if(humanHand==HANDSCISSORS &&(compHand1 == HANDPAPER || compHand2 == HANDPAPER)){
			backResult = true;
		}
		//パーで勝つ
		else if(humanHand==HANDPAPER &&(compHand1 == HANDSTONE || compHand2 == HANDSTONE)){
			backResult = true;
		}
		//勝ったかどうか返却する
		return backResult;
	}
	
	/**
	 * drawPattern<br>  引き分けかどうか返却する
	 * @return 引き分けならtrueを返す
	 * @author yuna
	 */
	public boolean drawPattern() {
		//引き分けかどうか表す変数
		boolean backResult = false;
		//全員の手が同じ場合
		if(humanHand == compHand1 && compHand1 == compHand2) {
			//引き分けなのでtureにする
			backResult = true;
		}
		//全員の手が異なる場合
		else if(humanHand != compHand1 && humanHand != compHand2 && compHand1 !=compHand2) {
			//引き分けなのでtureにする
			backResult = true;
		}
		//引き分けかどうか返却する
		return backResult;
	}
	
	/**
	 * playerResult
	 * @return プレイヤーが勝利したかの結果の文字列を返却する
	 * @author yuna
	 */
	public String StringplayerResult(){
		//結果を表す文字列負けた場合で初期化しておく
		String resultText = "あなたの負けです\n";
		
		//あいこの場合
		if(drawPattern()==true) {
			//文字列を引き分けに変える
			resultText = "引き分けです\n";
		}
		//人間プレイヤーが勝利した場合
		else if(winPattern()==true) {
			//文字列をあなたの勝ちに返す
			resultText = "あなたの勝ちです\n";
		}
		//勝敗を表す文字列を返す
		return resultText;
		
	}

	
	/**
	 * toString() 各プレイヤーの出す手を表示する
	 * @return 各プレイヤーの出す手を表す文字列を返却
	 * @author yuna
	 */
	public String toString() {
		//返却する文字列を表す変数を宣言
		String backString1 = "";
		
		//出す手がグーのとき
		if(humanHand == HANDSTONE){
			//文字列をグーにする
			backString1 = "あなた：グー";
		}
		//出す手がチョキのとき
		else if(humanHand == HANDSCISSORS){
			//文字列をチョキにする
			backString1 = "あなた：チョキ";
		}
		//出す手がパーのとき
		else if(humanHand == HANDPAPER){
			//文字列をパーにする
			backString1 = "あなた：パー";
		}
		//コンピュータープレイヤー１の出す手を取得する
		String backString2 = compcompHand1.toString();
		//コンピュータープレイヤー2の出す手を取得する
		String backString3 = compcompHand2.toString();
		
		//出す手を表す文字列を返却する
		return backString1+"\n"+backString2+"\n"+backString3;		
	}
}

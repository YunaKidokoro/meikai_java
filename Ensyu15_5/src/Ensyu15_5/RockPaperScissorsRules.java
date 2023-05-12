package Ensyu15_5;

/**
 * RockPaperScissorsRules<br> 3人でするじゃんけんのルールに関するインタフェース<br>
 * 作成日：2023/5/12
 * @author yuna
 */
public interface RockPaperScissorsRules {
	
	/**
	 * winPattern<br>  勝利条件を決める抽象クラス
	 * @return 勝利条件を返却する
	 * @author yuna
	 */
	public abstract boolean  winPattern();
	
	/**
	 * drawPattern<br>  引き分けを決める抽象クラス
	 * @return 引き分けの条件を返却する
	 * @author yuna
	 */
	public abstract boolean drawPattern();
//	
	/**
	 * playerResult
	 * @return プレイヤーが勝利したかの結果の文字列を返却する
	 * @author yuna
	 */
	public abstract String StringplayerResult();
}

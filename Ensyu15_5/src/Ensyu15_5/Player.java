package Ensyu15_5;
/*
 * クラス名:Player
 * 概　要:じゃんけんのプレイヤーに関する抽象クラス
 * 作成日:2023/5/9
 * 作成者:yuna
 * */
public abstract class Player {
	
	/*
	 * 関数名:toString
	 * 概要:じゃんけんの手を文字列にして返却する抽象メソッド
	 * 引数:なし
	 * 戻り値:なし
	 * */
	//Shapeクラスの派生クラスでメソッド本体を記述する
	public abstract String toString();
	/*
	 * 関数名:print
	 * 概要:toStringの文字列を表示するメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * */
	public void print(){
		//文字列を表示する
		System.out.println(toString());
	}
}

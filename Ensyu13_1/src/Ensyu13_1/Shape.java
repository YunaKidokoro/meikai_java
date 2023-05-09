package Ensyu13_1;
/*
 * クラス名:Shape
 * 概　要:図形の概念を表す抽象クラス(abstract)
 * 作成日:2023/5/9
 * 作成者:yuna
 * */
public abstract class Shape {
	/*
	 * 関数名:toString
	 * 概　要:図形情報に関する文字列を返却する
	 * 引　数:なし
	 * 戻り値:なし
	 * */
	//Shapeクラスの派生クラスでメソッド本体を記述する
	public abstract String toString();
	
	/*
	 * 関数名:draw
	 * 概　要:図形を描画する
	 * 引　数:なし
	 * 戻り値:なし
	 * */
	//Shapeクラスの派生クラスでメソッド本体を記述する
	public abstract void draw();
	
	/*
	 * 関数名:print
	 * 概　要:図形情報と図形の描画を表示する
	 * 引　数:なし
	 * 戻り値:なし
	 * */
	public void print() {
		//toStringの返す文字列を表示する
		System.out.println(toString());
		//drawメソッドを呼び出して図形を描画する
		draw();
	}
}

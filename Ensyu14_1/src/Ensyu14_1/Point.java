package Ensyu14_1;
/*
 * クラス名:Point
 * 概　要:点を表すクラス(抽象クラスShapeからの派生クラス)
 * 作成者:yuna
 * 作成日:2023/5/9
 * */
public class Point extends Shape{
	//点を生成するコンストラクタ
	public Point() {/*なにもしない*/}
	
	/*
	 * 関数名:toString
	 * 概　要:点に関する図形情報を表す文字列を返却する
	 * 引　数:なし
	 * 戻り値:文字列"Point"を返却する
	 * 作成日:2023/5/9
	 * */
	public String toString() {
		//文字列"Point"を返却する
		return "Point";
	}
	/*
	 * 関数名:draw
	 * 概　要:点として＋記号を１こ描画する
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/9
	 * */
	public void draw() {
		//+を表示する
		System.out.println("+");
	}
	
}
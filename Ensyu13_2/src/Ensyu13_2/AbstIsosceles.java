package Ensyu13_2;
/*
 * 関数名:AbstIsosceles
 * 概　要:二等辺三角形を表す抽象クラス(抽象クラスShapeからの派生クラス)
 * 作成日:2023/5/9
 * 作成者:yuna
 * */
public abstract class AbstIsosceles extends Shape{
	//辺の長さを表すフィールド
	private int length;
	
	//辺の長さを表すフィールドを生成するコンストラクタ
	public AbstIsosceles(int length) {
		//取得した辺の長さでインスタンスを初期化する
		setLength(length);
	}
	
	/*
	 * 関数名:getLength
	 * 概　要:辺の長さを取得する
	 * 引　数:なし
	 * 戻り値:辺の長さを返却する
	 * 作成日:2023/5/9
	 * */
	public int getLength() {
		//辺の長さを返却する
		return length;
	}
	/*
	 * 関数名:setLength
	 * 概　要:辺の長さを設定する
	 * 引　数:設定する辺の長さ
	 * 戻り値:なし
	 * 作成日:2023/5/9
	 * */
	public void setLength(int length) {
		//辺の長さを設定する
		this.length = length;
	}
	
	/*
	 * 関数名:toString
	 * 概　要:直角二等辺三角形の図形情報に関する文字列を返却する
	 * 引　数:なし
	 * 戻り値:AbstLine(Length:3)を返却する、３の所には一辺の長さが表示される
	 * */
	public  String toString() {
		return "AbstIsosceles(length:"+length+")";
	}
}

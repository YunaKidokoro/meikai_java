package Ensyu13_1;
/*
 * クラス名:Point
 * 概　要:直線を表す抽象クラス(抽象クラスShapeからの派生クラス)
 * 作成者:yuna
 * 作成日:2023/5/9
 * */
public abstract class AbstLine extends Shape{
	//直線の長さを表すフィールド
	private int length;
	
	//直線を生成するコンストラクタ
	public AbstLine(int length) {
		//取得した直線の長さでインスタンスを初期化する
		setLength(length);
	}
	
	/*
	 * 関数名:getLength
	 * 概　要:直線の長さを取得する
	 * 引　数:なし
	 * 戻り値:直線の長さを返却する
	 * 作成日:2023/5/9
	 * */
	public int getLength() {
		//直線の長さを返却する
		return length;
	}
	/*
	 * 関数名:setLength
	 * 概　要:直線の長さを設定する
	 * 引　数:設定する直線の長さ
	 * 戻り値:なし
	 * 作成日:2023/5/9
	 * */
	public void setLength(int length) {
		//直線の長さを設定する
		this.length = length;
	}
	
	/*
	 * 関数名:toString
	 * 概　要:直線の図形情報に関する文字列を返却する
	 * 引　数:なし
	 * 戻り値:AbstLine(Length:3)を返却する、３の所には長さが表示される
	 * */
	public  String toString() {
		return "AbstLine(length:"+length+")";
	}
}

package Ensyu13_1;
/*
 * クラス名:Rectangle
 * 概　要:長方形を表すクラス(抽象クラスShapeからの派生クラス)
 * 作成者:yuna
 * 作成日:2023/5/9
 * */
public class Rectangle extends Shape{
	//長方形の幅を表すフィールド
	private int width;
	//長方形の高さを表すフィールド
	private int height;
	//長方形を生成するコンストラクタ
	public Rectangle(int width, int height) {
		//幅を表すフィールドを引数で初期化する
		this.width  = width;
		//高さを表すフィールドを引数で初期化する
		this.height = height;
	}
	/*
	 * 関数名:toString
	 * 概　要:長方形の図形情報に関する文字列を返却する
	 * 引　数:なし
	 * 戻り値:Rectangle(width:3,height:4)を返却する、
	 * ３の所には長方形の幅が、４の所には長方形の高さが表示される
	 * */
	public  String toString() {
		//Rectangle(width:幅,height:高さ)を返却する、
		return "Rectangle(width:"+ width +", height:"+height +" )";
	}
	/*
	 * 関数名:draw
	 * 概　要:*で長方形を描画する
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/9
	 * */
	public void draw() {
		//直線の長さの分だけループする
		for(int i=1 ; i<=height ; i++) {
			for(int j = 1; j<=width; j++) {
				//*を表示する
				System.out.print("*");
			}
			//一列めが表示できたら改行して次の列へ
			System.out.println();
		}
	}
}

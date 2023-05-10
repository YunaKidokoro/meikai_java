package Ensyu14_1; 

/**
 * 関数名：Parallelogram
 * 概要：平行四辺形のクラス
 * （インタフェースの実装クラスかつ抽象クラスの派生クラス）
 * 作成日：2023/5/10
 * 作成者：yuna
 */
public class Parallelogram extends Shape implements Plane2D {
	//平行四辺形の底辺の幅を表すフィールド
	private int baseWidth;
	//平行四辺形の高さを表すフィールド
	private int height;
	//コンストラクタ
	public Parallelogram(int baseWidth, int height) {
		//底辺の幅を表す引数で初期化する
		this.baseWidth = baseWidth;
		//高さを表す引数で初期化する
		this.height = height;
	}
	/**
	 *クラス名:getArea
	 *概　要:平行四辺形の面積を取得する
	 *引　数:なし
	 *戻り値:面積を返却する
	 *作成日:2023/5/10
	 */
	public int getArea () {
		//平行四辺形の面積を返す
		return baseWidth * height;
	}
	/**
	 *クラス名:toString
	 *概　要:平行四辺形に関する文字列を返却する
	 *引　数:なし
	 *戻り値:Parallelogram(width:(底辺の幅), height:(高さ))の文字列を返す
	 *作成日:2023/5/10
	 */
	public String toString() {
		//平行四辺形の底辺の幅と高さに関する文字列を返す
		return "平行四辺形(width:"+ baseWidth+", height:"+height +", area:"+getArea()+")";
	}
	/**
	 *クラス名:draw
	 *概　要:＃で平行四辺形を描画する
	 *引　数:なし
	 *戻り値:なし
	 *作成日:2023/5/10
	 */
	public  void draw() {
		//平行四辺形の高さ分ループする
		for(int i=1; i<=height; i++) {
			//平行四辺形を描画するのに必要な空白を表示するためのループ
			for(int j=1; j<=height-i; j++) {
				//空白を表示する
				System.out.print(" ");
			}
			//平行四辺形を表示するためのループ
			for(int k=1; k<=baseWidth; k++) {
				//＃を表示する
				System.out.print("#");
			}
			//次の行の描画のために改行する
			System.out.println();
		}
	}
}

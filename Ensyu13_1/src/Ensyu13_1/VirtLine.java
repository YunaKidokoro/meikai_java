package Ensyu13_1;
/*
 * クラス名:VirtLine
 * 概　要:垂直直線を表すクラス(抽象クラスShapeからの派生クラス)
 * 作成者:yuna
 * 作成日:2023/5/9
 * */
public class VirtLine extends AbstLine{
	
	//垂直直線を生成するコンストラクタ
	public VirtLine(int length) {
		//スーパーコンストラクタ
		super(length);
	}
	/*
	 * 関数名:toString
	 * 概　要:垂直直線の図形情報に関する文字列を返却する
	 * 引　数:なし
	 * 戻り値:VirtLine(Length:3)を返却する、３の所には長さが表示される
	 * */
	public  String toString() {
		//VirtLine(Length:長さ)を返却する
		return "VirtLine(length:"+getLength()+")";
	}
	/*
	 * 関数名:draw
	 * 概　要:|記号を縦に並べる、
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/9
	 * */
	public void draw() {
		//直線の長さの分だけループする
		for(int i=0 ; i<getLength(); i++) {
			//|を表示する
			System.out.println("|");
		}
	}
}
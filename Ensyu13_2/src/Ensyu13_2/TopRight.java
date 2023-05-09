package Ensyu13_2;
/*
 *クラス名:TopRight
 *概　要:右上直角二等辺三角形を表すクラス(AbstIsoscelesからの派生クラス)
 *作成者:yuna
 *作成日:2023/5/9
 * */
public class TopRight extends AbstIsosceles {
	
	//左上直角二等辺三角形のインスタンスを生成するコンストラクタ
	public TopRight(int length) {
		//スーパーコンストラクタ
		super(length);
	}
	/*
	 * 関数名:toString
	 * 概　要:右上直角二等辺三角形の図形情報に関する文字列を返却する
	 * 引　数:なし
	 * 戻り値:AbstIsosceles(Length:3)を返却する、
	 * 		　３の所には辺の長さが表示される
	 * */
	public  String toString() {
		//AbstLine(Length:辺の長さ)を返却する
		return "右上直角二等辺三角形(length:"+getLength()+")";
	}
	/*
	 * 関数名:draw
	 * 概　要:*記号を並べて三角形を描画する
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/9
	 * */
	public void draw(){
		//辺の長さ分ループする
		for (int i=getLength(); i>0; i--) {
			//スペースを表示する分のループ
			for(int k = 0; k<getLength()-i; k++) {
				//スペースを表示
				System.out.print(' ');
			}
			//*を表示する分のループ
			for (int j = i; j>0; j--) {
				//＊を表示する
				System.out.print('*');
				}
			//一列表示したら次の行へ
			System.out.println();
			}
		}
}

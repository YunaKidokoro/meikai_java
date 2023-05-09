package Ensyu13_2;
/*
 *クラス名:TopLeft
 *概　要:左上直角二等辺三角形を表すクラス(AbstIsoscelesからの派生クラス)
 *作成者:
 *作成日:
 * */
public class TopLeft extends AbstIsosceles{
	
	//左上直角二等辺三角形のインスタンスを生成するコンストラクタ
	public TopLeft(int length) {
		//スーパーコンストラクタ
		super(length);
	}
	/*
	 * 関数名:toString
	 * 概　要:左上直角二等辺三角形の図形情報に関する文字列を返却する
	 * 引　数:なし
	 * 戻り値:AbstIsosceles(Length:3)を返却する、
	 * 		　３の所には辺の長さが表示される
	 * */
	public  String toString() {
		//AbstLine(Length:辺の長さ)を返却する
		return "左上直角二等辺三角形(length:"+getLength()+")";
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
		for (int i = 0; i < getLength(); i++) {
			//横の長さがだんだん減るようにループ
			for (int j = (getLength() - i); j > 0; j--) {
				//＊を表示する
				System.out.print('*');
				}
			//一列表示したら次の行へ
			System.out.println();
			}
		}
	}

package Ensyu2_2;
/*
 * クラス名:Ensyu2_2
 * 概要:演習2-2
 * 作成者:城所佑奈
 * 作成日:2023/04/05
 */
public class Ensyu2_2 {
	/*
	 * 関数名:main
	 * 概要:3つのint型に値を代入して演算を行う
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/05
	 * */
	public static void main(String[]args) {
		//変数x,y,zをint型で宣言。
		int x, y, z;
		//変数xに10を代入。
		x = 10;
		//変数yに20を代入。
		y = 20;
		//変数zに30を代入。
		z = 30;
		//標準出力ストリームを用いてそれぞれの表示を行う。
		//変数xの値を表示。
		System.out.println("xの値は"+x+"です。");
		//変数yの値を表示。
		System.out.println("yの値は"+y+"です。");
		//変数zの値を表示。
		System.out.println("zの値は"+z+"です。");
		//変数x,y,zの合計値を表示。
		System.out.println("合計は"+(x+y+z)+"です。");
		//変数x,y,zの平均を表示。
		System.out.println("平均は"+(x+y+z)/3+"です。");
	}
}

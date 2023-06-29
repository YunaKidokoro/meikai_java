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
		//変数１、２、３をint型で宣言。
		int firstInteger, secondInteger, thirdInteger;
		//変数１に10を代入。
		firstInteger = 10;
		//変数２に20を代入。
		secondInteger = 20;
		//変数３に30を代入。
		thirdInteger = 30;
		//標準出力ストリームを用いてそれぞれの表示を行う。
		//変数１の値を表示。
		System.out.println("変数1の値は"+firstInteger+"です。");
		//変数２の値を表示。
		System.out.println("変数2の値は"+secondInteger+"です。");
		//変数３の値を表示。
		System.out.println("変数3の値は"+thirdIntenger+"です。");
		//３つの変数の合計値を表示。
		System.out.println("合計は"+(firstInteger+secondInteger+thirdInteger)+"です。");
		//３つの変数の平均を表示。
		System.out.println("平均は"+(firstInteger+secondInteger+thirdInteger)/3+"です。");
	}
}

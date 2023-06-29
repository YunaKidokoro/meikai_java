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
		int FirstInteger, SecondInteger, ThirdInteger;
		//変数１に10を代入。
		FirstInteger = 10;
		//変数２に20を代入。
		SecondInteger = 20;
		//変数３に30を代入。
		ThirdInteger = 30;
		//標準出力ストリームを用いてそれぞれの表示を行う。
		//変数１の値を表示。
		System.out.println("変数1の値は"+FirstInteger+"です。");
		//変数２の値を表示。
		System.out.println("変数2の値は"+SecondInteger+"です。");
		//変数３の値を表示。
		System.out.println("変数3の値は"+ThirdIntenger+"です。");
		//３つの変数の合計値を表示。
		System.out.println("合計は"+(FirstInteger+SecondInteger+ThirdInteger)+"です。");
		//３つの変数の平均を表示。
		System.out.println("平均は"+(FirstInteger+SecondInteger+ThirdInteger)/3+"です。");
	}
}

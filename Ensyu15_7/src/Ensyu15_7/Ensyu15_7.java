package Ensyu15_7;
/**
 * Ensyu15_7<br>演習15-7<br>
 * 作成日：2023/5/12
 * @author yuna
 */
public class Ensyu15_7 {
	/**
	 * main<br>
	 * コマンドライン引数で与えられた数値を拡張for文を用いて加算する<br>
	 * 作成日：2023/5/12
	 * @param args 実数
	 * @return なし
	 */
	public static void main(String[]args) {
		//合計値を表す変数を宣言
		double sumValue = 0;
		//コマンドライン引数への参照を要素として持つ配列を順にループする
		for(String argsArray: args) {
			//配列要素を数値に変えて、合計値に加算していく
			sumValue += Double.parseDouble(argsArray);
		}
		//合計値を表示する
		System.out.println("合計は"+sumValue+"です。");
	}
}
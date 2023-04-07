package Ensyu2_4;
//単一型インポート宣言、
//キーボードからの入力を行うためにjava.util.Scannerをインポート
import java.util.Scanner;
/*
 * クラス名:Ensyu2_4
 * 概要:演習2-4
 * 作成者:城所佑奈
 * 作成日:2023/04/05
 * */
public class Ensyu2_4 {
/*
 * 関数名:main
 * 概要:キーボードから入力された値を用いて演算を行う
 * 引数:なし
 * 戻り値:なし
 * 作成者:城所佑奈
 * 作成日:2023/04/05
 */
public static void main(String[] args) {
		//変数InputNumberを用意して、入力ストリームを渡す。
		Scanner InputNumber = new Scanner(System.in);
		//標準出力ストリームで「整数値：」の文とともに値の入力を促す。
		System.out.print("整数値：");
		//変数VariableNumberに入力さえた値を読み込む。
		int VariableNumber = InputNumber.nextInt();
		//変数xに入力された値に10を加減した値をそれぞれ表示する。
		System.out.println("10を加えた値は"+(VariableNumber+10)+"です。");
		System.out.println("10を減じた値は"+(VariableNumber-10)+"です。");
	}
}

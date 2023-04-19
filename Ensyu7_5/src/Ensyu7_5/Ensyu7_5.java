package Ensyu7_5;
//Scannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_5
* 概要:演習7-5
* 作成者:城所佑奈
* 作成日:2023/04/19
* */
public class Ensyu7_5 {
	/*
	 * 関数名:hello
	 * 概要:「こんにちは。」と表示して改行する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	static void hello() {
		//こんにちは。と表示する
		System.out.println("こんにちは。");
	}
	/*
	 * 関数名:main
	 * 概要:入力された名前の人に挨拶する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputtext = new Scanner(System.in);
		//整数の入力を促す文を表示
		System.out.print("名前：");
		//入力された値を読み込む
		String inputName = inputtext.next();
		//入力の反復
		System.out.print(inputName +"さん");
		//挨拶文を表示する
		hello();
	}
}
package Ensyu2_3;
//単一型インポート宣言、
//キーボードからの入力を行うためにjava.util.Scannerをインポート
import java.util.Scanner;
/*
* クラス名:Ensyu2_3
* 概要:演習2-3
* 作成者:城所佑奈
* 作成日:2023/04/05
* */
public class Ensyu2_3 {
	/*
	* 関数名:main
	* 概要:キーボードから値を入力して表示
	* 引数:なし
	* 戻り値:なし
	* 作成者:城所佑奈
	* 作成日:2023/04/05
	* */
	public static void main(String[] args) {
		//変数InputNumberを用意して、入力ストリームを渡す。
		Scanner InputNumber = new Scanner(System.in);
		//標準出力ストリームを用いて「整数値：」の文を表示して入力を促す。
		System.out.print("整数値：");
		//変数xに入力さえた値を読み込む。
		int x = InputNumber.nextInt();
		//入力された値を反復する文の表示。
		System.out.print(x+"と入力しましたね。");
	}
}

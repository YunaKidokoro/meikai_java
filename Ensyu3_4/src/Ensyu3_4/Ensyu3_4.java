package Ensyu3_4;
//キーボードからの入力をするためにjave.util.Scannerをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu3_4
 * 概要:演習問題3-4
 * 作成者:城所佑奈
 * 作成日:2023/04/06
 * */
public class Ensyu3_4 {
	/*
	 * 関数名:main
	 * 概要:２つの入力された値の大小関係の判定
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/06
	 * */
	public static void main(String[]args) {
		//変数に入力ストリームを渡す。
		Scanner InputNumber = new Scanner(System.in);
		//aの値の入力を促す。
		System.out.print("aの値：");
		//aの値を読み込む。
		double intengerA = InputNumber.nextDouble();
		//bの値の入力を促す。
		System.out.print("bの値：");
		//bの値を読み込む。
		double intengerB = InputNumber.nextDouble();
		//aがbより大きい場合
		if (intengerA > intengerB)
			System.out.println("aのほうが大きいです。");
		//aがbより小さい場合
		else if (intengerA < intengerB)
			System.out.println("bのほうが大きいです。");
		//aとbが等しい場合
		else 
			System.out.println("aとbは同じ値です。");
	}
}

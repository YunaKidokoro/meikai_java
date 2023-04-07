package Ensyu3_15;
//キーボードからの入力を行うためにjava.util.Scannerをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu3_15
* 概要:演習3-15
* 作成者:城所佑奈
* 作成日:2023/04/07
* */
public class Ensyu3_15 {
	/*
	 * 関数名:main
	 * 概要入力された値を降順にソートする。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/07
	 * */
	public static void main(String[]args) {
		//変数に入力ストリームを渡す。
		Scanner InputNumber = new Scanner(System.in);
		//変数aの入力を促す。
		System.out.print("整数a:");
		//入力された値を読み込む。
		int IntengerA = InputNumber.nextInt();
		
		//変数bの入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int IntengerB = InputNumber.nextInt();
		
		//入力された整数の大小を判定する。
		if(IntengerA < IntengerB) {
			//値の入れ替え用の仮置き用変数を宣言する。
			int OnlynowNumber = IntengerA;
			IntengerA = IntengerB;
			IntengerB = OnlynowNumber;
		}
		System.out.println("降順にソートしました。");
		System.out.println("整数aは"+IntengerA+"です。");
		System.out.println("整数bは"+IntengerB+"です。");
	}
}


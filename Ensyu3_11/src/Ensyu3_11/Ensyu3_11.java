package Ensyu3_11;
//キーボードからの入力を行うためにjava.util.Scannerをインポート
import java.util.Scanner;
/*
 * クラス名:Ensyu3_11
 * 概要:演習3-10
 * 作成者:城所佑奈
 * 作成日:2023/04/07
 * */
public class Ensyu3_11 {
	/*
	 * 関数名:main
	 * 概要:入力された値の差が10より大きいか小さいかを表示。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/07
	 * */
	public static void main(String[]ars) {
		//変数に入力ストリームを渡す
		Scanner InputNumber = new Scanner(System.in);
		//１つめの実数の入力を促す。
		System.out.print("整数a:");
		//入力された値を読み込む
		int IntengerA = InputNumber.nextInt();
		//2つめの実数の入力を促す。
		System.out.print("整数b:");
		//入力された値を読み込む。
		int IntengerB = InputNumber.nextInt();
		//差分を表す変数を宣言
		int Delta; 
		//入力された値の大小を判定
		if(IntengerA>IntengerB)
			//整数aの方が大きいときの差を求める
			Delta = IntengerA - IntengerB;
		else
			//整数bの方が大きいときの差を求める
			Delta = IntengerB - IntengerA;
		//その差が10以下かどうか
		if(Delta < 10)
			//差分が10以下であることを表示する。
			System.out.println("それらの差は10以下です。");
		else
			//差分が11以上であること表示する。
			System.out.println("それらの差は11以上です。");
	}
}
package Ensyu3_8;
//キーボードからの入力を行うためにjava.util.Scannerをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu3_8
 * 概要:演習3-8
 * 作成者:城所佑奈
 * 作成日:2023/04/06
 * */
public class Ensyu3_8 {
	/*
	 * 関数名:main
	 * 概要:入力された点数に対して判定を行い評価を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/06
	 * */
	public static void main(String[]args) {
		//変数に標準出力ストリームを渡す
		Scanner InputNumber = new Scanner(System.in);
		//点数の入力を求める
		System.out.print("点数を入力してください：");
		//入力された値を変数Scoreに読み込む
		int Score = InputNumber.nextInt();
		//入力された値の判定を行う
		//点数が80~100の場合
		if (Score>=80 && Score<=100)
			System.out.println("優");
		//点数が70~79の場合
		else if (Score>=70 && Score<=79)
			System.out.println("良");
		//点数が60~69の場合
		else if (Score>=60 && Score<=69)
		System.out.println("可");
		//点数が0~59の場合
		else if (Score>=0 && Score<=59)
			System.out.println("可");
		//入力ミス等の場合
		else;
			//System.out.println("入力を確認してください。");
	}
}

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
		Scanner inputNumber = new Scanner(System.in);
		//点数の入力を求める
		System.out.print("点数を入力してください：");
		//入力された値を変数scoreValueに読み込む
		int scoreValue = inputNumber.nextInt();
		//入力された値の判定を行う
		//点数が80~100の場合
		if (scoreValue>=80 && scoreValue<=100)
			//評価「優」を表示する
			System.out.println("優");
		//点数が70~79の場合
		else if (scoreValue>=70 && scoreValue<=79)
			//評価「良」を表示する
			System.out.println("良");
		//点数が60~69の場合
		else if (scoreValue>=60 && scoreValue<=69)
			//評価「可」を表示する
		System.out.println("可");
		//点数が0~59の場合
		else if (scoreValue>=0 && scoreValue<=59)
			//評価「不可」を表示する
			System.out.println("不可");
		//0点以下、または100点以上の場合
		else
			//入力された値の確認を促す文を表示する
			System.out.println("入力を確認してください。");
	}
}

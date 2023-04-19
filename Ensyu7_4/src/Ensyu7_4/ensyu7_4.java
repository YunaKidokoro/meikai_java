package Ensyu7_4;
//Scannerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_4
 * 概要:演習7-4
 * 作成者:城所佑奈
 * 作成日:2023/04/19
 * */
public class ensyu7_4 {
	//１からｎまでの全整数の和を求めるメソッド
	//メソッド名や仮引数は教本の指示に従う
	static int sumUp(int n) {
		//全整数の和を表す変数を宣言
		int sumValue = 0;
		//イテレータを１からｎまで回す
		for(int indexNumber=1 ; indexNumber<=n ; indexNumber++) {
			//整数をひとつずつたしていく
			sumValue += indexNumber;
		}
		//全整数の和を戻り値とする
		return sumValue;
	}
	/*
	 * 関数名:main
	 * 概要:１から入力値までの全整数の和を表示する
	 * 引数:inputInteger、入力された値を表す
	 * 戻り値:sumValue、１からｎまでの全整数の和を表す
	 * 作成者:城所佑奈
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//1から入力した値までの全整数の和を表示することを表示
		System.out.println("1から入力した値までの全整数の和を表します");
		//スキャナークラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		//入力された値を表す変数を宣言
		int inputInteger = 0;
		//ループの開始
		do {
			//整数の入力を促す文を表示
			System.out.print("整数：");
			//入力された値を読み込む
			inputInteger = inputNumber.nextInt();
		//入力値が０以下の場合はループする
		}while(inputInteger<=0);
		//計算結果を表示する
		System.out.print(sumUp(inputInteger));
	}
}

package Ensyu6_9;
//Randomクラスをインポートする
import java.util.Random;
//Scannerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名：Ensyu6_9
 * 概要：演習6-9
 * 作成者：城所佑奈
 * 作成日：2023/04/14
 * */
public class Ensyu6_9 {
	/*
	 * 関数名：main
	 * 概要：1~10のランダムな値を配列要素を持つint型の配列を作る。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：城所佑奈
	 * 作成日：2023/04/14
	 * */
	public static void main(String[]args) {
		//Randomクラスのインスタンスを初期化する
		Random randomNumber = new Random();
		//Scannerクラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		
		//要素数を表す変数を宣言する
		int elementNumber = 0;
		//ループの開始
		do {
			//要素数の入力を促す文を表示
			System.out.print("要素数：");
			//入力された値を読み込む
			elementNumber = inputNumber.nextInt();
		//入力された値が0以下の場合繰り返す
		}while(elementNumber<=0);
		
		//配列の宣言
		int[] variableArray = new int[elementNumber]; 
		//配列の先頭から末尾まで走査
		for (int indexNumber=0; indexNumber<elementNumber; indexNumber++) {
			//ランダムな値で配列要素を初期化する
			variableArray[indexNumber] = randomNumber.nextInt(10)+1;
			//配列要素を表示する
			System.out.println("a["+indexNumber+"]="+variableArray[indexNumber]);
		}
	}
}

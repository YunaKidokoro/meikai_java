package Ensyu6_10;
//ランダムな値を生成するためにRandomクラスをインポートする
import java.util.Random;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_10
 * 概要:演習6-10
 * 作成者:城所佑奈
 * 作成日:2023/04/17
 * */
public class Ensyu6_10 {
	/*
	 * 関数名:main
	 * 概要:ランダムな値を生成し配列要素を初期化する、
	 * 		ただし連続する配列要素は同じ値を持たない。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/17
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
			//ひとつ前の配列要素と値が同じ場合
			if(indexNumber!=0 && variableArray[indexNumber]==variableArray[indexNumber-1]) {
				//もう一度同じインデックスで処理を行うのにインデックスを減らしておく
				indexNumber--;
				//ループの先頭に戻る
				continue;
			}
			//配列要素を表示する
			System.out.println("a["+indexNumber+"]="+variableArray[indexNumber]);
		}
	}
}

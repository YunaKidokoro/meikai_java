package Ensyu6_11;
//ランダムな値を生成するためにRandomクラスをインポートする
import java.util.Random;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu6_11
* 概要:演習6-11
* 作成者:城所佑奈
* 作成日:2023/04/17
* */
public class Ensyu6_11 {
	/*
	 * 関数名:main
	 * 概要:ランダムな値を生成し配列要素を初期化する、
	 * 		ただし配列要素は互いに同じ値を持たない。
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
			System.out.print("要素数(10以下)：");
			//入力された値を読み込む
			elementNumber = inputNumber.nextInt();
		//入力された値が0以下の場合繰り返す
		}while(elementNumber<=0 ||elementNumber>=11);

		//配列の宣言
		int[] variableArray = new int[elementNumber]; 
		Outer:
			//配列の先頭から末尾まで走査
			for (int firstIndex=0; firstIndex<elementNumber; firstIndex++) {
				//ランダムな値で配列要素を初期化する
				variableArray[firstIndex] = randomNumber.nextInt(10)+1;
				//生成された値を探すべき値を表す変数に代入
				int keyNumber = variableArray[firstIndex];
				
				//インデックスの先頭から末尾まで走査
				for(int secondIndex=1 ; secondIndex<=firstIndex ; secondIndex++) {
					//新しい配列要素の値がかぶっている場合
					if(variableArray[secondIndex-1] == keyNumber) {
						//同じインデックスで乱数を生成し直すためにデクリメントする
						firstIndex--;
						//ループの先頭に戻る
						continue Outer;
					}
				}
				//配列要素を表示する
				System.out.println("a["+firstIndex+"]="+variableArray[firstIndex]);
			}
	}
}
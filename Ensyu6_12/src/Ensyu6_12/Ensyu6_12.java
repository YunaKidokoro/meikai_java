package Ensyu6_12;
//ランダムな値を生成するためにRandomクラスをインポートする
import java.util.Random;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu6_12
* 概要:演習6-12
* 作成者:城所佑奈
* 作成日:2023/04/17
* */
public class Ensyu6_12 {
	/*
	 * 関数名:main
	 * 概要:配列要素の並びをシャッフルする
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
		//配列の先頭から末尾までループする
		for(int indexNumber=0; indexNumber<elementNumber ; indexNumber++) {
			//インデックスに対して＋1の値を配列要素が持つように代入
			variableArray[indexNumber] = indexNumber+1;
			//配列要素を表示する
			System.out.println("a["+indexNumber+"]="+variableArray[indexNumber]);
		}
		//配列要素をシャッフルすることを表示する
		System.out.println("要素の並びをシャッフルする。");
		//シャッフルされた後の配列を宣言
		int[] newArray = new int[elementNumber]; 
		
		//ループのラベル
		Outer:
		//配列の先頭から末尾までループする
		for(int firstIndex=0; firstIndex<elementNumber; firstIndex++) {
			//ランダムな値のインデックスを作る
			int randomIndex = randomNumber.nextInt(elementNumber);
			//シャッフル後の配列にランダムなインデックスの配列要素を代入
			newArray[firstIndex] = variableArray[randomIndex];
			//ランダムなインデックスの配列要素を探すべき値を表す変数に代入
			int keyNumber = variableArray[randomIndex];
			
			//インデックスの先頭から末尾まで走査
			for(int secondIndex=1 ; secondIndex<=firstIndex ; secondIndex++) {
				//新しい配列要素の値がかぶっている場合
				if(newArray[secondIndex-1] == keyNumber) {
					//同じインデックスで乱数を生成し直すためにデクリメントする
					firstIndex--;
					//ラベルの位置に戻る
					continue Outer;
				}
			}
		//配列要素を表示する
		System.out.println("a["+firstIndex+"]="+newArray[firstIndex]);
		}
	}
}
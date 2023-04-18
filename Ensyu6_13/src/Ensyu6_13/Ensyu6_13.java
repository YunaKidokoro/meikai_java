package Ensyu6_13;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu6_13
* 概要:演習6-13
* 作成者:城所佑奈
* 作成日:2023/04/17
* */
public class Ensyu6_13 {
	/*
	 * 関数名:main
	 * 概要:配列要素を別の配列に逆順にコピーする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/17
	 * */
	public static void main(String[]args) {
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
		int[] baseArray = new int[elementNumber]; 
		//配列の先頭から末尾までループする
		for(int indexNumber=0; indexNumber<elementNumber ; indexNumber++) {
			//インデックスに対して＋1の値を配列要素が持つように代入
			baseArray[indexNumber] = indexNumber+1;
			//配列要素を表示する
			System.out.println("a["+indexNumber+"]="+baseArray[indexNumber]);
		}
		//コピーされた配列を宣言
		int[] copyArray = new int[elementNumber]; 
		//配列の先頭から末尾までループする
		for(int firstIndex=0; firstIndex<elementNumber; firstIndex++) {
			//コピーの配列に元の配列要素の末尾の値から代入していく
			copyArray[firstIndex] = baseArray[elementNumber-1-firstIndex];
		}
		
		//配列要素を逆順にコピーしたことを表示
		System.out.println("aの全要素をbに逆順にコピーしました。");
		//配列の先頭から末尾までループする
		for(int secondIndex=0; secondIndex<elementNumber; secondIndex++) {
			//配列要素を表示する
			System.out.println("b["+secondIndex+"]="+ copyArray[secondIndex]);
		}
	}
}
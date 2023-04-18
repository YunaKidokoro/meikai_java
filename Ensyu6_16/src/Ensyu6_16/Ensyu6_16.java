package Ensyu6_16;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_16
 * 概要:演習6-16
 * 作成者:城所佑奈
 * 作成日:2023/04/18
 * */
public class Ensyu6_16 {
	/*
	 * 関数名:main
	 * 概要:４行３列と３行４列の積を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/18
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する
		Scanner inputValue = new Scanner(System.in);
		
		//４行３列の配列を宣言
		double [][]firstArray = new double [4][3];
		//４行３列の配列の配列要素を入力してください。
		System.out.println("４行３列の配列の配列要素を入力してください。");
		//４行３列の配列の先頭から末尾まで行ループする
		for(int lineIndex = 0; lineIndex<4; lineIndex++) {
			//配列の先頭から末尾まで列ループ
			for(int rowIndex = 0; rowIndex<3 ; rowIndex++) {
				//入力する配列のインデックスを表示
				System.out.print("A["+lineIndex+"]["+rowIndex+"]=");
				//配列要素を入力して読み込む
				firstArray[lineIndex][rowIndex] = inputValue.nextDouble();
			}
		}
		//３行４列の配列を宣言
		double [][]secondArray = new double [3][4];
		//３行４列の配列の配列要素を入力してください。
		System.out.println("３行４列の配列の配列要素を入力してください。");
		//３行４列の配列の先頭から末尾まで行ループする
		for(int lineIndex = 0; lineIndex<3; lineIndex++) {
			//配列の先頭から末尾まで列ループ
			for(int rowIndex = 0; rowIndex<4 ; rowIndex++) {
				//入力する配列のインデックスを表示
				System.out.print("B["+lineIndex+"]["+rowIndex+"]=");
				//配列要素を入力して読み込む
				secondArray[lineIndex][rowIndex] = inputValue.nextDouble();
			}
		}
		//改行をする
		System.out.println();
		//計算後の値を代入するための４行４列の配列を宣言
		double [][]resultArray = new double [4][4];
		//配列の先頭から末尾まで行ループ
		for(int  firstIndex= 0; firstIndex<4; firstIndex++) {
			//配列の先頭から末尾まで列ループ
			for(int  secondIndex= 0; secondIndex<4; secondIndex++) {
				//配列の先頭から末尾まで列ループ
				for(int thirdIndex=0; thirdIndex<3; thirdIndex++) {
					//積の計算を行う
					resultArray[firstIndex][secondIndex] += firstArray[firstIndex][thirdIndex]*secondArray[thirdIndex][secondIndex];
				}
			}
		}
		//計算結果を表示することを、表示する
		System.out.println("行列Aと行列Bの積は");
		//4行４列の配列の先頭から末尾まで行ループする
		for(int lineIndex = 0; lineIndex<4; lineIndex++) {
			//配列の先頭から末尾まで列ループ
			for(int rowIndex = 0; rowIndex<4 ; rowIndex++) {
				//計算結果の表示
				System.out.printf("%4.1f  ",resultArray[lineIndex][rowIndex]);
			}
			//改行を行う
			System.out.println();
		}
	}
}

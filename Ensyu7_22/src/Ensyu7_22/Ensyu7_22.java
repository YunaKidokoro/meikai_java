package Ensyu7_22;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_22
* 概要:演習7-22
* 作成者:城所佑奈
* 作成日:2023/04/24
* */
public class Ensyu7_22 {
	//スキャナークラスのインスタンスを初期化
	static Scanner inputNumber = new Scanner(System.in);
	
	/*
	 * 関数名:readPlusInt
	 * 概要:正の整数値の入力を求め、その値を返す
	 * 引数:なし
	 * 戻り値:int型・plusInteger・入力された値を表す変数
	 * 作成日:2023/04/21
	 * */
	static int readPlusInt() {
		//正の整数を表す変数を宣言
		int plusInteger=0;
		//ループの開始
		do {
			//正の整数値の入力を促す文を表示
			System.out.print("整数:");
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
		//入力が0以下の場合は繰り返す
		}while(plusInteger <=0);
		//入力された値を返す
		return plusInteger;
	}

	/*
	 * 関数名:arrayInput
	 * 　概要:各配列要素を入力して返す
	 * 　引数:int型　・elementValue・配列要素の数
	 * 		　string型・labelString・配列変数を表す文字
	 * 戻り値:int[]型・inputArray・入力した値の格納された配列を返す
	 * 作成日:2023/04/21
	 * */
	static int[] arrayInput(int elementValue, String labelString) {
		//配列の宣言
		int []inputArray = new int[elementValue];
		//配列のインデックスが0から配列要素数分ループする
		for(int i=0; i<elementValue ;i++) {
			//値を入力する配列のインデックスを表示
			System.out.print(labelString+"["+i+"]=");
			//入力された値を配列に代入する
			inputArray[i] = inputNumber.nextInt();
		}
		//値の格納された配列を返す
		return inputArray;
	}
	
	/*このメソッド内の命名は教本に従う
	 * 関数名:aryClone
	 * 　概要:配列aと同じ配列を生成して返却する
	 * 　引数:int[]型・a[]・コピー元の配列
	 * 戻り値:int[]型・copyArray[]・コピーした配列
	 * 作成日:2023/04/24
	 * */
	static int[] arrayClone(int[]a) {
		//配列aと長さの配列を宣言する
		int []copyArray = new int[a.length];
		//配列の先頭から末尾までループ
		for(int i=0 ; i<a.length ; i++) {
			//コピー元の配列要素の値を代入していく
			copyArray[i] = a[i];
		}
		//コピーした配列を返す
		return copyArray;
	}


	/*
	 * 関数名:printArray
	 * 　概要:配列要素を表示する
	 * 　引数:int[]型・printArray[]・表示した配列
	 * 		　string型・labelString・配列変数を表す文字
	 * 戻り値:なし
	 * 作成日:2023/04/21
	 * */
	static void printArray(int[]printArray, String labelString) {
		//配列の先頭から末尾までループ
		for(int i=0; i < printArray.length ; i++) {
			//インデックスiの配列要素を表示する
			System.out.println(labelString+"["+ i +"]="+printArray[i]);
		}
	}

	/*
	 * 関数名:main
	 * 概要:
	 * 引き数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/21
	 *  */
	public static void main(String[]args) {
		//配列要素数を入力させる
		System.out.println("配列Aの要素数を入力してください。");
		//変数に入力された値を読み込む
		int elementValueA = readPlusInt();
		//配列要素を代入する
		int []inputArrayA = arrayInput(elementValueA, "a");

		//配列のコピーを作ることを表示する
		System.out.println("配列Aのコピーを作ります。");
		//値の挿入された配列を表示する
		printArray(arrayClone(inputArrayA), "a'");
	}
}
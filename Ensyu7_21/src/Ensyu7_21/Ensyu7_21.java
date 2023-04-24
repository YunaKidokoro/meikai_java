package Ensyu7_21;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_21
* 概要:演習7-21
* 作成者:城所佑奈
* 作成日:2023/04/21
* */
public class Ensyu7_21 {
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
	 * 関数名:aryExchng
	 * 　概要:配列aに配列bの値を入れ替えた配列を返す
	 * 　引数:int[]型・a[]・配列要素を入れ替えたい配列
	 * 		　int[]型・b[]・配列aに入れ替えたい要素の配列
	 * 戻り値:なし
	 * 作成日:2023/04/21
	 * */
	static void aryExchng(int[]a, int []b) {
		//配列の参照を入れ替えるための仮置き用配列の宣言
		int []onceArray = a;
		
		//配列aの方が長い場合
		if(a.length > b.length) {
			//配列aが配列b（短い方）を参照するようにする。
			a = b;
			//配列bが配列a（長い方）を参照するようにする。
			b = onceArray;
		}
		
		//配列aとは参照の異なり、配列aの要素の値を持つ配列を宣言
		int []elementArrayA = new int [a.length];
		//インデックスが先頭から末尾までループする
		for(int i=0 ; i<a.length ; i++) {
			//配列aの要素を代入する
			elementArrayA[i] = a[i];
		}
		//配列要素の少ない方の配列でインデックスが先頭から末尾までループする
		for(int i=0 ; i<a.length ; i++) {
			//配列aに配列bの要素を入れ替える
			a[i] = b[i];
			//配列bにもともとの配列aの要素を入れ替える。
			b[i] = elementArrayA[i];
		}
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
	 * 概要:配列要素の入れ替え
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

		//配列要素数を入力させる
		System.out.println("配列Bの要素数を入力してください。");
		//変数に入力された値を読み込む
		int elementValueB = readPlusInt();
		//配列要素を代入する
		int []inputArrayB = arrayInput(elementValueB, "b");

		//配列要素の入れ替えをすることを表示
		System.out.println("配列Aと配列Bの要素を入れ替えます。");
		aryExchng(inputArrayA, inputArrayB);
		//配列を表示する
		printArray(inputArrayA, "a");
		//コンソール画面を見やすくしたいので改行をいれる
		System.out.println();
		//配列を表示する
		printArray(inputArrayB, "b");	
	}
}
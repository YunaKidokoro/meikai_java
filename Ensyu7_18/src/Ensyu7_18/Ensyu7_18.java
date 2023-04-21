package Ensyu7_18;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_18
* 概要:演習7-18
* 作成者:城所佑奈
* 作成日:2023/04/21
* */
public class Ensyu7_18 {
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
	 * 戻り値:int[]型・inputArray・入力した値の格納された配列を返す
	 * 作成日:2023/04/21
	 * */
	static int[] arrayInput(int elementValue) {
		//配列の宣言
		int []inputArray = new int[elementValue];
		//配列のインデックスが0から配列要素数分ループする
		for(int i=0; i<elementValue ;i++) {
			//値を入力する配列のインデックスを表示
			System.out.print("a["+i+"]=");
			//入力された値を配列に代入する
			inputArray[i] = inputNumber.nextInt();
		}
		//値の格納された値を返す
		return inputArray;
	}
	/*このメソッドの内の命名は教本に従う
	 * 関数名:aryRmv
	 * 　概要:配列からある値を削除する
	 * 　引数:int[]型・a[]・削除したい値のある配列
	 * 		　　int型・idx・削除したい配列要素の値
	 * 戻り値:int[]型・a[]・ある値の削除された配列
	 * 作成日:2023/04/21
	 * */
	static int[] aryRmv(int[]a, int idx) {
		//配列の削除したい値からずれる分までループする
		for(int i=0; i < a.length-idx-1 ; i++) {
			//一つ隣の値を代入する
			a[idx + i] = a[idx + 1 + i];
		}
		//ある値の削除された配列を返す
		return a;
	}

	/*
	 * 関数名:printArray
	 * 　概要:配列要素を表示する
	 * 　引数:int[]型・printArray[]・表示した配列
	 * 戻り値:なし
	 * 作成日:2023/04/21
	 * */
	static void printArray(int[]printArray) {
		//配列の先頭から末尾までループ
		for(int i=0; i < printArray.length ; i++) {
			//インデックiの配列要素を表示する
			System.out.println("a["+ i +"]="+printArray[i]);
		}
	}

	/*
	 * 関数名:main
	 * 概要:配列から任意の配列要素が削除された配列を表示する
	 * 引き数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/21
	 *  */
	public static void main(String[]args) {
		//配列要素数を入力させる
		System.out.println("配列要素の数を入力してください。");
		//変数に入力された値を読み込む
		int elementValue = readPlusInt();
		//配列要素を代入する
		int []inputArray = arrayInput(elementValue);
		
		//削除するインデックを表す変数を宣言
		int deleteIndex  = 0;
		//削除する配列要素のインデックスの入力を促す文を表示
		System.out.print("削除する配列要素のインデックス：");
		do{
			//入力された値を読み込む
			deleteIndex = inputNumber.nextInt();
			//削除したいインデックが配列要素数以上の場合
			if(deleteIndex>=elementValue) {
				//再入力を求める表示
				System.out.print("もう一度入力して下さい：");}
			}
		//削除したいインデックが配列要素数以上なら繰り返す
		while(deleteIndex>=elementValue);
		
		//配列から入力された配列要素を削除する
		int []deleteArray = aryRmv(inputArray,deleteIndex);
		
		//削除後の配列要素を表示する
		printArray(deleteArray);
	}
}
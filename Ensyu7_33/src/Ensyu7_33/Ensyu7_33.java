package Ensyu7_33;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_33
* 概要:演習7-33
* 作成者:城所佑奈
* 作成日:2023/04/25
* */

class Ensyu7_33 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	//配列要素の最大値を記憶する変数
	static int arrayMax = 0;
	/*
	 *  関数名:arrayInput
	 * 　概要:二次元配列の各配列要素を入力して返す
	 * 　引数:int[][]型・inputArray・配列要素を入力したい配列
	 * 戻り値:int[][]型・inputArray・入力した値の格納された二次元配列を返す
	 * 作成日:2023/04/24
	 * */
	static int[][] arrayInput(int[][] inputArray) {
		
		//引数の配列の要素の値を代入しておく
		arrayMax = inputArray[0][0];
		
		//行のループ
		for(int i=0; i<inputArray.length; i++) {
			//列のループ
			for(int j=0; j<inputArray[i].length ; j++) {
				//値を入力する配列のインデックスを表示
				System.out.print("a["+i+"]["+j+"]=");
				//入力された値を配列に代入する
				inputArray[i][j]= inputNumber.nextInt();
				
				//入力値の方が仮の最大値より大きい場合
				if(arrayMax<inputArray[i][j]) {
					//最大値の値を更新する
					arrayMax = inputArray[i][j];
				}
			}
		}
		//値の格納された値を返す
		return inputArray;
	}
	/*
	 *  関数名:arrayInput
	 * 　概要:各配列要素を入力して返す
	 * 　引数:int型・lineValue・要素数
	 * 戻り値:int[]型・inputArray・入力した値の格納された二次元配列を返す
	 * 作成日:2023/04/24
	 * */
	static int[] arrayInput(int lineValue) {
		//配列の宣言
		int []inputArray = new int[lineValue];
		
		//行のループ
		for(int i=0; i<lineValue; i++) {
			
			//値を入力する配列のインデックスを表示
			System.out.print("a["+i+"]=");
			//入力された値を配列に代入する
			inputArray[i]= inputNumber.nextInt();
			
		}		
		//値の格納された値を返す
		return inputArray;
	}
	/*
	 * 関数名:printArray
	 * 　概要:二次元配列の要素を表示する
	 * 　引数:int[][]型・a[][]・表示したい配列
	 * 戻り値:なし
	 * 作成日:2023/04/25
	 * */
	static void printArray(int[][]a) {
		
		//最大値の桁数を数えるための変数
		int countDigits = 1;
		
		do {
	    	//一桁減らす
			 arrayMax /= 10;
			 //配列の最大値の桁数を数える
			 countDigits++;
		//一桁になるまで繰り返す
		} while (arrayMax > 10);
		
		//表示を揃えるときに使う文字列
	    String digitSpace = "%"+ countDigits +"d";

		//行のループ
		for(int i=0; i < a.length ; i++) {
			//列のループ
			for(int j=0; j<a[i].length; j++) {
				//配列要素を表示する
				System.out.printf(digitSpace , a[i][j]);
			}
			//次の行に移る前に改行をする。
			System.out.println();
		}
	}
	/*
	 * 関数名:printArray
	 * 　概要:配列の要素を表示する
	 * 　引数:int[]型・a[]・表示したい配列
	 * 戻り値:なし
	 * 作成日:2023/04/25
	 * */
	static void printArray(int[]a) {
		//行のループ
		for(int i=0; i < a.length ; i++) {
			//配列要素を表示する
			System.out.print("　"+a[i]);
		}
	}

	/*
	 * 関数名:readInteger
	 * 概要:条件に沿った値の入力を求める
	 * 引数:なし
	 * 戻り値:int型・plusInteger・入力された値を表す変数
	 * 作成日:2023/04/20
	 * */
	static int readInteger() {
		//入力された値を読み込む変数
		int plusInteger = 0;

		do {
			//正の整数値の入力を促す文を表示
			System.out.print(":");
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
		//入力が0以下の場合は繰り返す
		}while(plusInteger<=0);
		//入力された値を返す
		return plusInteger;
	}
	public static void main(String[]args) {
		
		//配列aの行数の入力を促す文を表示
		System.out.print("二次元配列aの行数を入力してください");
		//入力された値を読み込む
		int linesA = readInteger();
		
		//二次元配列を参照するための配列変数を宣言する
		int [][]firstArray = new int[linesA][]; 
		//列数の入力を促す文を表示
		System.out.println("二次元配列aの列数を入力してください");
		//行のループ
		for(int i=0; i<linesA; i++) {
			System.out.print("a["+i+"]");
			//入力された値を読み込む
			firstArray[i] = new int[readInteger()];
		}
		//配列要素の入力を促す文を表示する
		System.out.println("配列aの要素を入力してください");
		//各配列要素の入力を求める
		arrayInput(firstArray);
		//配列aの表示
		printArray(firstArray);
		
		//配列bの行数の入力を促す文を表示
		System.out.print("配列bの行数を入力してください");
		//入力された値を読み込む
		int linesB = readInteger();
		//配列要素の入力を促す文を表示
		System.out.println("配列bの要素を入力してください");
		//各配列要素の入力を読み込む
		int []secondArray = arrayInput(linesB);
		//配列bの表示
		printArray(secondArray);
	}
}
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
	//二次元配列の列ごとの最大桁数を格納する配列
	static int[] arrayMax;
	/*
	 *  関数名:arrayInput
	 * 　概要:二次元配列の各配列要素を入力して返す
	 * 　引数:int[][]型・inputArray・配列要素を入力したい配列
	 * 戻り値:int[][]型・inputArray・入力した値の格納された二次元配列を返す
	 * 作成日:2023/04/24
	 * */
	static int[][] arrayInput(int[][] inputArray) {
		
		//行のループ
		for(int i=0; i<inputArray.length; i++) {
			//列のループ
			for(int j=0; j<inputArray[i].length ; j++) {
				//値を入力する配列のインデックスを表示
				System.out.print("a["+i+"]["+j+"]=");
				//入力された値を配列に代入する
				inputArray[i][j]= inputNumber.nextInt();
			}
		}
		//値の格納された値を返す
		return inputArray;
	}
	/*
	 *  関数名:arrayInput
	 * 　概要:各配列要素を入力して返す
	 * 　引数:int型・lineValue・行数
	 *		　int型・ rowValue・列数
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

		//行のループ
		for(int i=0; i < a.length ; i++) {
			//列のループ
			for(int j=0; j<a[i].length; j++) {
				//各文字の先頭を揃えるのに必要なスペースを表す文字列の準備
				String tabString = "%-"+(1+arrayMax[j])+"d";
				
				//配列要素を表示する
				System.out.printf(tabString, a[i][j]);
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
			System.out.print(" "+a[i]);
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
			System.out.print("");
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
		//入力が0以下の場合は繰り返す
		}while(plusInteger<=0);
		//入力された値を返す
		return plusInteger;
	}
	/*
	 * 関数名:main
	 * 概要:二次元配列と一次元配列の表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/27
	 * */
	public static void main(String[]args) {
	
		//配列aの行数の入力を促す文を表示
		System.out.print("二次元配列aの行数を入力してください:");
		//入力された値を読み込む
		int linesA = readInteger();
		
		//二次元配列を参照するための配列変数を宣言する
		int [][]firstArray = new int[linesA][]; 
		

		//各行の列数の最大値を記憶する変数
		int rowsMax = 0;
		//各行の列数を受け取る変数
		int inputRows = 0;
		
		//列数の入力を促す文を表示
		System.out.println("二次元配列aの列数を入力してください。");
		//行のループ
		for(int i=0; i<linesA; i++) {
			//入力用インデックスの表示
			System.out.print("a["+i+"]=");
			
			//入力された値を読み込む
			inputRows = readInteger();
			//i行目の列数を代入
			firstArray[i] = new int [inputRows];
			//入力された値が仮の最大値よりも大きい場合
			if(rowsMax<inputRows) {
				//最大値を更新する
				rowsMax = inputRows;
			}
		}
		//列ごとの最大文字数を記憶する配列
		arrayMax = new int[rowsMax];
		
		//配列の最大列数を記憶する変数
		rowsMax = 0;
		//配列要素の入力を促す文を表示する
		System.out.println("配列aの要素を入力してください。");
		//配列要素の入力
		arrayInput(firstArray);
		//行のループ
		for(int i=0; i<firstArray.length; i++) {
			//列のループ
			for(int j=0; j<firstArray[i].length; j++) {
				//配列要素の値を文字列に変換する
				String rowsString = String.valueOf(firstArray[i][j]);
				//配列要素の文字列の長さを取得
				inputRows = rowsString.length();
				//配列要素の文字列が仮の最大文字数よりも長い場合
				if(inputRows>arrayMax[j]) {
					//最大値を更新する
					arrayMax[j] = inputRows;
				}
			}
		}		
		//配列aの表示
		printArray(firstArray);
		
		//配列bの行数の入力を促す文を表示
		System.out.print("一次元配列bの要素数を入力してください:");
		//入力された値を読み込む
		int linesB = readInteger();
		//配列要素の入力を促す文を表示
		System.out.println("配列bの要素を入力してください。");
		//各配列要素の入力を読み込む
		int []secondArray = arrayInput(linesB);
		//配列bの表示
		printArray(secondArray);
	}
}
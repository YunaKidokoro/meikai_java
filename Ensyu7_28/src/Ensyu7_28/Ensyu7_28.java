package Ensyu7_28;
//スキャナークラスをインポートする。
import java.util.Scanner ;
/*
* クラス名:Ensyu7_28
* 概要:演習7-28
* 作成者:城所佑奈
* 作成日:2023/04/25
* */
public class Ensyu7_28 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	
	/*
	 *  関数名:arrayInput2d
	 * 　概要:各配列要素を入力して返す
	 * 　引数:int型・lineValue・行数
	 *		　int型・ rowValue・列数
	 * 戻り値:int[]型・inputArray・入力した値の格納された二次元配列を返す
	 * 作成日:2023/04/24
	 * */
	static int[][] arrayInput2d(int lineValue, int rowValue) {
		//配列の宣言
		int [][]inputArray = new int[lineValue][rowValue];
		//行のループ
		for(int i=0; i<lineValue; i++) {
			//列のループ
			for(int j=0; j<rowValue; j++) {
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
	 * 関数名:printArray2d
	 * 　概要:二次元配列の要素を表示する
	 * 　引数:int[][]型・printArray[][]・表示したい配列
	 * 戻り値:なし
	 * 作成日:2023/04/21
	 * */
	static void printArray2d(int[][]printArray) {
		//行のループ
		for(int i=0; i < printArray.length ; i++) {
			//列のループ
			for(int j=0; j<printArray[i].length; j++) {
				//配列要素を表示する
				System.out.printf("%3d",printArray[i][j]);
			}
			//次の行に移る前に改行をする。
			System.out.println();
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
			System.out.print("整数:");
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
		//入力が0以下の場合は繰り返す
		}while(plusInteger<=0);
		//入力された値を返す
		return plusInteger;
	}
	/*このメソッド内の命名は教本に従う
	 * 関数名:addMatrix
	 * 概要:２つの配列の和を求め結果を格納した配列を返す
	 * 引数:int[][]型・ｘ・１つ目の行列
	 * 		int[][]型・ｙ・２つ目の行列
	 * 戻り値:int[][]型・resultArray・計算結果を格納した配列
	 * 作成日:2023/04/20
	 * */
	static int[][] addMatrix(int[][] x, int[][] y) {
		//計算結果を格納する配列を宣言する
		int [][]resultArray = new int[x.length][x[0].length];
		//行のループ
		for(int i=0; i<x.length; i++) {
			//列のループ
			for(int j=0; j<x[i].length; j++) {	
				//配列の和を求める
				resultArray[i][j] = x[i][j] + y[i][j];
			}
		}
		//計算結果を返す
		return resultArray;
	}
	/*
	 * 関数名:main
	 * 概要:２つの行列の和を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/24
	 * */
	public static void main(String[]args) {
		//プログラムの説明文を表示
		System.out.println("２つの配列の和を求めます。");
		
		//配列aの行数の入力を促す文を表示
		System.out.println("行列の行数を入力してください。");
		//入力された値を読み込む
		int linesValue = readInteger();
		//列数の入力を促す文を表示
		System.out.println("行列の列数を入力してください。");
		//配列aの列数を入力
		int rowsValue  = readInteger();
		
		//１つめの配列の要素の入力
		System.out.println("1つめの配列の要素を入力");
		//各配列要素の入力
		int [][]firstArray = arrayInput2d(linesValue, rowsValue);		
		//１つめの配列の表示
		printArray2d(firstArray);
		//コンソール画面を見やすくするために改行
		System.out.println();
		
		//２つめの配列の要素の入力
		System.out.println("２つめの配列の要素を入力");		
		//各配列要素の入力
		int [][]secondArray = arrayInput2d(linesValue, rowsValue);		
		//２つめの配列の表示
		printArray2d(secondArray);
		//コンソール画面を見やすくするために改行
		System.out.println();

		//配列の和を表示することを表示
		System.out.println("2つの配列の和");
		//計算結果の表示
		printArray2d(addMatrix(firstArray, secondArray));
	}
}

package Ensyu7_27;
//スキャナークラスをインポートする。
import java.util.Scanner ;
/*
 * クラス名:Ensyu7_27
 * 概要:演習7-27
 * 作成者:城所佑奈
 * 作成日:2023/04/25
 * */
public class Ensyu7_27 {
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
		//行のインデックスが0から配列要素数分ループする
		for(int i=0; i<lineValue; i++) {
			//列のインデックスが0から配列要素数分ループする
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
	 * 　概要:配列要素を表示する
	 * 　引数:int[][]型・printArray[][]・表示したい配列
	 * 戻り値:なし
	 * 作成日:2023/04/21
	 * */
	static void printArray2d(int[][]printArray) {
		//行のインデックスが0から配列要素数分ループする
		for(int i=0; i < printArray.length ; i++) {
			//列のインデックスが0から配列要素数分ループする
			for(int j=0; j<printArray[i].length; j++) {
				//インデックiの配列要素を表示する
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
	/*
	 * 関数名:addMatrix
	 * 概要:３つの配列の要素数が等しければ加算を行いtrueを返し、
	 * 		等しなければ加算を行わずfalseを返す
	 * 引数:int[][]型・ｘ・１つ目の行列
	 * 		int[][]型・ｙ・２つ目の行列
	 * 		int[][]型・ｚ・３つ目の行列
	 * 戻り値:boolean型・answer・行列の要素数が等しければ正を返す
	 * 作成日:2023/04/20
	 * */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		//正負を表す変数を宣言
		boolean backAnswer = true;
		//配列の行数が等しい場合
		if(x.length == y.length && y.length == z.length) {
			//配列の０行目から最後の行までループ
			for(int i=0; i<x.length; i++) {
				//各行の列数が等しい場合
				if(x[i].length == y[i].length && y[i].length == z[i].length) {
					//列のループ
					for(int j=0; j<x[i].length; j++) {	
						//配列の和を求める
						z[i][j] = x[i][j] + y[i][j];
					}
				
				}
				//各行の列数が等しくない場合
				else {
					//配列の列数が等しくない場合は戻り値をfalseにする
					backAnswer = false;
					//等しくない場合があった時点でループを終える
					break;
				}
			}
		}
		//配列の行数が等しくない場合は戻り値をfalseにする
		else {backAnswer = false;}
		
		//正負のいずれかを返す
		return backAnswer;
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
		
		//配列aの行数の入力を促す文を表示
		System.out.println("配列aの行数を入力してください。");
		//入力された値を読み込む
		int linesA = readInteger();
		//列数の入力を促す文を表示
		System.out.println("配列aの列数を入力してください。");
		//配列aの列数を入力
		int rowsA  = readInteger();
		//各配列要素の入力
		int [][]firstArray = arrayInput2d(linesA, rowsA);		
		//配列aの表示
		printArray2d(firstArray);
		
		//配列bの行数の入力を促す文を表示
		System.out.println("配列bの行数を入力してください。");
		//入力された値を読み込む
		int linesB = readInteger();
		//列数の入力を促す文を表示
		System.out.println("配列bの列数を入力してください。");
		//配列bの列数を入力
		int rowsB  = readInteger();
		//各配列要素の入力
		int [][]secondArray = arrayInput2d(linesB, rowsB);		
		//配列bの表示
		printArray2d(secondArray);

		//配列cの行数の入力を促す文を表示
		System.out.println("配列cの行数を入力してください。");
		//入力された値を読み込む
		int linesC = readInteger();
		//列数の入力を促す文を表示
		System.out.println("配列cの列数を入力してください。");
		//配列cの列数を入力
		int rowsC  = readInteger();
		//計算結果を格納するための配列を宣言
		int [][]resultArray = new int[linesC][rowsC];
		
		//各配列の要素数が等しいか調べる
		boolean compareResult = addMatrix(firstArray, secondArray, resultArray);
		//戻り値が正の場合、配列の和を表示する
		if(compareResult == true) {
			//計算結果の表示
			printArray2d(resultArray);
		}
		//戻り値が負の場合、計算不可であることをひょうじする。
		else {
			System.out.print("入力された配列では計算できませんでした。");
		}
	}
}

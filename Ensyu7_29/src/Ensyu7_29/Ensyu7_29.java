package Ensyu7_29;
//スキャナークラスをインポートする
import java.util.Scanner;

/*
 * クラス名:Ensyu7_29
 * 概要:演習7-29
 * 作成日:2023/04/25
 * 作成者:城所佑奈
 * */
public class Ensyu7_29 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	
	/*
	 *  関数名:arrayInput2d
	 * 　概要:二次元配列の各配列要素を入力して返す
	 * 　引数:int[][]型・inputArray・配列要素を入力したい配列
	 * 戻り値:int[][]型・inputArray・入力した値の格納された二次元配列を返す
	 * 作成日:2023/04/24
	 * */
	static int[][] arrayInput2d(int[][] inputArray) {
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
	 * 関数名:printArray2d
	 * 　概要:二次元配列の各要素を表示する
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
				System.out.print("\t"+printArray[i][j]);
			}
			//次の行に移る前に改行をする。
			System.out.println();
		}
	}
	/*
	 * 関数名:readInteger
	 * 概要:入力された値を読み込む、条件に適さなければ繰り返し入力させる
	 * 引数:なし
	 * 戻り値:int型・plusInteger・入力された値を表す変数
	 * 作成日:2023/04/20
	 * */
	static int readInteger() {
		//入力された値を読み込む変数
		int plusInteger = 0;
		do {
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
			//入力された値が0以下の場合
			if(plusInteger<=0) {
				//正の整数値の入力を促す文を表示
				System.out.print("もう一度入力してください：");
			}
		//入力が0以下の場合は繰り返す
		}while(plusInteger<=0);
		//入力された値を返す
		return plusInteger;
	}

	 /*このメソッド内での命名は教本に従う
	 * 関数名:aryClone
	 * 　概要:渡された配列と同じ要素数・配列要素を持つ配列を生成して返却する
	 * 　引数:int[][]型・a[][]		　・元となる配列
	 * 戻り値:int[][]型・copyArray[][]・元になる配列と同じ要素を持つ配列
	 * 作成日:2023/04/25
	 * */
	static int [][] aryClone2(int[][] a){
		//元になる配列と同じ配列要素を代入するための配列を宣言
		int [][]copyArray = new int[a.length][];
		//行のループ
		for(int i=0; i<a.length; i++) {
			copyArray[i] = new int[a[i].length];
			//列のループ
			for(int j=0; j<a[i].length; j++) {
				//元になる配列の要素を代入していく
				copyArray[i][j] = a[i][j];
			}
		}
		//コピーした配列を返す
		return copyArray;
	}
	
	/*
	 * 関数名:main
	 * 概要:ある二次元配列aと同じ配列を生成して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/25
	 * */
	public static void main(String[]args) {
		//プログラムの説明文を表示
		System.out.println("配列aを元にしたコピーの配列を作ります。");
		
		//配列の行数の入力を促す文を表示
		System.out.println("配列aの行数を入力してください。");
		//入力された値を変数に読み込む
		int lineValue = readInteger();
		
		//コピーした配列を参照するための配列変数を宣言する
		int [][]originalArray = new int[lineValue][]; 
		//各行での列数の入力を求める
		System.out.println("配列aの列数を入力してください。");
		//行のループ
		for(int i=0; i<lineValue; i++) {
			System.out.print("a["+i+"]=");
			//入力された値を読み込む
			originalArray[i] = new int[readInteger()];
		}
		
		//配列要素の入力を促す文を表示する
		System.out.println("配列aの要素を入力してください。");
		//各配列要素の入力を求める
		arrayInput2d(originalArray);
		
		//配列aの要素を表示するすることを表示		
		System.out.println("配列a");
		//配列aを表示する
		printArray2d(originalArray);
		
		//配列のコピーを表示することを表示
		System.out.println("コピーした配列");
		//配列のコピーを表示する
		printArray2d(aryClone2(originalArray));
	} 
}

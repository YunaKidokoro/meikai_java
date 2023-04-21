package Ensyu7_20;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_20
* 概要:演習7-20
* 作成者:城所佑奈
* 作成日:2023/04/21
* */
public class Ensyu7_20 {
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
		//値の格納された配列を返す
		return inputArray;
	}
	/*このメソッドの内の命名は教本に従う
	 * 関数名:aryIns
	 * 　概要:配列にある値を挿入する
	 * 　引数:int[]型・a[]・値を挿入したい配列
	 * 		　　int型・idx・挿入したいインデック
	 * 			int型・ｘ ・挿入する値
	 * 戻り値:int[]型・a[]・ある値の挿入された配列
	 * 作成日:2023/04/21
	 * */
	static int[] aryIns(int[]a, int idx, int x) {
		//末尾から値の挿入された位置の隣の前までループする
		for(int i=a.length-1; i > idx ; i--) {
			//一つ隣の値を代入する
			a[i] = a[i -1];
		}
		//任意の位置に値を挿入する
		a[idx] = x;
		//ある値の挿入された配列を返す
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
	 * 概要:配列から任意の配列要素が挿入された配列を表示する
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
		
		//挿入位置のインデックを表す変数を宣言
		int chengeIndex  = 0;
		//挿入するインデックスの位置の入力を促す文を表示
		System.out.print("挿入したいインデックの位置：");
		do{
			//入力された値を読み込む
			chengeIndex = inputNumber.nextInt();
			//挿入位置のインデックが配列要素数以上の場合
			if(chengeIndex>=elementValue) {
				//再入力を求める表示
				System.out.print("もう一度入力して下さい：");}
			}
		//挿入位置のインデックが配列要素数以上なら繰り返す
		while(chengeIndex>=elementValue);
		
		//挿入したい配列要素の値の入力を求める表示
		System.out.print("挿入する値：");
		//入力された値を読み込む
		int inputInteger = inputNumber.nextInt();

		//値の挿入された配列を表示する
		printArray(aryIns(inputArray, chengeIndex, inputInteger));
	}
}

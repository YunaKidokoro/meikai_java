package Ensyu7_15;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_15
 * 概要:演習7-15
 * 作成者:城所佑奈
 * 作成日:2023/04/21
 * */
public class Ensyu7_15 {
	
	//スキャナークラスのインスタンスを初期化する
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
		int plusInteger = 0;
		do {
			//正の整数値の入力を促す文を表示
			System.out.print("整数:");
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
		//入力が0以下の場合は繰り返す
		}while(plusInteger <0);
		//入力された値を返す
		return plusInteger;
	}
	/*
	 * 関数名:sumOf
	 * 概要:配列要素の和を求める
	 * 　引数:int[]型・a[]・和を求めたい値の入った配列
	 * 戻り値:int型・sumValue・配列の全要素数の和を返す
	 * 作成日:2023/04/21
	 * */
	static int sumOf(int[] a) {
		int sumValue = 0;
		for(int i=0 ; i<a.length; i++) {
			sumValue += a[i];
		}
		return sumValue;
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
	
	/*
	 * 関数名:main
	 * 概要:配列の全要素の合計を表示する
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
		int max = sumOf(arrayInput(elementValue));
		//配列要素を代入する
		System.out.print(max);
	}
}

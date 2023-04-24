package Ensyu7_24;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_24
* 概要:演習7-24
* 作成者:城所佑奈
* 作成日:2023/04/24
* */
public class Ensyu7_24 {
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
	
	/*
	 * 関数名:aryRmvOf
	 * 　概要:配列からある値を削除する
	 * 　引数:int[]型・a[]・削除したい値のある配列
	 * 		　　int型・idx・削除したい配列要素のインデックス
	 * 戻り値:int[]型・a[]・ある値の削除された配列
	 * 作成日:2023/04/21
	 * */
	static int[] aryRmvOf(int[]a, int idx) {
		//値の削除されたあとの配列を宣言
		int removeArray[] = new int[a.length -1];
		//配列aのインデックスを表す
		int j = 0;
		//配列の先頭から末尾までループ
		for(int i=0; i < a.length-1 ; i++) {
			//削除後の配列に値を代入していく
			removeArray[i] = a[j];
			//aのインデックスが削除したいインデックになった場合
			if(j == idx) {
				//次のループで削除後の配列で同じインデックスに値を代入する
				i--;
			}
			//配列aのインデックを次の値に変える
			j++;
		}
		//ある値の削除された配列を返す
		return removeArray;
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
	 * 概要:配列からある配列要素の値を削除したものを表示する
	 * 引き数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/21
	 *  */
	public static void main(String[]args) {
		//配列要素数を入力させる
		System.out.println("配列Aの要素数を入力してください。");
		//変数に入力された値を読み込む
		int elementValue = readPlusInt();
		//配列要素を代入する
		int []inputArray = arrayInput(elementValue, "a");
		
		
		//削除したい配列要素のインデックスを入力させる
		System.out.println("削除する要素のインデックスを入力して下さい。");
		int inputIndex = 0;
		//ループの開始
		do {
			//入力された値を読み込む
			inputIndex = readPlusInt();
		//入力された値が要素数よりも大きい場合繰り返す
		}while(inputIndex>elementValue-1);
		
		//値の削除された配列を表示する
		printArray(aryRmvOf(inputArray, inputIndex), "a'");
	}
}
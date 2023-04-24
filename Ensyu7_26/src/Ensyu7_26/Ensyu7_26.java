package Ensyu7_26;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_26
* 概要:演習7-26
* 作成者:城所佑奈
* 作成日:2023/04/24
* */
public class Ensyu7_26 {
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
		}while(plusInteger <0);
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
	
	/*このメソッド内での命名は教本に従う
	 * 関数名:arrayInsOf
	 * 　概要:配列にある値を挿入する
	 * 　引数:int[]型・a[]・挿入したい値のある配列
	 * 		　　int型・idx・配列要素を挿入するインデックス
	 * 		　　int型・ｘ ・挿入する値
	 * 戻り値:int[]型・insertArray[]・ある値の挿入された配列
	 * 作成日:2023/04/21
	 * */
	static int[] arrayInsOf(int[]a, int idx, int x) {
		//値の削除されたあとの配列を宣言
		int insertArray[] = new int[a.length +1];
		//配列aのインデックスを表す
		int j = 0;
		//配列の先頭から末尾までループ
		for(int i=0; i < a.length+1 ; i++) {
			//削除後の配列に値を代入していく
			insertArray[i] = a[j];
			//aのインデックスが削除したいインデックになった場合
			if(i == idx) {
				insertArray[i] = x;
				continue;
			}
			//配列aのインデックを次の値に変える
			j++;
		}
		//ある値の削除された配列を返す
		return insertArray;
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
	 * 概要:配列にある値を挿入した配列を表示する
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
		
		
		//配列要素を挿入したいインデックスを入力させる
		System.out.println("どこのインデックスに挿入しますか:");
		int inputIndex = 0;
		//ループの開始
		do {
			//入力された値を読み込む
			inputIndex = inputNumber.nextInt();
			//不適切な入力だった場合
			if(inputIndex>elementValue-1 || inputIndex<0) {
				//再入力を求める文を表示
				System.out.print("もう一度入力して下さい：");
			}
		//入力された値が要素数よりも大きいか、負の場合は繰り返す
		}while(inputIndex>elementValue-1 || inputIndex<0);
		
		//挿入したい値の入力を促す文を表示
		System.out.print("挿入したい値：");
		//挿入したい値を表す変数に入力された値を読み込む
		int insertInteger = inputNumber.nextInt();
		
		//値の削除された配列を表示する
		printArray(arrayInsOf(inputArray, inputIndex, insertInteger), "a'");
	}
}
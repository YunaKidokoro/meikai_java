package Ensyu7_23;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_21
* 概要:演習7-21
* 作成者:城所佑奈
* 作成日:2023/04/21
* */
public class Ensyu7_23 {
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
	 * 関数名:SarchIdx
	 * 　概要:配列aの中にある値xがいくつあるか数える
	 * 　引数:int[]型・a[]・任意の要素を持つ配列
	 * 		　int型・x・配列aの中から探したい値
	 * 戻り値:int型・sarchSum・配列aの中にｘがいくつあったか
	 * 作成日:2023/04/24
	 * */
	static int SarchIdx(int[]a, int x) {
		//配列aがxをいくつ含むかを表す変数を宣言
		int sarchSum = 0;
		//配列aの要素を先頭から末尾まで調べる
		for(int i:a) {
			//もし配列要素の値がxと等しいならｘの個数を数える
			if(i == x) {sarchSum++;}
		}
		return sarchSum;
	}

	
	/*このメソッド内の命名は教本に従う
	 * 関数名:arraySrchIdx
	 * 　概要:配列aの中で値がxである全要素のインデックスを格納した配列を返す
	 * 　引数:int[]型・a[]・任意の要素を持つ配列
	 * 		　int型・x・配列aの中から探したい値
	 * 戻り値:int[]型・sarchArray・ｘのあった配列aのインデックスを要素として持つ配列
	 * 作成日:2023/04/24
	 * */
	static int[] arraySrchIdx(int[]a, int x) {
		//ｘのあった配列aのインデックスを要素として持つ配列を宣言
		int []sarchArray = new int[SarchIdx(a,x)];
		//配列saechArrayのインデックスを表す変数
		int j = 0;
		//配列aの先頭から末尾までループ
		for(int i=0; i<a.length ; i++) {
			//配列要素の値がxと等しい場合
			if(a[i]==x) {
				//配列saechArrayにそのインデックスの値を要素として代入
				sarchArray[j] = i;
				//配列saechArrayのインデックスを次へ
				j++;
			}
		}
		//ｘのあった配列aのインデックスを要素として持つ配列を返す
		return sarchArray;
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
	 * 概要:配列aの要素の中である値のインデックスを要素に持つ配列を表示する
	 * 引き数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/21
	 *  */
	public static void main(String[]args) {
		//なにをするのか説明する
		System.out.println("配列aの要素の中である値xのインデックスを\n要素に持つ配列を表示します。\n");
		//配列要素数を入力させる
		System.out.println("配列Aの要素数を入力してください。");
		//変数に入力された値を読み込む
		int elementValueA = readPlusInt();
		//配列要素を代入する
		int []inputArrayA = arrayInput(elementValueA, "a");
		
		//ある値xを入力させる
		System.out.print("ある値xを入力してください:");
		//配列aの要素のある値を表す変数
		int inputIntegerX = 0;
		//ループの開始
		do {
			//入力された値を読み込む
			inputIntegerX = inputNumber.nextInt();
			//入力された値が配列aの要素になかった場合
			if(SarchIdx(inputArrayA,inputIntegerX)==0) {
				//再入力を求める表示
				System.out.print("その値は含まれません\nもう一度入力してください:");
			}
		//配列aの要素に含まれる値が入力されるまでループする
		}while(SarchIdx(inputArrayA,inputIntegerX)==0);
		
		//ある値のインデックスを取り出した配列を表示する
		printArray(arraySrchIdx(inputArrayA,inputIntegerX),"ax");
		
	}
}
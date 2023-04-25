package Ensyu7_30;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_30
 * 概要:演習7-30
 * 作成者:城所佑奈
 * 作成日:2023/04/25
 * */
public class Ensyu7_30 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	
	/*
	 *  関数名:arrayInput
	 * 　概要:配列の各配列要素を入力して返す
	 * 　引数:int[]型・inputArray・配列要素を入力したい配列
	 * 戻り値:int[]型・inputArray・入力した値の格納された配列を返す
	 * 作成日:2023/04/24
	 * */
	static int[] arrayInput(int[] inputArray) {
		//行のループ
		for(int i=0; i<inputArray.length; i++) {
			//値を入力する配列のインデックスを表示
			System.out.print("a["+i+"]=");
			//入力された値を配列に代入する
			inputArray[i]= inputNumber.nextInt();
		}
		//値の格納された値を返す
		return inputArray;
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

	/*
	 * 関数名：min
	 * 概要:2値の最小値を返す
	 * 引数:int型・a・任意の整数
	 * 		int型・b・任意の整数
	 * 戻り値:int・minimumNumber・引数のうち小さい方の値を返す
	 * 作成日:2023/04/25
	 * */
	static int min(int a, int b) {
		//仮にaの方が小さいとして最小値を表す変数を宣言する
		int minimumNumber = a;
		//bの方がaより小さい場合、最小値をbの値に変える
		if(a>b) {minimumNumber = b;}
		//最小値を返す
		return minimumNumber;
	}
	/*
	 * 関数名：min
	 * 概要:3値の最小値を求める
	 * 引数:int型・a・任意の整数値
	 * 		int型・b・任意の整数値
	 * 		int型・c・任意の整数値
	 * 戻り値:int・minimumNumber・引数のうち最小値を返す
	 * 作成日:2023/04/25
	 * */
	static int min(int a, int b, int c) {
		//仮にaが最小値だとして変数を宣言する
		int minimumNumber = a;
		//bの方が最小値より小さい場合
		if(minimumNumber>b) {
			//最小値の値をbの値に変える
			minimumNumber = b;
		}
		//cの方が最小値より小さい場合
		else if(minimumNumber>c){
			//最小値の値をcに変える
			minimumNumber = c;
		}
		//最小値を返す
		return minimumNumber;
	}
	/*
	 * 関数名：min
	 * 概要:配列の最小値を求める
	 * 引数:int[]型・a[]・最小値を探したい配列
	 * 戻り値:３つの整数のうちの最小値を返す
	 * 作成日:2023/04/25
	 * */
	static int min(int[] a) {
		//仮にaが最小値だとして変数を宣言する
		int minimumNumber = a[0];
		//配列の先頭から末尾までループ
		for(int i=0; i<a.length; i++) {
			//配列要素の値が最小値より小さい場合
			if(minimumNumber>a[i]) {
				//最小値の値を入れ替える
				minimumNumber = a[i];
			}
		}
		//最小値を返す
		return minimumNumber;
	}
	/*
	 * 関数名:main
	 * 概要:様々な最小値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/25
	 * 作成者:城所佑奈
	 */
	public static void main(String[]argd) {
		//２値の最小値を求めることを表示
		System.out.println("２値の最小値を求めます。");
		//
		System.out.print("整数1の値を入力：");
		//整数１を入力させ変数に読み込む
		int firstInteger = inputNumber.nextInt();
		System.out.print("整数2の値を入力：");
		//整数２を入力させ変数に読み込む
		int secondInteger = inputNumber.nextInt();
		//２値の最小値を表示する
		System.out.println("２値の最小値は"+min(firstInteger,secondInteger)+"です。");
		
		//コンソール画面を見やすくするために改行する
		System.out.println();
		
		//３値の最小値を求めることを表示
		System.out.println("3値の最小値を求めます。");
		//整数３を入力させる
		System.out.print("整数3の値を入力：");
		//入力された値を変数に読み込む
		int thirdInteger = inputNumber.nextInt();
		//3値の最小値を表示する
		System.out.println("3値の最小値は"+min(firstInteger,secondInteger,thirdInteger)+"です。");

		//コンソール画面を見やすくするために改行する
		System.out.println();

		//配列の要素の最小値を求めることを表示
		System.out.println("配列の最小値を求めます。");
		//配列の要素数の入力を促す
		System.out.print("要素数を入力してください:");
		//入力された値を読み込む
		int elementValue = readInteger();
		//配列を宣言する
		int []sarchminimumArray = new int[elementValue];
		//配列要素の入力を求める
		sarchminimumArray = arrayInput(sarchminimumArray);
		//配列要素の最小値を表示する
		System.out.println("配列要素の最小値は"+min(sarchminimumArray)+"です。");

	}
}


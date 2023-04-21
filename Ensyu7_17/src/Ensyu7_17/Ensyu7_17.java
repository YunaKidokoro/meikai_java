package Ensyu7_17;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_17
* 概要:演習7-17
* 作成者:城所佑奈
* 作成日:2023/04/21
* */
public class Ensyu7_17 {
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
		//値の格納された値を返す
		return inputArray;
	}
	/*このメソッドの内の命名は教本に従う
	 * 関数名:linerSarch
	 * 　概要:配列要素にある値が含まれているか探る
	 * 　引数:int[]型・a[]・ある配列要素を探したい配列
	 * 戻り値:int型・sumValue・配列が探している値を含むか、
	 * 		　含んでいればどこにあるかを返す
	 * 作成日:2023/04/21
	 * */
	static int linerSarch(int[]a, int key) {
		//探索結果を表す変数を宣言
		int sarchResult = 0;
		//配列の末尾から先頭までループ
		for(int i = a.length-1; i>=0; i--) {
			//その配列要素が探している値の場合
			if(a[i] == key) {
				//探索結果が成功として１を代入
				sarchResult = i;
				//ループから抜ける
				break;
			}
			//もし見つからない場合は－1を代入
			sarchResult = -1;
		}
		//探索結果を返す
		return sarchResult;
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
		int []sarchArray = arrayInput(elementValue);
		//探す値の入力を促す文を表示
		System.out.println("探す値：");
		//入力された値を読み込む
		int sarchNumber = inputNumber.nextInt();
		//配列にkey値があるか探す
		int sarchResult = linerSarch(sarchArray, sarchNumber);
		//探索失敗の場合
		if(sarchResult == -1) {
			//値が見つからなかったことを表示
			System.out.println("その値の要素は存在しません");
		}
		//探索成功の場合
		else {
			//どこにあったかを表示
			System.out.println("その値は"+"x["+sarchResult+"]にあります");
		}
	}
}
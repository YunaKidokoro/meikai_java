package Ensyu10_3;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu10_3
 * 概　要:演習10-3
 * 作成日:2023/5/1
 * 作成者:yuna
 * */
public class Ensyu10_3 {
	
	//入力された値を読み込む変数を宣言
	static int firstInteger = 0, secondInteger= 0 ,thirdInteger = 0;
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	
	/*
	 * 関数名:inputInteger
	 * 概要:n個の整数を入力される
	 * 引数:int型　ｎ　何個の整数を入力するか
	 * 戻り値:なし
	 * 作成日:2023/5/2
	 * */
	static void inputInteger(int n) {
		//入力値を読み込む変数を宣言
		int inputInteger = 0;
		//n回ループする
		for(int i=0; i<n; i++) {
			//整数の入力を促す
			System.out.print("整数：");
			//入力された値を読み込む
			inputInteger = inputNumber.nextInt();
			//スイッチ文
			switch(i) {
			//0回めのループのときは1つ目の変数に値を代入する
			case 0: firstInteger =inputInteger;
			//1回めのループのときは2つ目の変数に値を代入する
			case 1: secondInteger=inputInteger;
			//2回めのループのときは3つ目の変数に値を代入する
			case 2: thirdInteger =inputInteger;
			}
		}
	}
	/*
	 * 関数名:main
	 * 概　要:MinMaxクラスのテスト
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/1
	 * 作成者:yuna
	 * */
	public static void main(String[]args) {
		//3値の最大・最小値を求めることを表示
		System.out.println("3値の最大値と最小値を求める");
		//何個の整数を作るかを表す変数を３個に決める
		int howManyInteger = 3;
		//3個の整数を用意する
		inputInteger(howManyInteger);
		
		//3値の最大・最小値を表示
		System.out.println("最小値:"+MinMax.min(firstInteger,secondInteger,thirdInteger)+
				"\n最大値:"+MinMax.max(firstInteger,secondInteger,thirdInteger));
		//コンソール画面を見やすくために改行
		System.out.println();
		
		//2値の最大・最小値を求めることを表示
		System.out.println("2値の最大値と最小値を求める");
		//何個の整数を作るかを表す変数を２個に決める
		howManyInteger = 2;
		//２個の整数を作る
		inputInteger(howManyInteger);
		
		//2値の最大・最小値を表示
		System.out.println("最小値:"+MinMax.min(firstInteger,secondInteger)+
				"\n最大値:"+MinMax.max(firstInteger,secondInteger));
		//コンソール画面を見やすくために改行
		System.out.println();
		
		//配列の最大・最小値を求めることを表示
		System.out.println("配列aの最大値と最小値を求める");
		//配列の要素数を入力させる
		int elementValue = normalInput.elementInput();
		
		//配列を生成する
		int []sarchArray = new int [elementValue];
		//配列の配列要素をそれぞれ入力させる
		sarchArray = normalInput.arrayInput(sarchArray, elementValue); 
		//配列の最大・最小値を表示
		System.out.println("最小値:"+MinMax.min(sarchArray)+
				"\n最大値:"+MinMax.max(sarchArray));

	}
}

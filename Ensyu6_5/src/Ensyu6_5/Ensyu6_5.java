package Ensyu6_5;

import java.util.Scanner;

//スキャナークラスをインポートする
/*
 * クラス名:Ensyu6_5
 * 概要:演習6-5
 * 作成者:城所佑奈
 * 作成日:2323/04/14
 * */
public class Ensyu6_5 {
	/*
	 * 関数名:main
	 * 概要:要素の値を読み込んで表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/14
	 */
	public static void main(String[]args) {
		//sucannerクラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		//要素数を表す変数を宣言する
		int inputElement = 0;
		//ループの開始
		do {
		//要素数の入力を求める文を表示
			System.out.print("要素数：");
			//入力された要素数の値を読み込む
			inputElement = inputNumber.nextInt();
		//入力された値が0以下の場合には繰り返す
		}while(inputElement<=0);
		
		//配列を宣言する
		int [] variableArray = new int[ inputElement ];
		//インデックスが0から要素数までループ
		for(int countIndex=0; countIndex<inputElement; countIndex++) {
			//初期子の入力を促す文を表示する
			System.out.print("a["+countIndex+"]=");
			//入力された値で配列の各要素を初期化する
			variableArray[countIndex] = inputNumber.nextInt();
		}
		//配列を表示する
		System.out.print("a={" );
		//インデックスが0から要素数までループ
		for(int countIndex=0; countIndex<inputElement; countIndex++) {
			//最後のインデックスの場合
			if(countIndex == inputElement-1) {
				//最後の要素なので[,]をつけない
				System.out.print(variableArray[countIndex]);
			}
			//インデックスが0から要素数－1の場合
			else {
				//配列要素を順に表示する
				System.out.print(variableArray[countIndex] + ",");
			}
		}
		//配列要素を表すかっこを閉じる
		System.out.print("}" );
	}
}

package Ensyu6_4;

import java.util.Random;
import java.util.Scanner;

//スキャナークラスをインポートする。
//ランダムクラスをインポートする。
/*
 * クラス名:Ensyu6_4
 * 概要:演習6-4
 * 作成者:城所佑奈
 * 作成日:2023/04/14
 * */
public class Ensyu6_4 {
	/*
	 * 関数名:main
	 * 概要:配列にランダムな値を代入して棒グラフにして表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/4/14
	 * */
	public static void main(String[]args) {
		//randomクラスのインスタンスを初期化する
		Random randomInput   = new Random();
		//scannerクラスのインスタンスを初期化する
		Scanner integerInput = new Scanner(System.in);
		//要素数の入力を促す文を表示する
		System.out.print("要素数:");
		//入力された値を読み込む
		int inputElement = integerInput.nextInt();
		//配列を生成する
		int []randomArray = new int[inputElement];
		//インデックスを0から要素数-1まで繰り返す
		for(int indexNumber=0 ; indexNumber<inputElement ; indexNumber++) {
			//配列にランダムな値を順に代入していく
			randomArray[indexNumber] = randomInput.nextInt(10)+1;
		}
		//表が10行になるようにループする
		for(int countNumber=10; countNumber>0; countNumber--) {
			//列のループ
			//インデックスが0から要素数までループする
			for(int indexNumber=0; indexNumber<randomArray.length ; indexNumber++) {
				//配列の中の値が行数以上の場合
				if( countNumber <= randomArray[indexNumber] ) {
					//*を表示する
					System.out.print("*");
				}
				//そうでなければ空白を表示する
				else {System.out.print(" ");}
			}
			//行ループの終わりに改行をいれる
			System.out.println();
		}
		//カウント数が0から要素数までループする
		for(int countNumber=0 ;countNumber<inputElement;countNumber++) {
			//列数分だけ-を表示
			System.out.print("-");
		}
		//改行を入れる
		System.out.println();
		//カウント数が0から要素数までループする
		for(int countNumber=0 ;countNumber<inputElement;countNumber++) {
			//グラフのラベルを表示する
			System.out.print(countNumber%10);
		}
	}
}

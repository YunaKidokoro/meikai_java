package Ensyu12_1;
//スキャナークラスをインポートする
import java.util.Scanner;

/*
 * クラス名:InputClass
 * 概　要:入力関連のメソッド
 * 作成日:2023/5/8
 * 作成者:yuna
 * */
public class InputClass {
	
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	/*
	 * 関数名:readPlusInt
	 * 概要：整数を入力させて、0以下の場合は繰り返し入力を求める
	 * 引数:なし
	 * 戻り値:int型・plusInteger・入力された値を表す変数
	 * 作成日:2023/05/8
	 * */
	static int readPlusInt() {
		//正の整数を表す変数を宣言
		int plusInteger = 0;
		do {
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
			//入力された値が0以下の場合
			if(plusInteger<=0) {
				//再入力を求める文を表示
				System.out.print("もう一度入力して下さい：");
			}
			//入力が0以下の場合は繰り返す
		}while(plusInteger <=0);
		//入力された値を返す
		return plusInteger;
	}
	
	/*
	 * 関数名:readPlusNumber
	 * 概要：実数を入力させて、0以下の場合は繰り返し入力を求める
	 * 引数:なし
	 * 戻り値:double型・plusNumber・入力された値を表す変数
	 * 作成日:2023/04/20
	 * */
	static double readPlusNumber() {
		//正の整数を表す変数を宣言
		double plusNumber = 0;
		do {
			//入力された値を読み込む
			plusNumber = inputNumber.nextDouble();
			//入力された値が0以下の場合
			if(plusNumber<=0) {
				//再入力を求める文を表示
				System.out.print("もう一度入力して下さい：");
			}
			//入力が0以下の場合は繰り返す
		}while(plusNumber <=0);
		//入力された値を返す
		return plusNumber;
	}
}

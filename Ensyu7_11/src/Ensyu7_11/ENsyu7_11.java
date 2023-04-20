package Ensyu7_11;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_11
 * 概要:演習7-11
 * 作成者:城所佑奈
 * 作成日:2023/04/20
 * */
public class ENsyu7_11 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	/*
	 * 関数名:readPlusInt
	 * 概要:正の整数値の入力を求め、その値を返す
	 * 引数:なし
	 * 戻り値:int型・plusInteger・入力された値を表す変数
	 * 作成日:2023/04/20
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
	 * 関数名:printBits
	 * 概要:ビットの表示をする
	 * 引数:int型・printInteger・表示したい整数値を表す
	 * 戻り値:なし
	 * 作成日:2023/04/20
	 * */
	static void printBits(int printInteger) {
		//32ビットを1ビットづつ減らす間ループする
		for(int i=31; i>=0; i--) {
			//iだけ右シフトさせたときて第iビットが１の場合
			if(( printInteger>>>i & 1 ) ==1) {
				//第iビットとして１を表示する
				System.out.print('1');				
			}
			//そうでなければ第iビットとして0を表示する
			else{System.out.print('0');}
		}
		//表示が終わったら改行する
		System.out.println();
	}
	/*
	 * 関数名:twoMultiplier
	 * 概要:2のべき乗の計算をする
	 * 引数:int型・putOnNumber・乗数を表す
	 * 戻り値:int型・ResultNumber・2のputOnNumber乗を表す
	 * 作成日:2023/04/20
	 * */
	static int twoMultiplier(int putOnNumber) {
		//計算結果を表す変数
		int ResultNumber = 1;
			//putOnNumber回ループする
			for(int i=0; i<putOnNumber ; i++) {
			//2を書ける
			ResultNumber *= 2;
		}
		//計算結果を表示
		return ResultNumber;
	}

	/*
	 * 関数名:main
	 * 概要:整数を左右にシフトした値が２のべき乗の乗算や除算と等しいことを確認する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/20
	 * */
	public static void main(String[]args) {
		//左シフトの場合を確かめる
		 System.out.println("左シフトの場合");
		//比較に用いる整数の入力を促す文を表示
		System.out.println("表示する正の整数を入力");
		//入力された値を読み込む
		int leftInteger = readPlusInt();
		
		//左にシフトさせる量を表す変数
		int leftShift = 0;
		//どれだけ左にシフトをさせるかの入力を促す文を表示
		System.out.println("左にシフトする量を入力");
		//ループの開始
		while(true) {
			//入力をされたシフトする量を変数に読み込む
			leftShift =  readPlusInt();
			//入力された値が32以下であればループから抜ける
			if(leftShift < 32) {break;}
		}
		
		//整数を表示するときのラベルを表示
		System.out.println("(整数)");
		//元の整数のビットを表示
		 printBits(leftInteger);
		//シフトした後の整数を表示するときのラベルを表示
		System.out.println("(シフトした整数)");
		//左シフトした後のビットを表示
		 printBits(leftInteger<<leftShift);
		//整数の2のべき乗の乗算した値を計算する
		 int newLeftInteger = leftInteger * twoMultiplier(leftShift);
		//計算後の整数を表示するときのラベルを表示
		System.out.println("(整数*2^n)");
		 //計算した値のビットを表示する
		 printBits(newLeftInteger);
		
		
		//右シフトの場合を確かめる
		 System.out.println("右シフトの場合");
		//比較に用いる整数の入力を促す文を表示
		 System.out.println("表示する整数を入力");
		//入力された値を読み込む
		 int rightInteger = readPlusInt();
		 
		//右にシフトさせる量を表す変数
		int rightShift = 0;
		//どれだけ右にシフトをさせるかの入力を促す文を表示
		System.out.println("右にシフトする量を入力");
		//ループの開始
		while(true) {
			//入力をされたシフトする量を変数に読み込む
			rightShift =  readPlusInt();
			//入力された値が32以下であればループから抜ける
			if(rightShift < 32) {break;}
			}
		//整数を表示するときのラベルを表示
		System.out.println("(整数)");
		//元の整数のビットを表示
		 printBits(rightInteger);
		//シフトした後の整数を表示するときのラベルを表示
		System.out.println("(シフトした整数)");
		//右シフトした後のビットを表示
		 printBits(rightInteger>>rightShift);
		//整数の2のべき乗の除算した値を計算する
		 int newRightNumber = rightInteger / twoMultiplier(rightShift);
		 //計算した値かた整数部を抜き出す
		 int newRightInteger = newRightNumber - (newRightNumber%1);
		//計算後の整数を表示するときのラベルを表示
		System.out.println("(整数/2^n)");
		 //計算した値のビットを表示する
		 printBits(newRightInteger);	
	}
}

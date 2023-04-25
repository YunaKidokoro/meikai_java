package Ensyu7_32;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_32
* 概要:演習7-32
* 作成者:城所佑奈
* 作成日:2023/04/25
* */
public class Ensyu7_32 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);

	/*
	 * 関数名：printBits
	 * 概要:int型整数の絶対値を返す
	 * 　引数:int型・x・ビットを表示したい値
	 * 戻り値:int型・printBitsNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static void printBits(int x) {
		//32ビットを1ビットづつ減らす間ループする
		for(int i=31; i>=0; i--) {
			//iだけ右シフトさせたときて第iビットが１の場合
			if(( x>>>i & 1 ) ==1) {
				//第iビットとして１を表示する
				System.out.print('1');				
			}
			//そうでなければ第iビットとして0を表示する
			else{System.out.print('0');}
		}
	}


	/*
	 * 関数名：printBits
	 * 概要:long型変数の内部ビットを表示する
	 * 　引数:long型・x・ビットを表示したい値
	 * 戻り値:long型・printBitsNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static void printBits(long x) {
		//64ビットを1ビットづつ減らす間ループする
		for(int i=63; i>=0; i--) {
			//iだけ右シフトさせたときて第iビットが１の場合
			if(( x>>>i & 1 ) ==1) {
				//第iビットとして１を表示する
				System.out.print('1');				
			}
			//そうでなければ第iビットとして0を表示する
			else{System.out.print('0');}
		}
	}
	
	/*
	 * 関数名：printBits
	 * 概要:byte型変数の内部ビットを表示する
	 * 　引数:byte型・x・ビットを表示したい値
	 * 戻り値:byte型・printBitsNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static void printBits(byte x) {
		//8ビットを1ビットづつ減らす間ループする
		for(int i=7; i>=0; i--) {
			//iだけ右シフトさせたときて第iビットが１の場合
			if(( x>>>i & 1 ) ==1) {
				//第iビットとして１を表示する
				System.out.print('1');				
			}
			//そうでなければ第iビットとして0を表示する
			else{System.out.print('0');}
		}
	}
	
	/*
	 * 関数名：printBits
	 * 概要:short型変数の内部ビットを表示する
	 * 　引数:short型・x・ビットを表示したい値
	 * 戻り値:short型・printBitsNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static void printBits(short x) {
		//16ビットを1ビットづつ減らす間ループする
		for(int i=15; i>=0; i--) {
			//iだけ右シフトさせたときて第iビットが１の場合
			if(( x>>>i & 1 ) ==1) {
				//第iビットとして１を表示する
				System.out.print('1');				
			}
			//そうでなければ第iビットとして0を表示する
			else{System.out.print('0');}
		}
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
	 * 概要:様々な整数型の値の絶対値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/25
	 * 作成者:城所佑奈
	 */
	public static void main(String[]argd) {
		//プログラムの説明文と共に入力を促す
		System.out.print("入力した整数の内部ビットを表示します:");
		//入力された値を読み込む
		long inputFigure = inputNumber.nextLong();
		
		//byte型の範囲内の場合
		if(-128<inputFigure && inputFigure<127) {
			//数値型が何かを表示しておく
			System.out.println("byte型");
			//整数の内部ビットを表示する
			printBits((byte)inputFigure);
		}
		
		//short型の範囲内の場合
		else if(-twoMultiplier(15)<inputFigure && inputFigure<(-1+twoMultiplier(15))) {
			//数値型が何かを表示しておく
			System.out.println("short型");
			//整数の内部ビットを表示する
			printBits((short)inputFigure);
		}
		//int型の範囲内の場合
		else if(-twoMultiplier(31)<inputFigure && inputFigure<(-1+twoMultiplier(31))) {
			//数値型が何かを表示しておく
			System.out.println("int型");
			//整数の内部ビットを表示する
			printBits((int)inputFigure);
		}
		else {
			//数値型が何かを表示しておく
			System.out.println("long型");
			//整数の内部ビットを表示する
			printBits(inputFigure);
		}
		
	}
}
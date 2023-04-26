package Ensyu7_32;
//ランダムクラスをインポートする
import java.util.Random;
/*
* クラス名:Ensyu7_32
* 概要:演習7-32
* 作成者:城所佑奈
* 作成日:2023/04/25
* */
public class Ensyu7_32 {
	//ランダムクラスのインスタンスを初期化する
	static Random randomNumber = new Random();
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
		//改行する
		System.out.println();

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
		//改行する
		System.out.println();

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
		//改行する
		System.out.println();

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
		//改行する
		System.out.println();
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
		//プログラムの説明文
		System.out.println("ランダムな値を生成し内部ビットを表示します");
		
		//byte型の整数の下限を表す変数
		final int LOWER_LIMIT_BYTE = -128;
		//byte型の整数の上限を表す変数
		final int HIGHER_LIMIT_BYTE = 127;
		//byte型の範囲内の乱数を生成
		byte byteInteger = (byte) (randomNumber.nextInt(HIGHER_LIMIT_BYTE-LOWER_LIMIT_BYTE+2)+LOWER_LIMIT_BYTE);
		//数値型が何かを表示しておく
		System.out.println("byte型:"+byteInteger);
		//整数の内部ビットを表示する
		printBits(byteInteger);
		//見やすくするために改行する
		System.out.println("");
		
		//short型の整数の下限を表す変数
		final int LOWER_LIMIT_SHORT = -32768;
		//short型の整数の上限を表す変数
		final int HIGHER_LIMIT_SHORT = 32767;
		//short型の範囲内の乱数を生成
		short shortInteger = (short) (randomNumber.nextInt(HIGHER_LIMIT_SHORT-LOWER_LIMIT_SHORT+2)+LOWER_LIMIT_SHORT);
		//数値型が何かを表示しておく
		System.out.println("short型:"+shortInteger);
		//整数の内部ビットを表示する
		printBits(shortInteger);
		//見やすくするために改行する
		System.out.println("");

		//int型の範囲内の乱数を生成
		int intInteger = randomNumber.nextInt();
		//数値型が何かを表示しておく
		System.out.println("int型:"+intInteger);
		//整数の内部ビットを表示する
		printBits(intInteger);
		//見やすくするために改行する
		System.out.println("");

		//long型の範囲内の乱数を生成
		long longInteger = randomNumber.nextLong();
		System.out.println("long型:"+longInteger);
		//整数の内部ビットを表示する
		printBits(longInteger);
		
	}
}
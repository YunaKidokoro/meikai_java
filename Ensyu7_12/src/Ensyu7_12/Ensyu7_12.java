package Ensyu7_12;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_12
* 概要:演習7-12
* 作成者:城所佑奈
* 作成日:2023/04/20
* */

public class Ensyu7_12 {
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
		//表示ができたら改行を行う
		System.out.println();
	}
	/*
	 * 関数名:rRotate
	 * 概要:右にnビット回転した値を返す
	 * 引数:int型・ｘ・元になる整数
	 * 		int型・ｎ・いくつずらすかを表す
	 * 戻り値:int型・resultX・回転後の値を表す
	 * 作成日:2023/04/20
	 * */
	static int rRotate(int x,int n){
		//nビットシフトさせた後を表す変数を宣言
		int y = 0;
		//nビットシフトさせる
		y = x >>> n;
		//nビットシフトされた分が上位にあって残りが0になるような整数
		int newX= x << 32 - n;
		//動かした分はそのままで、残りは一方に１があれば１になる
		int resultX = y | newX;
		return resultX;
	}
	/*
	 * 関数名:lRotate
	 * 概要:左にnビット回転した値を返す
	 * 引数:int型・ｘ・元になる整数
	 * 		int型・ｎ・いくつずらすかを表す
	 * 戻り値:int型・resultX・回転後の値を表す
	 * 作成日:2023/04/20
	 * */
	static int lRotate(int x,int n){
		//nビットシフトさせた後を表す変数を宣言
		int y = 0;
		//nビット左シフトさせる
		y = x << n;
		//nビットシフトされたときに落ちた分が下位にあって、
		//残りが0になるような整数
		int newX = x >>> 32-n;
		//動かした分はそのままで、残りは一方に１があれば１になる
		int resultX = y | newX;
		//回転後の値を返す
		return resultX;
	}
	/*
	 * 関数名:main
	 * 概要:整数を左右にｎビット回転した値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/20
	 * */
	public static void main(String[]args) {
		//回転前の値を入力させる
		int inputInteger = readPlusInt();
		//いくつ回転させますか
		System.out.println("いくつ回転させますか");
		int shiftValue = readPlusInt();
		//元の整数を表示することを表示
		System.out.println("回転前："+inputInteger);
		//回転前のビット構造を表示する
		printBits(inputInteger);
		//回転後の値を表示する
		System.out.println("左回転後の値："+lRotate(inputInteger,shiftValue));
		//回転後の値のビット構造を表示
		printBits(lRotate(inputInteger,shiftValue));
		//回転後の値を表示する
		System.out.println("右回転後の値："+rRotate(inputInteger,shiftValue));
		//回転後の値のビット構造を表示
		printBits(rRotate(inputInteger,shiftValue));

	 }
}

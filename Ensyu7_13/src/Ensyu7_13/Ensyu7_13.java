package Ensyu7_13;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_13
* 概要:演習7-13
* 作成者:城所佑奈
* 作成日:2023/04/20
* */

public class Ensyu7_13 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	//ビット数を表す変数を宣言
	static int bitNumber = 32;
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
		for(int i=bitNumber-1; i>=0; i--) {
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
	 * 関数名:set
	 * 概要:最下位から数えてposビット目を1にして返す
	 * 引数:int型・ｘ・元になる整数
	 * 		int型・pos・最下位から数えて何番目か
	 * 戻り値:int型・resultX・posビット目を1になった整数
	 * 作成日:2023/04/20
	 * */
	static int set(int x,int pos){
		//最下位が１
		int y = 1;
		//posビット目だけが１になるようにする
		int posX = y << pos;
		//整数ｘのposビット目が１でも0でも１になるように理論和を求める
		int resultX = x | posX;
		//最下位から数えてposビット目が１の整数を返す
		return resultX;
	}
	
	/*
	 * 関数名:reset
	 * 概要:最下位から数えてposビット目を0にして返す
	 * 引数:int型・ｘ・元になる整数
	 * 		int型・pos・最下位から数えて何番目か
	 * 戻り値:int型・resultX・posビット目を0になった整数
	 * 作成日:2023/04/20
	 * */
	static int reset(int x,int pos){
		//最下位が１
		int y = 1;
		//posビット目だけが１になるようにする
		int posY = y << pos;
		//xの補数を求める
		int newX = ~x; 
		//posビット目は必ず１で他がｘの補数
		newX = posY | newX;
		//posビット目が0になって、他が補数になってたのから戻る
		int resultX = ~newX;
		//最下位から数えてposビット目が０の整数を返す
		return resultX;
		
	  }
	/*
	 * 関数名:invers
	 * 概要:最下位から数えてposビット目を反転して返す
	 * 引数:int型・ｘ・元になる整数
	 * 		int型・pos・最下位から数えて何番目か
	 * 戻り値:int型・resultX・posビット目を0になった整数
	 * 作成日:2023/04/20
	 * */
	static int invers(int x,int pos){
		//最下位が１
		int y = 1;
		//posビット目だけが１になるようにする
		int posY = y << pos;
		//posYはpos番目以外は0なので排他的論理和の結果は変わらず
		//posビット目が反転する
		int resultX = x ^ posY;
		//posビット目を反転した整数を返す
		return resultX;
		
	  }
	/*
	 * 関数名:main
	 * 概要:
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/20
	 * */
	public static void main(String[]args) {
		//posビット目がいくつかを入力させる
		System.out.println("posビット目を決めて下さい。");
		
		//posビット目を表す変数を宣言
		int posInteger = 0;
		//ループの開始
		do {
			//入力された値を読み込む
			posInteger = readPlusInt();
		//入力された値が32以上なら繰り返す
		}while(posInteger>=bitNumber);
		
		//元の整数を表示することを表示
		System.out.println("元になる整数を入力してください。");
		//入力された値を読み込む
		int inputInteger = readPlusInt();
		//posビット目が1の整数を表示する
		printBits(inputInteger);
		
		//何を表示するかを表示
		System.out.println("posビット目が1の整数");
		//posビット目が1の整数を表示する
		printBits(set(inputInteger,posInteger));
		//何を表示するかを表示
		System.out.println("posビット目が0の整数");
		//posビット目が０の整数を表示する
		printBits(reset(inputInteger,posInteger));
		//何を表示するかを表示
		System.out.println("posビット目が反転した整数");
		//posビット目が反転した整数を表示する
		printBits(invers(inputInteger,posInteger));
	 }
}
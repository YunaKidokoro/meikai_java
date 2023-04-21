package Ensyu7_14;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_14
* 概要:演習7-14
* 作成者:城所佑奈
* 作成日:2023/04/20
* */

public class Ensyu7_14 {
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
	//以下メソッドは教本に従って命名している
	/*
	 * 関数名:setN
	 * 概要:最下位から数えてposビット目からn個を1にして返す
	 * 引数:int型・ｘ・元になる整数
	 * 		int型・pos・最下位から数えて何番目か
	 * 		int型・ｎ・いくつ連続させるか
	 * 戻り値:int型・newX・posビット目からｎ個を1になった整数
	 * 作成日:2023/04/20
	 * */
	static int setN(int x,int pos, int n){
		//最下位が１の変数ｙと変化後の変数newX
		int y = 1, newX=0;
		//posビット目だけが１になるようにする
		y = y << pos;
		//ループ回数を数える変数を宣言
		int i= pos +1;
		//pos番目からn個分ループする
		while(i <= pos + n + 1) {
			//整数ｘのposビット目が１でも0でも１になるように理論和を求める
			newX = newX | y;
			//最後はpos番目を１にしたら終わり
			if(i==pos+n+1) {break;}
			//変えた値を隣にシフトさせる
			newX = newX<< 1;
			//何番目、を次の値にする
			i ++;
		}
		newX = x | newX;
		//最下位から数えてposビット目からｎ個が１の整数を返す
		return newX;
	}
	
	/*
	 * 関数名:resetN
	 * 概要:最下位から数えてposビット目からn個を0にして返す
	 * 引数:int型・ｘ・元になる整数
	 * 		int型・pos・最下位から数えて何番目か
	 * 		int型・ｎ・いくつ連続させるか
	 * 戻り値:int型・newX・posビット目からｎ個0になった整数
	 * 作成日:2023/04/20
	 * */
	static int resetN(int x,int pos, int n){
		//posビット目からｎ個１で他が０
		int y = setN(0,pos,n);
		//posビット目からｎ個までが1で他が反転している
		int newX = y | ~x;
		//反転している部分だけが戻る
		x = ~newX;
		//最下位から数えてposビット目からn個が０の整数を返す
		return x;
	  }
	/*
	 * 関数名:inversN
	 * 概要:最下位から数えてposビット目からn個を反転して返す
	 * 引数:int型・ｘ・元になる整数
	 * 		int型・pos・最下位から数えて何番目か
	 * 		int型・ｎ・いくつ連続させるか
	 * 戻り値:int型・newX・posビット目からn個が反転した整数
	 * 作成日:2023/04/20
	 * */
	static int inversN(int x,int pos, int n){
		//posビット目からｎ個１で他が０
		int y = setN(0,pos,n);
		//posビット目からｎ個までが1で他が反転している
		int newX = y ^ x;
		//最下位から数えてposビット目からn個が０の整数を返す
		return newX;
	
	  }
	/*
	 * 関数名:main
	 * 概要:整数のposビット目を最下位として
	 * 		連続するｎ個のビット目を変化させた整数を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/20
	 * */
	public static void main(String[]args) {
		//posビット目を表す変数を宣言
		int posInteger = 0;
		
		//元の整数を表示することを表示
		System.out.println("元になる整数を入力してください。");
		//入力された値を読み込む
		int inputInteger = readPlusInt();
		//入力された整数のビット構造を表示
		printBits(inputInteger);
		
		//posビット目がいくつかを入力させる
		System.out.println("posビット目を決めて下さい。");
		do {
			//入力された値を読み込む
			posInteger = readPlusInt();
		//入力された値が負または32以上であれば繰り返す
		}while(posInteger>bitNumber-1 || posInteger<0);
		
		//posビット目から連続させる値を表す変数を宣言
		int inputN = 0;
		//posビット目からいくつ連続させるかを入力させる
		System.out.println("posビット目からいくつ連続させますか。");
		do {
			//入力された値を読み込む
			inputN = readPlusInt() ;
		//入力された値が負またはposと合わせて32以上であれば繰り返す
		}while(inputN<0 || inputN+posInteger>bitNumber);
		
		
		//何を表示するかを表示
		System.out.println("posビット目から"+inputN+"が1の整数："+setN(inputInteger,posInteger,inputN));
		printBits(setN(inputInteger,posInteger,inputN));
		
		//何を表示するかを表示
		System.out.println("posビット目が0の整数："+resetN(inputInteger,posInteger,inputN));
		//posビット目が０の整数を表示する
		printBits(resetN(inputInteger,posInteger,inputN));
		
		//何を表示するかを表示
		System.out.println("posビット目が反転した整数："+inversN(inputInteger,posInteger,inputN));
		//posビット目が反転した整数を表示する
		printBits(inversN(inputInteger,posInteger,inputN));
	 }
}
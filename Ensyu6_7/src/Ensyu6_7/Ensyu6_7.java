package Ensyu6_7;
//randomクラスをインポートする
import java.util.Random;
//scanerクラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_7
 * 概要:演習6－7
 * 作成者:城所佑奈
 * 作成日:2023/04/14
 * */
public class Ensyu6_7 {
	/*
	 * 関数名:main
	 * 概要:探索するキーと同じ値が複数個存在する場合最も末尾にある要素を見つける
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/14
	 */
	public static void main(String[]args) {
		//ランダムクラスのインスタンスを初期化する
		Random randomInput  = new Random();
		//スキャナークラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);

		//要素数をきめる
		final int ELEMENT_NUMBER = 12;
		//配列を宣言
		int[] sarchArray = new int[ELEMENT_NUMBER];
		
		//配列のインデックスが0から要素数までループ
		for(int firstCount = 0; firstCount<ELEMENT_NUMBER ;firstCount++) {
			//0から9のランダムな値を配列要素に代入
			sarchArray[firstCount] = randomInput.nextInt(10);
		}
		//配列要素を表示するすることを伝える
		System.out.print("配列aの全要素の値\n{");
		//配列のインデックスが0から要素数までループ
		for(int firstCount = 0; firstCount<ELEMENT_NUMBER ;firstCount++) {
			//配列要素を表示する
			System.out.print(sarchArray[firstCount]+ " ");
		}
		//閉じ括弧の表示と改行をする
		System.out.println("}");
		
		//探す数値の入力を促す文を表示
		System.out.print("探す数値：");
		//入力された値を読み込む
		int keyNumber = inputNumber.nextInt();
		//配列のインデックスを表す変数を宣言する
		int secondCount = 0;
		//配列のインデックスが要素数-1から0までループ
		for(secondCount = ELEMENT_NUMBER-1; secondCount>=0; secondCount--) {
			//キーの値に一致する配列要素があった場合
			if(sarchArray[secondCount]==keyNumber) {
				break;
			}
		}
		
		//探索に成功した場合
		if(secondCount<ELEMENT_NUMBER && secondCount>0) {
			//キーのあった配列のインデックスを表示
			System.out.println("それはa["+secondCount+"]にあります。");
		}
		//探索に失敗した場合
		else {
			//キーがなかったことを表示
			System.out.println("それはありません。");
		}
	}
}

package Ensyu3_17;
//乱数生成のためにRomdamクラスをインポートする
import java.util.Random;
/*
 * クラス名:Ensyu3_17
 * 概要:演習3-17
 * 作成者:城所佑奈
 * 作成日:2023/04/07
 * */
public class Ensyu3_17 {
	/*
	 * 関数名:main
	 * 概要:生成された乱数をもとにグー・チョキ・パーを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/07
	 * */
	public static void main(String[]args) {
		//ランダムクラスのインスタンスを初期化する。
		Random randomNumber = new Random();
		//変数HandNumberに１～３の間の乱数を読み込む	
		int handNumber = randomNumber.nextInt(3)+1;
		//乱数の値で場合わけをする。
		switch(handNumber) {
		 //乱数が１のときはグーを表示
		 case 1: System.out.println("グー"); break;
		 //乱数が２のときはチョキを表示
		 case 2: System.out.println("チョキ"); break;
		 //乱数が３のときはパーを表示
		 case 3: System.out.println("パー"); break;
		}
	}
}

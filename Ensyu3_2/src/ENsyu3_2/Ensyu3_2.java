package ENsyu3_2;
//キーボードからの入力を行うためにjava.util.Scanerを読み込む
import java.util.Scanner;
/*
 * クラス名:Ensyu3_2
 * 概要:演習問題3-2
 * 作成者:城所佑奈
 * 作成日:2023/04/06
 * */
public class Ensyu3_2 {
	/*
	 * 関数名:main
	 * 概要:整数値の正負判定とif文とif else文の比較
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/06
	 * */
	public static void main(String[]args) {
		//変数に入力ストリームを読み込む
		Scanner stdIn = new Scanner (System.in);
		//整数値の入力を促す。
		System.out.print("整数値:");
		//変数nに入力された値を読み込む。
		int n = stdIn.nextInt();
		//入力された値が0より大きいか？
		if(n>0)
			//入力された値が正の数と表示する。
			System.out.println("その値は正です。");
		//入力された値が0より小さいか？
		else if(n<0)
			//入力された値が負の数と表示する。
			System.out.println("その値は負です。");
		else if(n==0) //n>0 と n<0のどちらも満たさず、かつn==0の時に実行される
		//else //n>0 と n<0のどちらも満たさないと実行される
		System.out.println("その値は0です。");
		//今回の条件はどちらも同じ意味になるため結果に影響はない
		}
}

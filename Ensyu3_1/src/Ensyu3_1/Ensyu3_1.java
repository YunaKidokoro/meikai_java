package Ensyu3_1;
//
import java.util.Scanner;
/*
 * クラス名:Ensyu3_1
 * 概要:演習３－１
 * 作成者:城所佑奈
 * 作成日:2023/04/06
 * */
public class Ensyu3_1 {
	/*
	 * 関数名:main
	 * 概要:整数値を読み込んで絶対値を返す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/06
	 * */
	public static void main(String[] args) {
		//変数に入力ストリームを渡す。
		Scanner Inputnumber = new Scanner (System.in);
		//整数の入力を促す。
		System.out.print("整数値:");
		//入力された整数値を変数に読み込む。
		int Intenger = Inputnumber.nextInt();
		//入力され値が0より大きいかの判定
		if(Intenger>=0) 
			//そのまま絶対値として表示する
			System.out.println("その絶対値は"+ Intenger +"です。");
		else
			//Intengerを絶対値になおして表示する
			System.out.println("その絶対値は"+ -Intenger +"です。");
	}

}

package Ensyu3_6;
//キーボードから入力するためにjava.util.Scannerをインポートする。
import java.util.Scanner;
/*
* クラス名:Ensyu3_6
* 概要:演習問題3-6
* 作成者:城所佑奈
* 作成日:2023/04/06
* */
public class Ensyu3_6 {
	/*
	 * 関数名:main
	 * 概要:入力された正の整数が10の倍数かどうか
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/06
	 * */
	public static void main(String[]args) {
		//変数に入力ストリームを渡す。
		Scanner InputNumber = new Scanner(System.in);
		//正の整数の値の入力を促す。
		System.out.print("正の整数を入力してください：");
		//入力された値を読み込む。
		int PlusIntenger = InputNumber.nextInt();
		//入力された値は10の倍数かどうか？
		if (PlusIntenger > 0)
			//正の整数かつ10で割り切れるとき
			if(PlusIntenger%10==0)
				System.out.println("その値は10の倍数です。");
			//正の整数でかつ割り切れないとき
			else
				System.out.println("その値は10の倍数ではありません。");	
		//正の整数でないとき
		else
			System.out.println("正でない値が入力されました。");		
	}
}
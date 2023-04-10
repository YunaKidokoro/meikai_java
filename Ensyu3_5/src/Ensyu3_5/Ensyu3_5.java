package Ensyu3_5;
//キーボードから入力するためにjava.util.Scannerをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu3_5
 * 概要:演習問題3-5
 * 作成者:城所佑奈
 * 作成日:2023/04/06
 * */
public class Ensyu3_5 {
	/*
	 * 関数名:main
	 * 概要:正の整数が5で割り切れるかの判定
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/06
	 * */
	public static void main(String[]args) {
		//変数に入力ストリームを渡す。
		Scanner inputNumber = new Scanner(System.in);
		//正の整数の値の入力を促す。
		System.out.print("正の整数を入力してください：");
		//入力された値を読み込む。
		int plusIntenger = inputNumber.nextInt();
		//入力された値が正の場合
		if (plusIntenger > 0)
			//正の整数が5で割り切れる場合
			if(plusIntenger%5==0)
				//その値は5で割り切れることを表示する
				System.out.println("その値は5で割り切れます。");
			//正の整数でかつ割り切れない場合
			else
				//その値は5で割り切れないことを表示する
				System.out.println("その値は5で割り切れません。");	
		//入力された値が正の整数でない場合
		else
			//入力された値が正でないことを表示する。
			System.out.println("正でない値が入力されました。");		
	}
}


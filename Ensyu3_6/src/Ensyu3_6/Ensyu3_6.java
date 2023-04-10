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
		Scanner inputNumber = new Scanner(System.in);
		//正の整数の値の入力を促す。
		System.out.print("正の整数を入力してください：");
		//入力された値を読み込む。
		int plusIntenger = inputNumber.nextInt();
		//入力された値が正の場合
		if (plusIntenger > 0)
			//正の整数かつ10で割り切れる場合
			if(plusIntenger % 10==0)
				//その値は10の倍数であることを表示する
				System.out.println("その値は10の倍数です。");
			//正の整数でかつ10で割り切れない場合
			else
				//その値は10の倍数でないことを表示する
				System.out.println("その値は10の倍数ではありません。");	
		//入力された値が正の整数でない場合
		else
			//正の整数でない値が入力されたことを表示する
			System.out.println("正でない値が入力されました。");		
	}
}
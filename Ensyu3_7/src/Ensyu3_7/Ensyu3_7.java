package Ensyu3_7;
//キーボードから入力するためにjava.util.Scannerをインポートする。
import java.util.Scanner;
/*
* クラス名:Ensyu3_7
* 概要:演習問題3-7
* 作成者:城所佑奈
* 作成日:2023/04/06
* */
public class Ensyu3_7 {
	/*
	 * 関数名:main
	 * 概要:入力された正の整数を３で割った余りで分類
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
		//入力された値を３で割った余りがどうなるか？
		if (PlusIntenger > 0)
			//正の整数で、３で割りきれるとき
			if(PlusIntenger%3==0)
				System.out.println("その値は3で割り切れます。");
			//正の整数でかつ割り切れなくて１余るとき
			else if(PlusIntenger%3==1)
				System.out.println("その値を3で割ったあまりは1です。");	
			//正の整数でかつ割り切れなくて余りが１でないとき
			else
				System.out.println("その値を3で割ったあまりは2です。");
			//正の整数でないとき
		elseでない値が入力されました。");		
	}
}
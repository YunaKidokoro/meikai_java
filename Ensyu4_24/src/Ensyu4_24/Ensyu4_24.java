package Ensyu4_24;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner ;
/*
 * クラス名:Ensyu4_24
 * 概要:演習4-24
 * 作成者:城所佑奈
 * 作成日:2023/04/12
 * */
public class Ensyu4_24 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ値が素数か判定する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/12
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputValue = new Scanner (System.in);
		//素数かの判定を行うことを表示
		System.out.println("入力した値が素数か判定します。");
		//入力を読み込むための変数を宣言する
		int inputInteger = 0;
		//ループの開始
		do {
			//整数値の入力を促す
			System.out.print("2以上の整数:");
			//入力された値を読み込む
			inputInteger = inputValue.nextInt() ;
		//1以下の整数が入力された場合には繰り返し入力を求める
		}while(inputInteger<=1);
		
		//カウント数を表す変数を宣言する
		int countNumber = 0;
		//カウント数を表す変数が1から入力値まで１ずつ増える間ループする
		for(countNumber = 2 ; countNumber < inputInteger; countNumber++) {
			//カウント数が入力された値の約数の場合
			if(inputInteger % countNumber==0) {
				//ひとつでも約数があれば素数でない
				System.out.println(inputInteger +"は素数ではありません。");
				//ループを抜ける
				break;
			}
		}
		//２から（入力値－1）まで約数がなかった場合
		if(countNumber == inputInteger) {
			//	入力された値が素数であると表示する
			System.out.println(inputInteger +"は素数です。");
		}
	}
}

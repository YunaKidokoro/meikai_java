package Ensyu2_10;
//キーボードからの入力を行うためにjava.util.Scannerをインポート
import java.util.Scanner;
/*
 * クラス名:Ensyu2_10
 * 概要:演習2-10
 * 作成者:城所佑奈
 * 作成日:2023/04/06
 * */
public class Ensyu2_10 {
	/*
	 * 関数名:main
	 * 概要:入力された名前を用いて挨拶文を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/10
	 * */
	public static void main(String[] args) {
		//変数に入力ストリームを渡す
		Scanner inputName  = new Scanner (System.in);
		//苗字の入力を促す文の表示
		System.out.print("姓：");
		//文字列を読み込む
		String familyName = inputName.next();
		//名前の入力を促す文の表示
		System.out.print("名：");
		//文字列を読み込む
		String firstName = inputName.next();
		//挨拶する文の表示する
		System.out.println("こんにちは"+familyName + firstName+"さん");
	}
	
}

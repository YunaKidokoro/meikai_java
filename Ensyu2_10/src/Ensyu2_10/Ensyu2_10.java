package Ensyu2_10;
//キーボードからの入力を行うためにjava.util.Scannerをインポート
import java.util.Scanner;
/*
 * クラス名
 * 概要
 * 作成者
 * 作成日
 * */
public class Ensyu2_10 {
	/*
	 * 関数名
	 * 概要
	 * 引数
	 * 戻り値
	 * 作成者
	 * 作成日
	 * */
	public static void main(String[] args) {
		//変数に入力ストリームを渡す
		Scanner name  = new Scanner (System.in);
		//苗字の入力を促す文の表示
		System.out.print("姓：");
		//文字列を読み込む
		String FamilyName = name.next();
		//名前の入力を促す文の表示
		System.out.print("名：");
		//文字列を読み込む
		String FirstName = name.next();
		//挨拶する文の表示する
		System.out.println("こんにちは"+FamilyName+FirstName+"さん");
	}
	
}

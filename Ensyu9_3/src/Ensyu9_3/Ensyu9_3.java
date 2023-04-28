package Ensyu9_3;

/*
 * クラス名:Ensyu9_3
 * 概要:演習9-3
 * 作成日:2023/04/26
 * 作成者:yuna
 * */
public class Ensyu9_3 {
	/*
	 * 関数名:main
	 * 概要:銀行口座クラスの
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/4/28
	 * 作成者:yuna
	 * */
	public static void main(String[]args) {
		
		//yunaの口座情報をインスタンスに代入する
		Account yuna = new Account("yuna","123456", 1000, new Day(2023,4,28));
		
		//200円引き出す
		yuna.withdraw(200);
		//何を表示するのかを表示
		System.out.println("yunaの口座情報");
		//口座情報を表示する
		System.out.println(yuna.toString());
	}
}
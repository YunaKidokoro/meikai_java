package Ensyu10_5;
/*
 * クラス名:Ensyu10_5
 * 概　要:演習10-5
 * 作成日:2023/5/8
 * 作成者:yuna
 * */
public class Ensyu10_5 {
	/*
	 * 関数名:main
	 * 概要:銀行口座クラスのインスタンス初期化子の処理の確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:yuna
	 * 作成日:2023/5/8
	 * */
	public static void main(String[]args) {
		Account yuna = new Account("yuna","123456",500);
		//何を表示するのかを表示
		System.out.println(yuna.getName()+"の口座情報");
		//口座情報を表示する
		System.out.println(yuna.toString());
		
		Account mama = new Account("mama","456789",1000);
		//何を表示するのかを表示
		System.out.println(mama.getName()+"の口座情報");
		//口座情報を表示する
		System.out.println(mama.toString());

	}
}

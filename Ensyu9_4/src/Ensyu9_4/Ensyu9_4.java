package Ensyu9_4;
/*
 * クラス名：Ensyu9_4
 * 概　要:演習9_4
 * 作成日:2023/04/28
 * 作成者:yuna
 * */
public class Ensyu9_4 {
	/*
	 * 関数名:main
	 * 概　要:人の健康データを表示
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/28
	 * 作成者:yuna
	 * */
	public static void main(String[]args) {
		//yunaの人間データをインスタンスに代入する
		HumanClass yuna = new HumanClass("yuna",160, 50,0,new Day(2000,8,28));
		//代入した内容を表示する
		System.out.println(yuna.toString());
	}
}

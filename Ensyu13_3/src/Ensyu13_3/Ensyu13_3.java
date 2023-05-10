package Ensyu13_3;
/**
 * クラス名:Ensyu13_3
 * 概　要:演習13-3
 * 作成日:2023/5/10
 * 作成者:yuna
 */
public class Ensyu13_3 {
	/**
	 * クラス名:main
	 * 概　要:じゃんけんするプログラム
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成者:yuna
	 * 作成日:2023/5/10
	 */
	public static void main(String[]arfs) {
		//これから何をするのかの表示をする
		System.out.println("じゃんけんスタート");
		//人間プレイヤーのインスタンスを生成する
		HumanPlayer humanPlayer = new HumanPlayer();
		//人間プレイヤーの出す手を決定する
		humanPlayer.print();
		//コンピュータープレイヤーインスタンスを生成する
		CompPlayer compPlayer = new CompPlayer();
		//コンピュータープレイヤーの出す手を決定する
		compPlayer.print();
		//人間プレイヤーの出す手を表す値を取得して変数に代入する
		int humnaNumber = humanPlayer.getHumanHand();
		//コンピュータープレイヤーの出す手を表す値を取得して変数に代入する
		int computerNumber = compPlayer.getComputerHand();
		//人間プレイヤーが勝った場合
		if ((humnaNumber == 1 && computerNumber == 1) || (humnaNumber == 2 && computerNumber == 2) || (humnaNumber == 3 && computerNumber == 0))
			//人間プレイヤーの勝利を表示
			System.out.println("あなたの勝ちです！");
		//人間プレイヤーが負けた場合
		else if ((humnaNumber == 1 && computerNumber == 2) || (humnaNumber == 2 && computerNumber == 0) || (humnaNumber == 3 && computerNumber == 1))
			//人間プレイヤーの負けを表示
			System.out.println("あなたの負けです...");
		//あいこの場合
		else {
			//あいこを表示
			System.out.println("あいこです。");
		}
	}
}

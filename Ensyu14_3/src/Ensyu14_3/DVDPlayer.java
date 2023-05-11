package Ensyu14_3;

/**
 * DVDPlayerクラス<br>ExPlayerインタフェースの実装クラス<br>
 * 作成日:2023/5/11
 * @author yuna
 */
public class DVDPlayer implements ExPlayer {
	
	/**
	 * 関数名：play
	 * 概要：DVDプレイヤーの再生を行う
	 * 作成日:2023/5/11
	 * @param なし
	 * @return なし
	 * @author yuna
	 */
	public void play() {
		System.out.println("■DVD再生開始！");
	}
	/**
	 * 関数名：stop
	 * 概要：DVDプレイヤーの停止を行う
	 * 作成日:2023/5/11
	 * @param なし
	 * @return なし
	 * @author yuna
	 */
	public void stop() {
		System.out.println("■DVD再生終了！");
	}
	/**
	 * 関数名：slow
	 * 概要：DVDプレイヤーのスロー再生を行う
	 * 作成日:2023/5/11
	 * @param なし
	 * @return なし
	 * @author yuna
	 */
	public void slow() {
		System.out.println("■DVDスロー再生開始！");
	}
}

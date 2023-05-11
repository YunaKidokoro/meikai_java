package Ensyu14_3;
/**
 * Ensyu14_3<br> 演習14_3<br>
 * 作成日:2023/5/11
 * @author yuna
 */
public class Ensyu14_3 {
	/**
	 * main <br> DVDPlayerクラスの利用<br>
	 * 作成日:2023/5/11
	 * @author yuna
	 */
	public static void main(String[]args) {
		//DVDPlayerクラスのインスタンスを生成する
		DVDPlayer dvdPlayInstance = new DVDPlayer();
		//DVDの再生を行う
		dvdPlayInstance.play();
		//DVDの停止を行う
		dvdPlayInstance.stop();
		//DVDのスロー再生を行う
		dvdPlayInstance.slow();
	}
}
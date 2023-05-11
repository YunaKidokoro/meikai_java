package Ensyu14_2;
/**
 * クラス名:Pet
 * 概　要:ペットクラス
 * 作成日:2023/5/10
 */
public class Pet {
	//フィールド
	//ペットの名前を表すフィールド
	private String petName;
	//ペットの飼い主を表すフィールド
	private String masterName;
	//コンストラクタ
	public Pet(String petName, String masterName) {
		//ペットの名前を表す引数で初期化する
		this.petName = petName;
		//飼い主の名前を表す引数で初期化する
		this.masterName = masterName;
	}
	
	/**
	 * 概  要:ペットの名前を調べる
	 * 引  数:なし
	 * 戻り値:petName 	ペットの名前
	 * 作成日:2023/5/10
	 */
	public String getName() {
		//ペットの名前を返却
		return petName;
	}
	/**
	 * 概  要:飼い主の名前を調べる
	 * 引  数:なし
	 * 戻り値:masterName	飼い主の名前
	 * 作成日:2023/5/10
	 */
	public String getMasterName() {
		//飼い主の名前を返却
		return masterName;
	}
	//自己紹介メソッド
	public void introduce() {
		//ペットの名前を紹介する文を表示する
		System.out.println("ぼくのなまえは"+petName+"です");
		//飼い主の名前を紹介する文を表示する
		System.out.println("ご主人さまは"+masterName+"です");
	}
}

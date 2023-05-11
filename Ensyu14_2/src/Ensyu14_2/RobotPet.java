package Ensyu14_2;
/**
 * クラス名:Ensyu14_2
 * 概　要:ロボットペットクラス（ペットクラスの派生クラス）
 * 作成日:2023/5/10
 * 作成者:yuna
 */
public class RobotPet extends Pet{

	//コンストラクタ
	public RobotPet(String petName, String masterName) {
		//スーパークラスのコンストラクタ
		super(petName, masterName);
	}
	/**
	 *関数名:introduce
	 *概  要:ペットの名前と飼い主の名前を紹介する
	 *引  数:なし
	 *戻り値:なし
	 *作成日:2023/5/10
	 */
	public void introduce() {
		//ロボットの名前を紹介する文を表示する
		System.out.println("私はロボットです。\n名前は"+getName()+"です");
		//所有者の名前を紹介する文を表示する
		System.out.println("ご主人さまは"+getMasterName()+"です");
	}
	/**
	 * 関数名:workRobot
	 * 概  要:引数の値に対応した仕事を行う
	 * 引  数:int型、sw、ロボットの動作を決める値
	 * 戻り値:なし
	 * 作成日:2023/5/10
	 */
	public void workRobot(int sw) {
		switch(sw) {
		//引数が0の場合
		case 0:
			//掃除をする
			System.out.println("掃除します。");
			//switch文から抜ける
			break;

		//引数が1の場合
		case 1:
			//洗濯をする
			System.out.println("洗濯します。");
			//switch文から抜ける
			break;

		//引数が2の場合
		case 2:
			//炊事をする
			System.out.println("炊事します。");
			//switch文から抜ける
			break;
		}
	}
}

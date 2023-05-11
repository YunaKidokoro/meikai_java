package Ensyu14_2;

/**
 * SkinnablePetクラス(RobotPetクラスの派生クラス、Skinnableインタフェースの実装クラス)
 * 着せ替えの変更を行う
 * @author yuna
 * 作成日:2023/5/10
 */
public class SkinnablePet extends RobotPet implements Skinnable{
	//着せ替えの種類を表すフィールド
	private int skin;
	//コンストラクタ
	SkinnablePet(String petName, String masterName, int skin){
		//スーパークラスのコンストラクタ
		super(petName,masterName);
		//着せ替えの種類を表す引数で初期化する
		this.skin = skin;
	}
	//着せ替えの種類をまとめた配列
	String[] kindOfSkins = {"漆黒","深紅","柳葉","露草","豹柄","無地",};
	
	
	/**
	 * getSkin<br> 着せ替えの種類を取得する<br>
	 * 作成日:2023/5/11
	 * @param なし
	 * @return skin 着せ替えの種類
	 * @author yuna
	 */
	public String getSkin() {
		return kindOfSkins[skin];
	}
	/**
	 * printSkin　着せ替えの種類を表示するメソッド
	 * @author yuna
	 * 作成日:2023/5/10
	 */
	public void printSkin() {
		//着せ替えの種類を提示することを表示
		System.out.println("着せ替えのしゅるい");
		//配列の先頭から末尾までループ
		for(int i=0; i<kindOfSkins.length; i++) {
			//配列要素の表示、インデックスの値と種類とを結びつける
			System.out.println(i + "..." + kindOfSkins[i]);
		}
	}
	/**
	 * changeSkin　着せ替えの変更をする
	 * @param skin 変更したい着せ替えの種類
	 * @author yuna
	 * 作成日:2023/5/10
	 */
	public void changeSkin(int skin) {
		if(this.skin == skin) {
			System.out.println("変更を行いませんでした。");
		}
		else {
			//着せ替えの種類を引数のものに変更する
			this.skin = skin;
			//変更したことを表示する
			System.out.print("スキンを"+ kindOfSkins[skin]+ "に変更しました。");
		}
	}
}

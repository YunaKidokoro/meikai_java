package Ensyu14_2;

/**
 * 名  前:Skinnable
 * 概  要:着せ替えを選ぶ
 * 作成日:2023/5/10
 * 作成者:yuna
 */
public interface Skinnable {
	
	//着せ替えの一覧を表示する
	public void printSkin();
	//引数にとった着せ替えに変更する
	public void changeSkin(int skin);
}

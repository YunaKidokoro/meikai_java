package Ensyu8_1;
/*
 * クラス名:HumanClass
 * 概要:名前、身長、体重を扱う
 * 作成日:2023/04/26
 * 作成者:城所佑奈
 * */
class HumanClass{
	//名前をインスタンス化
	private String humanName;
	//身長をインスタンス化
	private int heightValue;
	//体重をインスタンス化
	private int weightValue;
	
	//コンストラクタ
	HumanClass(String humanName, int heightValue, int weightValue ){
		//名前を表すフィールドを初期化する
		this.humanName = humanName;
		//身長を表すフィールドを初期化する
		this.heightValue = heightValue;
		//体重を表すフィールドを初期化する
		this.weightValue = weightValue;
	}
	/*
	 * 関数名:getName
	 * 概要:名前を調べる
	 * 引数:なし
	 * 戻り値:string型・humanName・その人の名前
	 * 作成日:2023/04/26
	 * */
	String getName() {
		//その人の名前を返す
		return humanName;
	}
	/*
	 * 関数名:getHeight
	 * 概要:身長を調べる
	 * 引数:なし
	 * 戻り値:string型・heightValue・身長
	 * 作成日:2023/04/26
	 * */
	int getHeight() {
		//身長を返す
		return heightValue;
	}
	/*
	 * 関数名:getWeight
	 * 概要:身長を調べる
	 * 引数:なし
	 * 戻り値:string型・weightValue・体重
	 * 作成日:2023/04/26
	 * */
	int getWeight() {
		//体重を返す
		return weightValue;
	}
}
/*
 * クラス名:Ensyu8_1
 * 概要:演習8-1
 * 作成日:2023/04/26
 * 作成者:城所佑奈
 * */
public class Ensyu8_1 {
	/*
	 * 関数名:main
	 * 概要:HumanClassのテスト
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/26
	 * */
	public static void main(String[]args) {
		//yunaのコンストラクタを呼び出す
		HumanClass yuna = new HumanClass("yuna",160,50);
		//オブジェクトにメッセージを送る
		//だれのデータか表示する
		System.out.println("名前："+ yuna.getName());
		//身長を表示する
		System.out.println("身長："+ yuna.getHeight());
		//体重を表示する
		System.out.println("体重："+ yuna.getWeight());
	}
}
	

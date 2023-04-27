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
	//身長(cm)をインスタンス化
	private int heightValue;
	//体重(kg)をインスタンス化
	private int weightValue;
	//BMIをインスタンス化
	private float bodyMassIndex;
	
	//コンストラクタ
	HumanClass(String humanName, int heightValue, int weightValue, float bodyMassIndex ){
		//名前を表すフィールドを初期化する
		this.humanName = humanName;
		//身長を表すフィールドを初期化する
		this.heightValue = heightValue;
		//体重を表すフィールドを初期化する
		this.weightValue = weightValue;
		//BMIを表すフィールドを初期化する
		this.bodyMassIndex = bodyMassIndex;
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
	 * 戻り値:int型・heightValue・身長
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
	 * 戻り値:int型・weightValue・体重
	 * 作成日:2023/04/26
	 * */
	int getWeight() {
		//体重を返す
		return weightValue;
	}
	/*
	 * 関数名:getBMI
	 * 概要:BMIを調べる
	 * 引数:int型・weight・体重
	 * 		int型・hight ・身長
	 * 戻り値:float型・bodyMassIndex・BMI
	 * 作成日:2023/04/26
	 * */
	float getBMI(int weight, int hight) {
		//BMIを計算する(身長はm単位に直す)
		bodyMassIndex = (weight*10000)/(hight*hight);
		//BMIを返す
		return bodyMassIndex;
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
		HumanClass yuna = new HumanClass("yuna",160,50, 0);
		//オブジェクトにメッセージを送る
		//身長を変数に代入
		int yunaHeight = yuna.getHeight();
		//体重を変数に代入
		int yunaWeight = yuna.getWeight();
		//だれのデータか表示する
		System.out.println("名前："+ yuna.getName());
		//身長を表示する
		System.out.println("身長："+ yunaHeight);
		//体重を表示する
		System.out.println("体重："+ yunaWeight);
		//BMIを表示する
		System.out.println("BMI ："+ yuna.getBMI(yunaWeight,yunaHeight));
	}
}
	

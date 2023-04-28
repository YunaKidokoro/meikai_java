package Ensyu9_1;
/*
 * クラス名:HumanClass
 * 概要:名前、身長、体重、BMIを扱う
 * 作成日:2023/04/26
 * 作成者:城所佑奈
 * */
public class HumanClass{
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
	 * 引数:なし
	 * 戻り値:float型・bodyMassIndex・BMI
	 * 作成日:2023/04/26
	 * */
	float getBMI() {
		//BMIを計算する(身長はm単位に直す)
		bodyMassIndex = (weightValue*10000)/(heightValue*heightValue);
		//BMIを返す
		return bodyMassIndex;
	}
}

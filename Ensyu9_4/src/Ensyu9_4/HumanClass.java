package Ensyu9_4;
/*
 * クラス名:HumanClass
 * 概要:名前、身長、体重、BMIを扱う
 * 作成日:2023/04/26
 * 作成者:城所佑奈
 * */
public class HumanClass{
	//名前を表すフィールド
	private String humanName;
	//身長(cm)を表すフィールド
	private int heightValue;
	//体重(kg)を表すフィールド
	private int weightValue;
	//BMIを表すフィールド
	private float bodyMassIndex;
	//誕生日を表すフィールド
	private Day birthday;
	
	//コンストラクタ
	HumanClass(String humanName, int heightValue, int weightValue, float bodyMassIndex, Day birthday){
		//名前を表すフィールドを初期化する
		this.humanName = humanName;
		//身長を表すフィールドを初期化する
		this.heightValue = heightValue;
		//体重を表すフィールドを初期化する
		this.weightValue = weightValue;
		//BMIを表すフィールドを初期化する
		this.bodyMassIndex = bodyMassIndex;
		//誕生日を表すフィールドを初期化する
		this.birthday = new Day(birthday);
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
	/*
	 * 関数名：passObesityRate
	 * 概　要：BMIから肥満率を返す
	 * 引　数：float型・bodyMassIndex・BMI
	 * 戻り値：肥満率を健康状態に対応する値にして返却
	 * 作成日：2023/04/27
	 * */
	int passObesityRate(float bodyMassIndex) {
		//肥満度を表す変数
		int howObesity = 0;
		//BMIが18.5未満の場合
		if(bodyMassIndex<18.5) {howObesity = 0;}
		//BMIが25未満の場合
		else if(bodyMassIndex<25) {howObesity = 1;}
		//BMIが30未満の場合
		else if(bodyMassIndex<30) {howObesity = 2;}
		//BMIが35未満の場合
		else if(bodyMassIndex<35) {howObesity = 3;}
		//BMIが40未満の場合
		else if(bodyMassIndex<40) {howObesity = 4;}
		//BMIが40以上の場合
		else {howObesity = 5;}
		//肥満率を健康状態に対応する値にして返却
		return howObesity;
	}
	
	
	/*
	 * 関数名：getBirthday
	 * 概　要：誕生日を調べる
	 * 引　数：なし
	 * 戻り値：誕生日の日付を返す
	 * 作成日：2023/04/28
	 * */
	public Day getBirthday() {
		//誕生日の日付を返す
		return new Day(birthday);
	}
	/*
	 * 関数名：toString
	 * 概　要：文字列表現を返却
	 * 引　数：なし
	 * 戻り値：名前・身長・体重・BMI・誕生日の文字列を返す
	 * 作成日：2023/04/28
	 * */
	public String toString() {
		//肥満度を表す文字を格納した配列
		String[] BMI = {"瘦せ型","普通体型","肥満度１","肥満度２","肥満度３","肥満度４"};
		//文字列を返却
		return String.format("名　前："+ getName() + "\n誕生日："+getBirthday() +"\n身　長："
		+ getHeight()+"\n体　重："+ getWeight()+"\nＢＭⅠ："+ getBMI(getWeight(),getHeight())+
		" "+BMI[passObesityRate(bodyMassIndex)]);
	}
	
}



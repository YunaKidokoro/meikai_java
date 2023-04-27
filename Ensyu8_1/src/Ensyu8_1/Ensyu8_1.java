package Ensyu8_1;
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
		//HumanClass型のインスタンスyunaを構築
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
	

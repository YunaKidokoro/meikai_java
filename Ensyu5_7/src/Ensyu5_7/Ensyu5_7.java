package Ensyu5_7;
/*
 * クラス名:Ensyu5_7
 * 概要:演習5-7
 * 作成者:城所佑奈
 * 作成日:2023/04/13
 * */
public class Ensyu5_7 {
	/*
	 * 関数名:main
	 * 概要:0.0から1.0までの値とその二乗を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/13
	 * */
	public static void main(String[]args) {
		//表のラベルを表示する
		System.out.printf("%10s%10s\n", "x","x^2");
		//表の罫線を表示する
		System.out.println("--------------------");
		//順に大きくなっていく変数としてsumValue、二乗を表す変数としてsquareValueを宣言
		float sumValue = 0, squareValue=0;
		//カウント数が0から1000までループする
		for(int countNumber = 0; countNumber<=1000; countNumber++) {
			
			//0.0から1.0まで0.001単位で増やす、繰り返しの度に1000で割る
			sumValue = (float)countNumber/1000;
			//値を表示する
			System.out.printf("%10f",sumValue);
			//二乗を求める
			squareValue = sumValue * sumValue;
			//二乗の値を表示する
			System.out.printf("%10f",squareValue);
			//改行をする
			System.out.println();
		}
	}
}
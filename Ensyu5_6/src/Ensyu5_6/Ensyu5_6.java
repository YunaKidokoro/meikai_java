package Ensyu5_6;
/*
 * クラス名:Ensyu5_6
 * 概要:演習5-6
 * 作成者:城所佑奈
 * 作成日:2023/04/13
 * */
public class Ensyu5_6 {
	/*
	 * 関数名:main
	 * 概要:2種類の方法で0.0から1.0までを表示して違いを確認する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/13
	 * */
	public static void main(String[]args) {
		//float型で0から順に加算していく値を格納する変数を宣言する
		float firstSum = 0.0F, secondSum = 0.0F;
		
		//表のラベルを表示する
		System.out.printf("%10s%11s", "float","int");
		//表の罫線を表示する
		System.out.println("\n-------------------------");
		//カウント数を表す変数を宣言、この値を用いて順に計算をおこなう
		int count =0;
		//繰り返しをfloatで制御しながら0.0から1.0まで0.001単位で増やす
		for (firstSum=0.0F; firstSum<=1.0F; firstSum+=0.001F) {
			//for文の刻み幅がフロート型で0.001になっていて、
			//この求めかたでの値を表示
			System.out.printf("%10f",firstSum);
			
			//0.0から1.0まで0.001単位で増やす、繰り返しの度に1000で割る
			secondSum = (float)count/1000;
			//この求め方での値を表示す
			System.out.printf("%10f",secondSum);
			//カウント数を増やす
			count++;
			//改行をいれる
			System.out.println();
		}
	}
}

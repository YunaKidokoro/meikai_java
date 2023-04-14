package Ensyu6_3;
/*
 * クラス名:Ensyu6_3
 * 概要:演習6-3
 * 作成者:城所佑奈
 * 作成日:2023/04/14
 * */
public class Ensyu6_3 {
	/*
	 * 関数名:main
	 * 概要:要素数が5の配列に対して先頭から順に1.1~5.5を代入して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/14
	 * */
	public static void main(String[]args) {
		//構成要素数が5で、要素型がdouble型の配列を生成する。
		double []variableArray = new double[5];
		//インデックスの要素に値を代入していく
		//カウント数が要素数から1になるまでループする
		for(int countNumber=0; countNumber<variableArray.length; countNumber++) {
			//順に値を代入していく
			variableArray[countNumber] = countNumber+1 + (countNumber+1)*0.1;
		}
		
		//全要素の値を表示する
		//インデックスが0から要素数になるまでループする
		for(int countNumber=0; countNumber<variableArray.length; countNumber++) {
			//順に値を表示していく
			System.out.println("a[" + countNumber + "]=" + variableArray[countNumber]);
		}
	}
}

package Ensyu6_2;
/*
 * クラス名:Ensyu6_2
 * 概要:演習6-2
 * 作成者:城所佑奈
 * 作成日:2023/04/13
 * */
public class Ensyu6_2 {
	/*
	 * 関数名:main
	 * 概要:int型で要素数が5の配列に対して先頭から順に5~1を代入して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/13
	 * */
	public static void main(String[]args) {
		//構成要素数が5で、要素型がint型の配列を生成する。
		int []variableArray = new int[5];
		//インデックスの要素に値を代入していく
		//カウント数が要素数から1になるまでループする
		for(int countNumber=0; countNumber<variableArray.length; countNumber++) {
			//順に値を代入していく
			variableArray[countNumber] = variableArray.length - countNumber;
		}
		
		//全要素の値を表示する
		//インデックスが0から要素数になるまでループする
		for(int countNumber=0; countNumber<variableArray.length; countNumber++) {
			//順に値を表示していく
			System.out.println("a[" + countNumber + "]=" + variableArray[countNumber]);
		}
	}
}

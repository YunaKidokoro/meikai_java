package Ensyu6_1;
/*
 * クラス名:Ensyu6_1
 * 概要:演習6-1
 * 作成者:城所佑奈
 * 作成日:2023/04/13
 * */
public class Ensyu6_1 {
	/*
	 * 関数名:main
	 * 概要:要素数が5の配列を生成して値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/13
	 * */
	public static void main(String[]args) {
		//構成要素数が5で、要素型がdouble型の配列を生成する。
		double []variableArray = new double[5];
		//インデックスの要素に値を代入していく
		//インデックスが0の要素
		variableArray[0] = 1; 
		//インデックスが1の要素
		variableArray[1] = 1; 
		//インデックスが2の要素
		variableArray[2] = variableArray[1]*2; 
		//インデックスが3の要素
		variableArray[3] = variableArray[2]+1; 
		//インデックスが4の要素
		variableArray[4] = variableArray[3]+2;
		
		//全要素の値を表示する
		//インデックス0
		System.out.println("a["+0+"]=" + variableArray[0]);
		//インデックス1
		System.out.println("a["+1+"]=" + variableArray[1]);
		//インデックス2
		System.out.println("a["+2+"]=" + variableArray[2]);
		//インデックス3
		System.out.println("a["+3+"]=" + variableArray[3]);
		//インデックス4
		System.out.println("a["+4+"]=" + variableArray[4]);
	}
}

package Ensyu10_3;
/*
 * クラス名:MinMax
 * 概　要:最大値や最小値を求めるユーティリティくらす
 * 作成日:2023/5/1
 * 作成者:yuna
 * */
public class MinMax {
	/*
	 * 関数名：min
	 * 概要:2値の最小値を返す
	 * 引数:int型・a・任意の整数
	 * 		int型・b・任意の整数
	 * 戻り値:int・maximumNumber・引数のうち小さい方の値を返す
	 * 作成日:2023/04/25
	 * */
	static int min(int a, int b) {
		//仮にaの方が小さいとして最小値を表す変数を宣言する
		int maximumNumber = a;
		//bの方がaより小さい場合、最小値をbの値に変える
		if(a>b) {maximumNumber = b;}
		//最小値を返す
		return maximumNumber;
	}
	/*
	 * 関数名：min
	 * 概要:3値の最小値を求める
	 * 引数:int型・a・任意の整数値
	 * 		int型・b・任意の整数値
	 * 		int型・c・任意の整数値
	 * 戻り値:int・maximumNumber・引数のうち最小値を返す
	 * 作成日:2023/04/25
	 * */
	static int min(int a, int b, int c) {
		//仮にaが最小値だとして変数を宣言する
		int maximumNumber = a;
		//bの方が最小値より小さい場合
		if(a>b) {
			//最小値の値をbの値に変える
			maximumNumber = b;
		}
		//cの方が最小値より小さい場合
		if(maximumNumber>c){
			//最小値の値をcに変える
			maximumNumber = c;
		}
		//最小値を返す
		return maximumNumber;
	}
	/*
	 * 関数名：min
	 * 概　要:配列の最小値を求める
	 * 引　数:int[]型・a[]・最小値を探したい配列
	 * 戻り値:３つの整数のうちの最小値を返す
	 * 作成日:2023/04/25
	 * */
	static int min(int[] a) {
		//仮にaが最小値だとして変数を宣言する
		int minimumNumber = a[0];
		//配列の先頭から末尾までループ
		for(int i=0; i<a.length; i++) {
			//配列要素の値が最小値より小さい場合
			if(minimumNumber>a[i]) {
				//最小値の値を入れ替える
				minimumNumber = a[i];
			}
		}
		//最小値を返す
		return minimumNumber;
	}
	
	/*
	 * 関数名：max
	 * 概要:2値の最大値を返す
	 * 引数:int型・a・任意の整数
	 * 		int型・b・任意の整数
	 * 戻り値:int・maximumNumber・引数のうち大きい方の値を返す
	 * 作成日:2023/5/1
	 * */
	static int max(int a, int b) {
		int maximumNumber = a;
		if(b>a) {
			maximumNumber = b;
		}
		return maximumNumber;
	}
	/*
	 * 関数名：max
	 * 概要:3値の最大値を求める
	 * 引数:int型・a・任意の整数値
	 * 		int型・b・任意の整数値
	 * 		int型・c・任意の整数値
	 * 戻り値:int・maximumNumber・引数のうち最大値を返す
	 * 作成日:2023/5/1
	 * */
	static int max(int a, int b, int c) {
		//仮にaが最大値だとして変数を宣言する
		int maximumNumber = a;
		//bの方が最大値より大きい場合
		if(b>a) {
			//最大値の値をbの値に変える
			maximumNumber = b;
		}
		//cの方が最大値より大きい場合
		if(c>maximumNumber){
			//最大値の値をcに変える
			maximumNumber = c;
		}
		//最大値を返す
		return maximumNumber;
	}
	
	/*
	 * 関数名：min
	 * 概　要:配列の最大値を求める
	 * 引　数:int[]型・a[]・最大値を探したい配列
	 * 戻り値:３つの整数のうちの最大値を返す
	 * 作成日:2023/04/25
	 * */
	static int max(int[] a) {
		//仮にaが最大値だとして変数を宣言する
		int maximumNumber = a[0];
		//配列の先頭から末尾までループ
		for(int i=0; i<a.length; i++) {
			//配列要素の値が最大値より大きい場合
			if( a[i] > maximumNumber) {
				//最大値の値を入れ替える
				maximumNumber = a[i];
			}
		}
		//最大値を返す
		return maximumNumber;
	}
}



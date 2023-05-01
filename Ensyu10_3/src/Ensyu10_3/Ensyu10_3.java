package Ensyu10_3;
/*
 * クラス名:Ensyu10_3
 * 概　要:演習10-3
 * 作成日:2023/5/1
 * 作成者:yuna
 * */
public class Ensyu10_3 {

	/*
	 * 関数名:main
	 * 概　要:MinMaxクラスのテスト
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/1
	 * 作成者:yuna
	 * */
	public static void main(String[]args) {
		//3値の最大・最小値を求めることを表示
		System.out.println("3値{4,3,5}の最大値と最小値を求める");
		//3値の最大・最小値を表示
		System.out.println("最小値:"+MinMax.min(4,3,5)+
				"\n最大値:"+MinMax.max(4,3,5));
		//コンソール画面を見やすくために改行
		System.out.println();
		
		//2値の最大・最小値を求めることを表示
		System.out.println("2値{4,-1}の最大値と最小値を求める");
		//2値の最大・最小値を表示
		System.out.println("最小値:"+MinMax.min(4,-1)+
				"\n最大値:"+MinMax.max(4,-1));
		//コンソール画面を見やすくために改行
		System.out.println();
		
		//配列を生成する
		int []sarchArray = {1,9,7,3,5};
		//配列の最大・最小値を求めることを表示
		System.out.println("配列a{1,9,7,3,5}の最大値と最小値を求める");
		//配列の最大・最小値を表示
		System.out.println("最小値:"+MinMax.min(sarchArray)+
				"\n最大値:"+MinMax.max(sarchArray));

	}
}

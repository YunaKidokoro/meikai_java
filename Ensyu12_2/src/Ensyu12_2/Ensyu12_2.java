package Ensyu12_2;
/*
 * クラス名:Ensyu12_2
 * 概要:演習12-2
 * 作成者:yuna
 * 作成日:2023/5/9
 * */
public class Ensyu12_2 {
	/*
	 * 関数名:main
	 * 概要:定期預金付き銀行口座クラスのテスト
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:yuna
	 * 作成日:2023/5/9
	 * */
	public static void main (String[]args){
		//定期預金付きの銀行口座アカウントのインスタンスを生成
		TimeAccount a = new TimeAccount("定期預金","123456",7654321,1234567);
		//口座名を取得して表示
		System.out.println("口座名 : " + a.getName());
		//口座番号を表示
		System.out.println("口座番号 : " + a.getNo());
		//口座残高を取得して表示
		System.out.println("口座残高 : " + a.getBalance());
		
		//コンソール画面を見やすくするために改行
		System.out.println();
		
		//普通預金の銀行口座アカウントのインスタンスを生成
		Account b = new Account("普通預金","654321",123456);
		//口座名を取得して表示
		System.out.println("口座名 : " + b.getName());
		//口座番号を表示
		System.out.println("口座番号 : " + b.getNo());
		//口座残高を取得して表示
		System.out.println("口座残高 : " + b.getBalance());
		//それぞれの口座残高を比較した結果を表示する
		TimeAccount.printCompBalance(a,b);
	}
}

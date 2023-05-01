package Ensyu10_1;
/*
 * クラス名:Ensyu10_1
 * 概　要:演習10-1
 * 作成者:yuna
 * 作成日:2023/5/1
 * */
public class Ensyu10_1 {
	/*
	 * 関数名：main
	 * 概要:Idクラスのテストクラス
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:yuna
	 * 作成日:2023/5/1
	 * */
	public static void main(String[]args) {
		//最後に与えた識別番号を表示する
		System.out.println("最後に与えた識別番号："+Id.getMaxid());
		//新しく識別番号を与えることを表示する
		System.out.println("aとbに識別番号を与える。");
		//識別番号１番のインスタンスaを生成
		Id a = new Id();
		//識別番号２番のインスタンスbを生成
		Id b = new Id();
		
		//aの識別番号を表示
		System.out.println("aの識別番号："+ a.getId());
		//bの識別番号を表示
		System.out.println("bの識別番号："+ b.getId());	
		//最後に与えた識別番号を表示する
		System.out.println("最後に与えた識別番号："+Id.getMaxid());
	}
}

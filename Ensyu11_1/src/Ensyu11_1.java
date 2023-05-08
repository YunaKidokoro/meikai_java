import id.DateId;
/*
 * クラス名:Ensyu11_1
 * 概　要:演習11-1
 * 作成日:2023/5/8
 * 作成者:yuna
 * */
public class Ensyu11_1 {
	/*
	 * クラス名:Ensyu11_1(DateIdのテストクラス)
	 * 概　要:パッケージの所属を変える
	 * 		このパッケージは無名パッケージに所属させること
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * 作成者:yuna
	 * */
	public static void main(String[]args) {
		//一つ目の識別番号のインスタンスを生成する
		DateId idNumber1 = new DateId();
		//二つ目の識別番号のインスタンスを生成する
		DateId idNumber2 = new DateId();
		//三つ目の識別番号のインスタンスを生成する
		DateId idNumber3 = new DateId();
		
		//一つ目の識別番号を表示する
		System.out.println("一つ目の識別番号：" +idNumber1.getId());
		//二つ目の識別番号を表示する
		System.out.println("二つ目の識別番号：" +idNumber2.getId());
		//三つ目の識別番号を表示する
		System.out.println("三つ目の識別番号：" +idNumber3.getId());
	}
}

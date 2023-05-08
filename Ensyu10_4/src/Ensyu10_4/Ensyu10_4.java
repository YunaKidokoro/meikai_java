package Ensyu10_4;
/*
 * クラス名:Ensyu10_4
 * 概　要:演習10-4
 * 作成日:2023/5/8
 * 作成者:yuna
 * */
public class Ensyu10_4 {
	/*
	 *関数名:main
	 *引　数:なし
	 *戻り値:なし
	 *作成者:yuna
	 *作成日:2023/5/8
	 * */
	public static void main(String[]args) {
		/* インスタンス生成時に日付を受け取らないと
		   プログラム実行時の日付になることを確認 */
		System.out.println("引数なしでインスタンス生成");
		//引数なしでインスタンスを生成
		Day inputDay1 = new Day();
		//引数なしでインスタンスを生成した場合は今日の日付で初期化される
		System.out.println("Day1() :" + inputDay1 + "\n");
		
		/* コンストラクタの引数が不正な場合に、
		 * 0以下の年は１に
		 * 0以下、または13以上の月は12に
		 * 0以下、またはその月の日数を越えた日付は月末に調整 */
		System.out.println("コンストラクタに不正な日付");
		//新しいインスタンスを生成する
		Day inputDay2 = new Day(0,13,32);
		//Day２の日付を表示
		System.out.println("Day2(   0,13,32):" + inputDay2);
		//新しいインスタンスを生成する
		Day inputDay3 = new Day(2000,2,29);
		//Day３の日付を表示
		System.out.println("Day3(2000, 2,29):" + inputDay3+ "\n");
		//経過日数を確認することを表示
		System.out.println("経過日数を確認する");
		//経過日数を表示する
		System.out.println("Day(2023,5,2) :" + Day.elapseDay(2023,5,2)+ "日\n");
		//残り日数を確認することを表示
		System.out.println("残り日数を確認する");
		//残り日数を表示する
		System.out.println("Day(2023,5,2) :" + Day.remainDay(2023,5,2)+ "日\n");
		//他の日付との前後関係を確認することを表示
		System.out.println("他の日付との前後関係を確認する");
		//他の日付との前後関係を表示
		Day.compareDay(2023,5,1,2023,6,1);
		//インスタンスの日付との前後関係を表示する
		System.out.println("\n他の日付との前後関係を表示する、\n"
				+ "インスタンスメソッドの確認をする");
		//インスタンスの日付との前後関係を表示
		inputDay3.compareDay(2023,5,1);
		//コンソール画面を見やすくするために改行
		System.out.println();
		
		//n日ずらす前の日付で新しいインスタンスを生成
		Day inputDay4 = new Day(2023,5,9);
		//インスタンスの日付の次の日を表示
		inputDay4.printAfterDay();
		//インスタンスの日付の5日後を表示する
		inputDay4.printAfterNDays(5365);
		//見やすくするために改行
		System.out.println();
		//インスタンスの日付の前の日を表示
		inputDay4.printBeforeDay();
		//インスタンスの日付の十日前を表示する
		inputDay4.printBeforeNDays(365);
	}
}

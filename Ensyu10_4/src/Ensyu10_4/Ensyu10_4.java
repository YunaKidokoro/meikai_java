package Ensyu10_4;

public class Ensyu10_4 {
	public static void main(String[]args) {
		/* インスタンス生成時に日付を受け取らないと
		   プログラム実行時の日付になることを確認 */
		System.out.println("引数なしでインスタンス生成");
		//
		Day inputDay = new Day();
		//
		System.out.println("Day() :" + inputDay + "\n");
		
		/* コンストラクタの引数が不正な場合に、
		 * 0以下の年は１に
		 * 0以下、または13以上の月は12に
		 * 0以下、またはその月の日数を越えた日付は月末に調整 */
		System.out.println("コンストラクタに不正な日付");
		//
		Day inputDay2 = new Day(0,13,32);
		//
		System.out.println("Day(   0,13,32):" + inputDay2);
		//
		Day inputDay3 = new Day(2000,2,29);
		//
		System.out.println("Day(2000, 2,29):" + inputDay3+ "\n");
		
		System.out.println("経過日数を確認する");
		//
		System.out.println("Day(2023,5,2) :" + Day.elapseDay(2023,5,2)+ "日\n");
		//
		System.out.println("残り日数を確認する");
		//
		System.out.println("Day(2023,5,2) :" + Day.remainDay(2023,5,2)+ "日\n");
	}
}

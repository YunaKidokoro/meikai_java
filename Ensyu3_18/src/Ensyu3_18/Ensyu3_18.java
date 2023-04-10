package Ensyu3_18;
//キーボードからの入力を行うためにScannerをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu3_18
 * 概要:演習3-18
 * 作成者:城所佑奈
 * 作成日:2023/04/07
 * */
public class Ensyu3_18 {
	/*
	 * 関数名:main
	 * 概要:入力された月の季節を表示する。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/07
	 * */
	public static void main(String[]args) {
		//入力ストリームを渡す。
		Scanner InputNumber = new Scanner (System.in);
		//月の入力を促す文の表示。
		System.out.print("月を入力してください：");
		//変数SeasonNumberに入力された値を読み込む。	
		int SeasonNumber = InputNumber.nextInt();
		//入力の値で場合わけをする。
		switch(SeasonNumber) {
		 //入力が１のときの季節を表示
		 case 1: System.out.println("冬"); break;
		 //入力が２のときの季節を表示
		 case 2: System.out.println("冬"); break;
		 //入力が３のときの季節を表示
		 case 3: System.out.println("春"); break;
		 //入力が4のときの季節を表示
		 case 4: System.out.println("春"); break;
		 //入力が5のときの季節を表示
		 case 5: System.out.println("春"); break;
		 //入力が6のときの季節を表示
		 case 6: System.out.println("梅雨"); break;
		 //入力が7のときの季節を表示
		 case 7: System.out.println("夏"); break;
		 //入力が8のときの季節を表示
		 case 8: System.out.println("夏"); break;
		 //入力が9のときの季節を表示
		 case 9: System.out.println("秋"); break;
		 //入力が10のときの季節を表示
		 case 10: System.out.println("秋"); break;
		 //入力が11のときの季節を表示
		 case 11: System.out.println("秋"); break;
		 //入力が12のときの季節を表示
		 case 12: System.out.println("冬"); break;
		 //入力された値が0以下、または13以上の時
		 default: System.out.println("入力内容を確認してください。"); break;
		}
	}
}

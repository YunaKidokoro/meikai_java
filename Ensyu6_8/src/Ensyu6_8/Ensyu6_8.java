package Ensyu6_8;

//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_8
 * 概要:演習6-8
 * 作成者:城所佑奈
 * 作成日:2323/04/14
 * */
public class Ensyu6_8 {
	/*
	 * 関数名:main
	 * 概要:配列要素の合計と平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/14
	 */
	public static void main(String[]args) {
		
		//sucannerクラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		
		//要素数を表す変数を宣言する
		int elementNumber = 0;
		//配列要素の合計を表す変数を宣言する
		double totalScore = 0;
		//カウント数
		int countNumber=0;
		
		//ループの開始
		do {
		//要素数の入力を促す文を表示する
			System.out.print("要素数：");
			//入力された値を読み込む
			elementNumber = inputNumber.nextInt();
		//入力された値が0以下の場合には繰り返す
		}while(elementNumber<=0);
		
		//配列を宣言する
		double [] variableArray = new double[ elementNumber ];
		
		//配列の先頭から末尾まで1個ずつ走査する
		for(double countIndex : variableArray) {
			//各配列要素の値の入力を促す文を表示
			System.out.print("a["+(countNumber)+"]=");
			//入力された値で配列の各要素を初期化する
			countIndex = inputNumber.nextDouble();
			//合計値の計算を行う
			totalScore +=countIndex;
			//カウント数を増やす
			countNumber+=1;
		}
		
		//平均値の計算を行う
		double averageScore = totalScore/elementNumber;
		
		//合計値を表示する
		System.out.println("合計値は"+totalScore+ "です。");
		//平均値を表示する
		System.out.println("平均値は"+averageScore+ "です。");
		
	}
}
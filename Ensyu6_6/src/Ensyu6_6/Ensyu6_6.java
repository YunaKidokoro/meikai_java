package Ensyu6_6;

//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_6
 * 概要:演習6-6
 * 作成者:城所佑奈
 * 作成日:2323/04/14
 * */
public class Ensyu6_6 {
	/*
	 * 関数名:main
	 * 概要:テストの点数の合計と平均と最大値と最小値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/14
	 */
	public static void main(String[]args) {
		//sucannerクラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		
		//要素数(テストを受けた人数)を表す変数を宣言する
		int testMember = 0;
		//テストの合計点を表す変数を宣言する
		int totalScore = 0;
		
		//ループの開始
		do {
		//テストを受けた人数の入力を促す文を表示する
			System.out.print("人数：");
			//入力された値を読み込む
			testMember = inputNumber.nextInt();
		//入力された値が0以下の場合には繰り返す
		}while(testMember<=0);
		
		//配列を宣言する
		int [] testArray = new int[ testMember ];
		//テストの点数の入力を促す文を表示する
		System.out.println(testMember+"人の点数を入力せよ");
		
		//インデックスが0から要素数までループ
		for(int countIndex=0; countIndex<testMember; countIndex++) {
			//各インデックス番目の点数の入力を促す文を表示
			System.out.print((countIndex+1)+"番の点数:");
			//入力された値で配列の各要素を初期化する
			testArray[countIndex] = inputNumber.nextInt();
			
			//入力された値が0より小さい場合
			if(testArray[countIndex] < 0) {
				//負の値は加算しないことを表示
				System.out.println("もう一度入力してください。");
				//もう一度入力させるためにインデックスをひとつ戻す
				countIndex--;
				//残りの部分の処理を飛ばしてループの最初に戻る
				continue;
			}
			//合計値の計算を行う
			totalScore +=testArray[countIndex];
		}
		//平均値の計算を行う
		float averageScore = (float)totalScore/testMember;
		
		//仮のテストの点数の最大値を表す変数を宣言する
		int maxScore = 0;
		//合計値を表示する
		System.out.println("合計値は"+totalScore+ "です。");
		//平均値を表示する
		System.out.println("平均値は"+averageScore+ "です。");
		//インデックスが0から要素数までループ
		for(int countIndex=0; countIndex<testMember; countIndex++) {
			//点数の配列の要素が仮の最大値よりも大きい場合
			if(testArray[countIndex] > maxScore) {
				//最大値を入れ替える
				maxScore = testArray[countIndex];
			}
		}
		
		//仮のテストの点数の最大値を表す変数を宣言する
		int minimumScore = maxScore;
		//インデックスが0から要素数までループ
		for(int countIndex=0; countIndex<testMember; countIndex++) {
			//点数の配列の要素が仮の最小値よりも小さい場合
			if(testArray[countIndex] < minimumScore) {
				//最小値を入れ替える
				minimumScore = testArray[countIndex];
			}
		}
		//最高点を表示する
		System.out.println("最高点は"+maxScore+ "です。");
		//最低点を表示する
		System.out.print("最低点は"+minimumScore+ "です。");
	}
}
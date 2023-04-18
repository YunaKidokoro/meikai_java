package Ensyu6_18;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu6_18
* 概要:演習6-18
* 作成者:城所佑奈
* 作成日:2023/04/18
* */
public class Ensyu6_18 {
	/*
	 * 関数名:main
	 * 概要:行数・列数・配列要素を入力させて二次元配列をつくる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/18
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する
		Scanner inputValue = new Scanner(System.in);
		
		//二次元配列をつくることを表示
		System.out.println("凸凹な二次元配列をつくります。");
		//行数を表す変数を宣言
		int lineNumber= 0 ;
		//列数を表す変数を宣言
		int rowNumber = 0;
		
		//ループの開始
		do {
			//行数の入力を促す文を表示
			System.out.print("行数：");
			//入力された値を読み込む
			lineNumber = inputValue.nextInt();
		//入力された値が0以下の場合繰り返す
		}while(lineNumber<=0);
		
		//各列数を格納するための配列を宣言
		int[] rowArray = new int[lineNumber] ;
		
		//入力された行数文ループする
		for(int lineIndex=0; lineIndex<lineNumber;lineIndex++) {
			//列数の入力を促す文を表示
			System.out.print(lineIndex+"行目の列数：");
			//入力された値を読み込む
			rowNumber = inputValue.nextInt();
			//入力された値が0以下の場合
			if(rowNumber<=0) {
				//同じ行の列数を入力できるようにデクリメント
				lineIndex--;
				//ループの先頭にもどる
				continue;
			}
			//各行に対する列数を要素に代入
			rowArray[lineIndex] = rowNumber;
		}
		//二次元配列を宣言
		int[][] someLongArray = new int[lineNumber][rowArray.length] ;
		
		//行のループ
		for(int lineIndex=0; lineIndex<lineNumber;lineIndex++) {
			//各行に列数を代入していく
			someLongArray[lineIndex] = new int[rowArray[lineIndex]];
			//列のループ			
			for(int rowIndex=0; rowIndex<rowArray[lineIndex]; rowIndex++) {
				//配列要素の入力を促す文を表示
				System.out.print("["+lineIndex+","+rowIndex+"]=");
				//入力された値を配列要素に代入
				someLongArray[lineIndex][rowIndex] = inputValue.nextInt();
			}
		}
		//出来上がった配列を表示する
		for(int lineIndex=0; lineIndex<lineNumber;lineIndex++) {
			//列のループ
			for(int rowIndex=0; rowIndex<rowArray[lineIndex]; rowIndex++) {
				//各配列要素を表示
				System.out.printf("%3d",someLongArray[lineIndex][rowIndex]);
			}			
			//改行を入れる
			System.out.println();
		}
	}
}

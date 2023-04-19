package Ensyu6_17;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:EnsyuSTUDENT_VALUE_17
* 概要:演習STUDENT_VALUE-17
* 作成者:城所佑奈
* 作成日:2023/04/18
* */
public class Ensyu6_17 {
	/*
	 * 関数名:main
	 * 概要:６人の２科目の点数を読み込んで
	 * 		科目ごとの平均と学生ごとの平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/18
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する
		Scanner inputValue = new Scanner(System.in);
		
		//学生の人数を表す変数を宣言
		final int STUDENT_VALUE  = 6;
		//２次元配列を宣言
		int subjectArray[][] = new int[2][STUDENT_VALUE];
		
		//行ループ
		for(int lineIndex = 0; lineIndex<2; lineIndex++) {
			//１行目の場合
			if(lineIndex==0) {
				//国語の点数の入力を促す文を表示
				System.out.println("国語の点数を入力してください。");
			}
			//２行目の場合
			else {
				//数学の点数の入力を促す文を表示
				System.out.println("数学の点数を入力してください。");
			}
			//２行６列の配列の先頭から末尾まで列ループする
			for(int rowIndex = 0; rowIndex<STUDENT_VALUE; rowIndex++) {
				//入力する配列のインデックスを表示
				System.out.print((rowIndex+1)+"人目：");
				//配列要素を入力して読み込む
				subjectArray[lineIndex][rowIndex] = inputValue.nextInt();
				//入力された値が負の場合
				if(subjectArray[lineIndex][rowIndex] <0) {
					//同じインデックスを繰り返せるようにする
					rowIndex--;
				}
			}
		}
		//国語のと数学の合計点表す変数を宣言
		int japaneseTotal = 0, mathTotal=0;
		//数学の合計点を表す変数を宣言
		float japaneseAverage=0 , mathAverage=0;
		//各教科ごとの合計点を求める
		for(int indexNumber=0 ; indexNumber<STUDENT_VALUE ; indexNumber++) {
			//国語の点数の合計を計算する
			japaneseTotal += subjectArray[0][indexNumber];
		}//各教科ごとの合計点を求める
		for(int indexNumber=0 ; indexNumber<STUDENT_VALUE ; indexNumber++) {
			//数学の点数の合計を計算する
			mathTotal += subjectArray[1][indexNumber];
		}
		//科目ごと、国語の平均は
		japaneseAverage = (float)japaneseTotal/STUDENT_VALUE ;
		//科目ごと、数学の平均は
		mathAverage = (float)mathTotal/STUDENT_VALUE ;	
		//国語の平均点を表示
		System.out.println("国語の平均点："+japaneseAverage);
		//数学の平均点を表示
		System.out.println("数学の平均点："+mathAverage);
		
		//学生ごとの合計点を求める
		for(int rowIndex=0 ; rowIndex<STUDENT_VALUE ; rowIndex++) {
			//学生ごとの合計点を表す変数を宣言
			int peopleTotal = 0;
			//学生ごとの平均を表す変数
			float peopleAverage = 0;
			//配列の先頭から末尾までループ
			for(int lineIndex=0 ; lineIndex<2 ; lineIndex++) {
				//２教科の合計点を求める
				peopleTotal += subjectArray[lineIndex][rowIndex];
				//２教科の平均点を計算する
				peopleAverage = (float)peopleTotal/2;
			}
			//人ごとの平均点の値を表示する
			System.out.println((rowIndex+1)+"人目の平均："+peopleAverage);
		}	
	}
}


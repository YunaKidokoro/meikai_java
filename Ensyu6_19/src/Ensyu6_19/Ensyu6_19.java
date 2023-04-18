package Ensyu6_19;
//キーボードからの入力を行うためにScannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu6_19
* 概要:演習6-19
* 作成者:城所佑奈
* 作成日:2023/04/18
* */
public class Ensyu6_19 {
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
		
		//クラス数を表す変数を宣言
		int classNumber= 0 ;
		//人数を表す変数を宣言
		int classMember = 0;
		
		//ループの開始
		do {
			//クラス数の入力を促す文を表示
			System.out.print("クラス数：");
			//入力された値を読み込む
			classNumber = inputValue.nextInt();
		//入力された値が0以下の場合繰り返す
		}while(classNumber<=0);
		
		//各クラスの人数を格納するための配列を宣言
		int[] memberArray = new int[classNumber] ;
		//全体の人数を表す変数
		int totalMember   = 0;
		
		//行がクラスを表し、列が各クラスの人の点数
		int[][] scoreArray = new int[classNumber][memberArray.length] ;
		
		//入力されたクラス数文ループする
		for(int lineIndex=0; lineIndex<classNumber;lineIndex++) {
			//クラスの人数入力を促す文を表示
			System.out.print((lineIndex+1)+"組の人数：");
			//入力された値を読み込む
			classMember = inputValue.nextInt();
				//入力された値が0以下の場合
				if(classMember<=0) {
					//同じ行の列数を入力できるようにデクリメント
					lineIndex--;
					//ループの先頭にもどる
					continue;
				}
			//各クラスの人数を配列要素に納めていく
			memberArray[lineIndex] = classMember;
			//全体の人数をかぞえる
			totalMember += classMember;
			//行の要素数を各クラスの人数にする
			scoreArray[lineIndex] = new int[memberArray[lineIndex]];
				//列のループ			
				for(int rowIndex=0; rowIndex<memberArray[lineIndex]; rowIndex++) {
					//各組の１番から順に点数の入力をさせる
					System.out.print((lineIndex+1)+"組"+(rowIndex+1)+"番の点数:");
					//入力された値を配列要素に代入
					scoreArray[lineIndex][rowIndex] = inputValue.nextInt();
					//入力された値が0以下の場合
					if(scoreArray[lineIndex][rowIndex]<=0) {
						//同じ行の列数を入力できるようにデクリメント
						rowIndex--;
						//ループの先頭にもどる
						continue;
					}
				}
		}
		//各クラスの合計点数と平均を格納するための配列を宣言
		float[][] classScore = new float[classNumber][2];
		//学年の合計点を表す変数を宣言
		int totalScore=0;
		
		//各クラスの合計点を計算
		for(int lineIndex=0; lineIndex<classNumber;lineIndex++) {
			//列のループ			
			for(int rowIndex=0; rowIndex<memberArray[lineIndex]; rowIndex++) {
				//各クラスの合計点をかぞえる
				classScore[lineIndex][0] += scoreArray[lineIndex][rowIndex];
				//全クラスの合計点をかぞえる
				totalScore +=scoreArray[lineIndex][rowIndex];
			}
			//各クラスの平均点を求める
			classScore[lineIndex][1] = classScore[lineIndex][0]/(scoreArray[lineIndex].length);
		}
		
		//表のラベルを表示
		System.out.println(" 組|   合計    平均");
		//表の罫線を表示
		System.out.println("-------------------");
		//全クラス文ループする
		for(int lineIndex=0; lineIndex<classNumber;lineIndex++) {
			//各クラスの合計と平均を順に表示する
			System.out.printf((lineIndex+1)+"組|%7.0f%7.1f\n", classScore[lineIndex][0],classScore[lineIndex][1]);
		}
		//学年の平均値
		float gradeAverage = (float)totalScore/totalMember;
		//表の罫線を表示
		System.out.println("--------------------");
		//全クラスでの合計点と平均点を表示
		System.out.printf(" 計|%7d%7.1f\n",totalScore,gradeAverage);
	}
}
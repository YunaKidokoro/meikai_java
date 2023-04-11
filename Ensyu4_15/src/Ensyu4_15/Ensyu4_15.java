package Ensyu4_15;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner;
/*
 * クラス名:Ensyu4_15
 * 概要:演習4-15
 * 作成者:城所佑奈
 * 作成日:2023/04/11
 * */
public class Ensyu4_15 {
	/*
	 * 関数:main
	 * 概要:身長と標準体重の対応表を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/11
	 * */
	public static void main(String[]args) {
		//Scannerクラスのインスタンスを初期化する。
		Scanner inputNumber = new Scanner(System.in);

		//入力された値を読み込む変数を宣言
		//左から順に身長の開始値、身長の終了値、増分を表す
		int inputLowLimit, inputHighLimit, increaseValue;
		//一つ目のループの回数を数える変数を用意する
		int countLoop1 = 0 ;
		//ループの開始
		do {
			//ループ回数が１以上の場合
			if(countLoop1 >= 1) {
				//再入力を促す文を表示する
				System.out.println("正の値を入力してください。");
			}
			//カウント数を増やす
			countLoop1++;
			//整数の入力を促す文を表示
			System.out.print("何cmから：");
			//入力された値を読み込む
			inputLowLimit = inputNumber.nextInt(); 
			
			//整数の入力を促す文を表示
			System.out.print("何cmまで：");
			//入力された値を読み込む
			inputHighLimit = inputNumber.nextInt(); 
			
			//整数の入力を促す文を表示
			System.out.print("何cmごと：");
			//入力された値を読み込む
			increaseValue = inputNumber.nextInt(); 
			
		//入力された値が負の場合は繰り返し入力を求める。
		}while(inputLowLimit<0 || inputHighLimit<0 || increaseValue<0);

		//身長の開始値と終了値が逆に入力された場合
		if(inputLowLimit > inputHighLimit) {
			//2つの値を入れ替えるための仮置き用の変数を用意
			int onlyNowValue;
			onlyNowValue   = inputLowLimit;
			inputLowLimit  = inputHighLimit;
			inputHighLimit = onlyNowValue;
		}
		//入力に問題がない場合には何もしない
		else;
		
		//対応表のラベルを表示する
		System.out.println("身長		標準体重");
		
		
		//表の行数
		int lineValue = 1 + (inputHighLimit - inputLowLimit)/increaseValue;
		//身長と体重を表す変数を宣言
		double hightValue, bodyWeight;
		
		//カウント数を0から１ずつ増加させて、カウント数が表の行数を超えるまでループ
		for(int countNumber=0 ; countNumber<lineValue ; countNumber++) {
			//身長の値を計算する
			hightValue = inputLowLimit + increaseValue*countNumber;
			//次の身長の値に対応する体重を計算する
			bodyWeight    = (hightValue - 100)*0.9;
			//身長に対する標準体重を表示する
			System.out.println(hightValue + "		" +bodyWeight);
		}	
	}
}
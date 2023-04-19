package Ensyu7_10;
//ランダムクラスのインスタンスを初期化する
import java.util.Random;
//Scannerクラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_10
* 概要:演習7-10
* 作成者:城所佑奈
* 作成日:2023/04/19
* */
public class Ensyu7_10 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	//ランダムクラスのインスタンスを初期化する
	static Random randomNumber = new Random();
	//正解の計算結果を表す変数を宣言
	static int answerValue = 0;
	//式の形を記憶させるための変数を宣言
	static String ramdomFormula = "a";
	/*
	 * メソッド名:confirmRetry
	 * 概要:もう一度トレーニングするか確認する
	 * 引数:なし
	 * 戻り値:int型・cont・trueかfalseを表す
	 * トレーニングを続けるならtrueを,そうでなければfalseを返す
	 * 作成日:2023/04/19
	 * */
	static boolean confirmRetry() {
		//trueかfalseを表す変数を宣言
		int cont = 0;
		//ループの開始
		do {
			//正の整数値の入力を促す文を表示
			System.out.print("もう一度:＜yes...1/No...0>:");
			//入力を変数に読み込む
			cont = inputNumber.nextInt();
		//0か１が入力されるまで繰り返す
		}while(cont!=0 && cont!=1);
		//変数に入力されたのが１なら値を返す
		return cont == 1;
	}
	/*
	 * メソッド名:randomQuestion
	 * 概要:4つの式の形からランダムに１つ選び問題を表示する
	 * 引数:int型・a,b,c・ランダムに生成された整数
	 * 戻り値:なし
	 * 作成日:2023/04/19
	 * */
	static void randomQuestion(int a, int b, int c) {
		//問題を選ぶ乱数を生成する
		int questionNumber = randomNumber.nextInt(4);
		//乱数が0の場合
		if(questionNumber == 0) {
			//足し算だけの式を表示
			System.out.print(a+"+"+b+"+"+c+"=");
			//計算結果を代入
			ramdomFormula = a+"+"+b+"+"+c+"=";
			//式の形を代入する
			answerValue = a+b+c;
		}
		//乱数が１の場合
		else if(questionNumber == 1) {
			//足し算して引き算する式を表示
			System.out.print(a+"+"+b+"-"+c+"=");
			//計算結果を代入
			ramdomFormula = a+"+"+b+"-"+c+"=";
			//式の形を代入する
			answerValue = a+b-c;
		}
		//乱数が１の場合
		else if(questionNumber == 2) {
			//引き算して足し算する式を表示
			System.out.print(a+"-"+b+"+"+c+"=");
			//計算結果を代入
			ramdomFormula =a+"-"+b+"+"+c+"=";
			//式の形を代入する
			answerValue = a-b+c;
		}
		//乱数が１の場合
		else if(questionNumber == 3) {
			//引き算だけの式を表示
			System.out.print(a+"-"+b+"-"+c+"=");
			//計算結果を代入
			ramdomFormula =a+"-"+b+"-"+c+"=";
			//式の形を代入する
			answerValue = a-b-c;
		}
	}
	/*
	 * 関数名:main
	 * 概要:正の整数値の入力を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/19
	 * */
	public static void main(String[]args) {
		//入力された計算結果を表す変数
		int inputAnswer =0;
		//暗算力トレーニングの開始を表示
		System.out.println("暗算力トレーニング！！");
		//ループの開始
		do {
			//3桁の数を生成
			int x = randomNumber.nextInt(900) + 100;
			//3桁の数を生成
			int y = randomNumber.nextInt(900) + 100;
			//3桁の数を生成
			int z = randomNumber.nextInt(900) + 100;
			
			//ランダムに問題を出題（表示）
			randomQuestion(x,y,z);
			//問題の解答が終わるまで繰り返す
			while(true){
				//問題の解答を入力させる
				inputAnswer = inputNumber.nextInt();
				//入力された答えがあっている場合
				if(answerValue == inputAnswer) {
					//ループから抜ける
					break;
				}
				//答えが間違っていることを表示する
				System.out.println("違いますよ！");
				//もう一度問題を表示する
				System.out.print(ramdomFormula);
			}
		//答えがtrue(1)なら繰り返す
		}while(confirmRetry());
	}
}
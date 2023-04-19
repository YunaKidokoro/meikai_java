package Ensyu7_3;

import java.util.Scanner;

/*
* クラス名:Ensyu7_3
* 概要:演習7-3
* 作成者:城所佑奈
* 作成日:2023/02/19
* */
public class Ensyu7_3 {
	//3つのint型の引数の中央値を求めるメソッド
	//メソッド名・引数名は教本の指示に従った命名
	static int med(int a, int b, int c) {
		//最小値を表す変数を前言（仮にaが最小とする）
		int minimumValue = a;
		//仮の最小値がbより大きい場合、最小値をbに変える
		if (minimumValue>b) {minimumValue = b;}
		//仮の最小値がcより大きい場合、//最小値をcに変える
		if (minimumValue>c) {minimumValue = c;}
		
	
		//最大値を表す変数を前言（仮にaが最小とする）
		int maximumValue = a;
		//仮の最大値よりbが大きい場合、最大値をbに変える
		if (maximumValue<b) {maximumValue = b;}
		//仮の最大値よりcが大きい場合、最大値をcに変える
		if (maximumValue<c) {maximumValue = c;}
	
		//戻り値を表す変数を宣言
		int returnNumber = a;
		
		//aが最大値での最小値でもないなら中央値はa
		if(a!=maximumValue && a!=minimumValue) {returnNumber = a;}
		//bが最大値での最小値でもないなら中央値はb
		if(b!=maximumValue && b!=minimumValue) {returnNumber = b;}
		//cが最大値での最小値でもないなら中央値はc
		if(c!=maximumValue && c!=minimumValue) {returnNumber = c;}
		//中央値を返す
		return returnNumber;
	}
	public static void main(String[]args) {
		//Scanerクラスのインスタンスを初期化する
		Scanner inputInteger = new Scanner(System.in);
		//３つの整数の中央値を表示することを表示
		System.out.println("３つの整数の中央値を表示します");
		//整数の入力を促す文を表示
		System.out.print("整数１:");
		//入力された値を読み込む
		int inputIntegerA = inputInteger.nextInt();
		//整数の入力を促す文を表示
		System.out.print("整数２:");
		//入力された値を読み込む
		int inputIntegerB = inputInteger.nextInt();
		//整数の入力を促す文を表示
		System.out.print("整数３:");
		//入力された値を読み込む
		int inputIntegerC = inputInteger.nextInt();
		//中央値を表示する
		System.out.println("中央値："+med(inputIntegerA,inputIntegerB,inputIntegerC));
	}
}

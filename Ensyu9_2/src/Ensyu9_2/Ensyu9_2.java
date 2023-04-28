package Ensyu9_2;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu9_2
 * 概要:演習9-2
 * 作成者:城所佑奈
 * 作成日:2023年4月27日
 * */
public class Ensyu9_2 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner (System.in);
	
	/*
	 * 関数名：inputWhatDay
	 * 概要：日にちを入力させる、不適当な場合は繰り返す
	 * 引数：int型・inputYear, inputMonth・年と月
	 * 戻り値：int型・whatDay・入力された日にち
	 * 作成日：2023.04.28
	 * */
	public static int inputWhatDay(int inputYear, int inputMonth) {
		//入力された日付を表す変数
		int whatDay = 1;
		
		//31日まである月の場合
		if(inputMonth==1 || inputMonth==3 || inputMonth==5 || inputMonth==7 ||
			inputMonth==8 || inputMonth==10 || inputMonth==12) {
			do {
				//入力された値を読み込む
				whatDay = inputNumber.nextInt();
				//0以下と32以上が入力させた場合
				if(whatDay>31 || whatDay<1) {
					//再入力を求める
					System.out.print("もう一度入力して下さい：");
				}
			//0以下と32以上が入力させると繰り返す
			}while(whatDay>31 || whatDay<1);
		}
		//30日までの月の場合
		else if(inputMonth != 2) {
			do {
				//入力された値を読み込む
				whatDay = inputNumber.nextInt();
				//31以上か0以下が入力された場合
				if(whatDay>30 || whatDay<1) {
					//再入力を求める
					System.out.print("もう一度入力して下さい：");				
				}
			//31以上か0以下が入力されると繰り返す
			}while(whatDay>30 || whatDay<1);
		}
		//2月の場合
		else {
			//うるう年の場合
			if(inputYear%4==0 &&(inputYear%100!=0 || inputYear%400==0)) {
				do {
					//入力された値を読み込む
					whatDay = inputNumber.nextInt();
					//0以下と30以上が入力させた場合
					if(whatDay>29 || whatDay<1) {
						//再入力を求める
						System.out.print("もう一度入力して下さい：");
					}
				//0以下と30以上が入力させると繰り返す
				}while(whatDay>29 || whatDay<1);
			}
			//うるう年じゃない
			else {
				do {
					//入力された値を読み込む
					whatDay = inputNumber.nextInt();
					//0以下と29以上が入力された場合
					if(whatDay>28 || whatDay<1) {
						//再入力を求める
						System.out.print("もう一度入力して下さい：");
					}
				//0以下と29以上が入力させると繰り返す
				}while(whatDay>28 || whatDay<1);
			}
		}
		//入力された日付を返す
		return whatDay;
	}
	
	/*
	 * 関数名:main
	 * 概要:コンストラクタの働きを確認する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023年4月27日
	 * */
	public static void main(String[]args) {
		
		
		//aのコンストラクタの働きを確認
		//今年は何年かを入力させる
		System.out.print("今は何年ですか：");
		//入力された年を読み込む
		int whatYear = inputNumber.nextInt();
		
		//何月かを入力させる
		System.out.print("今は何月ですか：");
		//入力された月を読み込む
		int whatMonth = inputNumber.nextInt();
		
		//何日かを入力させる
		System.out.print("今日は何日ですか：");
		//入力された日付を読み込む
		int whatDay = inputWhatDay(whatYear, whatMonth);
		
		//Day型のインスタンスinputTosayを構築
		Day inputToday = new Day(whatYear, whatMonth, whatDay);
		
		//入力された年月日を表示
		System.out.println("today=" + inputToday + "\n");
		//同じ日付の変数を用意したことの表示
		System.out.println("todayと同じ日付(参照)のDay2を用意");
		//新しいインスタンスを別のインスタンスで初期化する
		Day copyDay2  = new Day(inputToday);
		//新しいインスタンスを表示する
		System.out.println("Day2=" + copyDay2);
		//２つの日付が等しいか調べる
		if(copyDay2.equalTo(inputToday)) {
			//等しい場合の表示
			System.out.println("Day1とDay2は同じ日付です。\n");
		}
		//等しくない場合には異なることを表示
		else {System.out.println("Day1とDay2は異なる日付です。\n");}
		
		//引数を渡さないでインスタンス化
		Day outputDay1 = new Day();
		//インスタンスを表示（引数を渡していないので初期化子の値が出力される）
		System.out.println("day1 = " + outputDay1);

		//何年だけ渡してインスタンス化
		Day outputDay2 = new Day(whatYear);
		//インスタンスを表示
		System.out.println("day2 = " + outputDay2);
		
		//何年何月を渡してインスタンス化
		Day outputDay3 = new Day(whatYear, whatMonth);
		//インスタンスを表示
		System.out.println("day3 = " + outputDay3);
		
		//何年何月何日を渡してインスタンス化
		Day outputDay4 = new Day (whatYear, whatMonth, whatDay);		
		//インスタンスを表示
		System.out.println("day4= " + outputDay4);
		
		//インスタンスを渡してインスタンス化する
		Day outputDay5 = new Day (outputDay4);
		//インスタンスを表示する
		System.out.println("day5= " + outputDay5);
		
	}
}
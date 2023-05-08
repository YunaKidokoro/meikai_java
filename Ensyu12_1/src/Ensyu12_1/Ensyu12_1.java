package Ensyu12_1;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu12_1
 * 概　要:演習12-1
 * 作成日:2023/5/8
 * 作成者:yuna
 * */
public class Ensyu12_1 {
	
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	/*
	 * 関数名:main
	 * 概要:総走行距離を加えたcarクラスの派生クラスの確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:yuna
	 * 作成日:2023/5/8
	 * */
	public static void main(String[]args) {
		
		//タンク容量の入力を促す
		System.out.print("燃料タンクの容量[L]は：");
		//入力された値を読み込む
		double tankCapacity = InputClass.readPlusNumber();
		//ガソリン残量を表す変数
		double leftFuel = 0;
		//ループの開始
		do {
			//現在のガソリン残量の入力を促す
			System.out.print("残りのガソリン量[L]は：");
			//入力された値を読み込む
			leftFuel = InputClass.readPlusNumber();
			//ガソリン残量がタンク容量を越えた場合
			if(leftFuel>tankCapacity) {
				//再入力を求める
				System.out.println("もう一度入力して下さい");
			}
			//ガソリン残量がタンク容量を越えた場合は繰り返す
		}while(leftFuel>tankCapacity);
		
		//燃費の入力を促す
		System.out.print("燃費[km/L]は:");
		//入力された値を読み込む
		double gasMileage = InputClass.readPlusNumber();
		
		//読み込んだ値を元にInheritCar型のインスタンスmyCarを構築する
		InheritCar myCar = new InheritCar("hustler", 1700, 3400, 
				leftFuel, gasMileage, "6800",tankCapacity, 1500,0);
		
		
		//無限ループ
		while(true) {
			//走行するかを尋ねる文を表示する
			System.out.print("走行しますか？(Yes...1/No...その他):");
			//1以外が入力されて、noが選択された場合
			if(inputNumber.nextInt() != 1) {
				//ループから抜ける
				break;
			}
			//走行したい距離を尋ねる文を表示する
			System.out.println("何km走行しますか？");
			//x方向の走行距離を入力を促す文を表示
			System.out.print("x方向:"); 
			//入力された値を読み込む
			double distanceX = inputNumber.nextDouble();
			//y方向の走行距離を入力を促す文を表示
			System.out.print("y方向:"); 
			//入力された値を読み込む
			double distanceY = inputNumber.nextDouble();
			//総走行距離、または燃料が足りないことのどちらかを表示する
			System.out.printf("総走行距離:%.3f km\n" ,myCar.getTotalDistance(distanceX,distanceY) );
		}
	}
}

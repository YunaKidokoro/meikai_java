package Ensyu8_2;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:Ensyu8_2
 * 概要:演習8-2(CarClassのテストクラス)
 * 作成日:2023/04/26
 * 作成者:城所佑奈
 * */
public class Ensyu8_2 {
	
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	/*
	 * 関数名:readPlusInt
	 * 概要：整数を入力させて、0以下の場合は繰り返し入力を求める
	 * 引数:なし
	 * 戻り値:int型・plusInteger・入力された値を表す変数
	 * 作成日:2023/04/20
	 * */
	static int readPlusInt() {
		//正の整数を表す変数を宣言
		int plusInteger = 0;
		do {
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
			//入力された値が0以下の場合
			if(plusInteger<=0) {
				//再入力を求める文を表示
				System.out.print("もう一度入力して下さい：");
			}
			//入力が0以下の場合は繰り返す
		}while(plusInteger <=0);
		//入力された値を返す
		return plusInteger;
	}
	
	/*
	 * 関数名:readPlusNumber
	 * 概要：実数を入力させて、0以下の場合は繰り返し入力を求める
	 * 引数:なし
	 * 戻り値:double型・plusNumber・入力された値を表す変数
	 * 作成日:2023/04/20
	 * */
	static double readPlusNumber() {
		//正の整数を表す変数を宣言
		double plusNumber = 0;
		do {
			//入力された値を読み込む
			plusNumber = inputNumber.nextDouble();
			//入力された値が0以下の場合
			if(plusNumber<=0) {
				//再入力を求める文を表示
				System.out.print("もう一度入力して下さい：");
			}
			//入力が0以下の場合は繰り返す
		}while(plusNumber <=0);
		//入力された値を返す
		return plusNumber;
	}
	
	/*
	 * 関数名:main
	 * 概要:対話的に自動車を移動させる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/26
	 * */
	public static void main(String[]args) {
		
		System.out.println("車のデータを入力せよ。");
		//名前の入力を促す
		System.out.print("名前は；");
		//入力された値を読み込む
		String carName =inputNumber.next();
		
		//車幅の入力を促す
		System.out.print("車幅は；");
		//入力された値を読み込む
		int carWidth = readPlusInt();
		
		//車高の入力を促す
		System.out.print("車高は；");
		//入力された値を読み込む
		int carHeight  = readPlusInt();
		
		//車長の入力を促す
		System.out.print("車長は；");
		//入力された値を読み込む
		int carLength = readPlusInt();
		
		//ナンバーの入力を促す
		System.out.print("ナンバーは；");
		//入力された値を読み込む
		String carNumber = inputNumber.next();
		
		//タンク容量の入力を促す
		System.out.print("燃料タンクの容量[L]は：");
		//入力された値を読み込む
		double tankCapacity = readPlusNumber();
		
		//現在のガソリン残量の入力を促す
		System.out.print("残りのガソリン量[L]は：");
		//入力された値を読み込む
		double leftFuel = readPlusNumber();
		
		//燃費の入力を促す
		System.out.print("燃費[km/L]は；");
		//入力された値を読み込む
		double gasMileage = readPlusNumber();
		
		//読み込んだ値を元にCar型のインスタンスmyCarを構築する
		CarClass myCar = new CarClass(carName, carHeight, carLength, 
				leftFuel, gasMileage, carNumber,tankCapacity, carWidth);
		
		//無限ループ
		while(true) {
			//現在地と残りの燃料を表示
			System.out.print("現在地("+myCar.getX()+","+myCar.getY()+")");
			System.out.printf("・残りの燃料 %.2f L\n", myCar.getFuel());
			
			//移動するかを尋ねる
			System.out.print("移動しますか？[1...Yes/その他...No]:");
			//1以外の値が入力されたら終了する
			if(inputNumber.nextInt() != 1) {break;}
			//コンソール画面を見やすくしたいので改行
			System.out.println();
			//X方向の移動距離の入力を促す
			System.out.print("X方向の移動距離[km]：");
			//入力された値を読み込む
			double distanceX =  inputNumber.nextInt();
			//Y方向の移動距離の入力を促す
			System.out.print("Y方向の移動距離[km]：");
			//入力された値を読み込む
			double distanceY =  inputNumber.nextInt();
			
			//移動可能距離を越えて移動しようとした場合
			if(!myCar.howcanMove(distanceX, distanceY)) {
				//燃料不足を表示
				System.out.println("燃料が足りません！");
				//どれだけ給油してほしいかを表示する
				System.out.printf("%.2f L給油して下さい。", myCar.fuelIn());
				//ループを終える
				break;
			}
		}
	}
}
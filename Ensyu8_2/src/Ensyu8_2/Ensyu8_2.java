package Ensyu8_2;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
 * クラス名:CarClass
 * 概要:自動車クラス、自動車に関するデータを扱う
 * 作成日:2023/04/26
 * 作成者:城所佑奈
 * */
class CarClass{
	
	//名前をインスタンス化
	private String carName;
	//車幅をインスタンス化
	private int carWidth;
	//車高をインスタンス化
	private int heightValue;
	//長さをインスタンス化
	private int carLength;
	//現在位置Xの座標インスタンス化
	private double locationX;
	//現在位置Yの座標インスタンス化
	private double locationY;
	//残りの燃料インスタンス化
	private double carFuel;
	//タンク容量をインスタンス化
	private double tankCapacity;
	//車のナンバーをインスタンス化
	private String carNumber;
	//燃費をインスタンス化
	private double gasMileage;//15km/L
	
	
	//コンストラクタ
	CarClass(String carName,	int heightValue,	int carLength, 
			double carFuel, 	double gasMileage,	String carNumber,
			double tankCapacity,int carWidth){
		
		//名前を表すフィールドを初期化
		this.carName	= carName;
		//車幅を表すフィールドを初期化
		this.carWidth 	= carWidth;
		//車高を表すフィールドを初期化
		this.heightValue= heightValue;
		//長さを表すフィールドを初期化
		this.carLength  = carLength;
		//残りの燃料を表すフィールドを初期化
		this.carFuel	= carFuel;
		//燃費を表すフィールドを初期化
		this.gasMileage	= gasMileage;
		//車のナンバーを表すフィールドを初期化
		this.carNumber	= carNumber;
		//タンク容量を表すフィールドを初期化
		this.tankCapacity = tankCapacity;
		//現在位置Xの座標を表すフィールドを初期化
		locationX = 0;
		//現在位置Yの座標を表すフィールドを初期化
		locationY = 0;
	}
	
	/*
	 * 関数名:getX()
	 * 概要:現在位置Xの座標を取得
	 * 引数:なし
	 * 戻り値:double型・locationX・現在位置X
	 * 作成日:2023/04/27
	 * */
	double getX() {
		//現在位置Xの座標を返す
		return locationX;
	}
	
	/*
	 * 関数名:getY()
	 * 概要:現在位置Yの座標を取得
	 * 引数:なし
	 * 戻り値:double型・locationY・現在位置Y
	 * 作成日:2023/04/27
	 * */
	double getY() {
		//現在位置Yの座標を返す
		return locationY;
	}
	/*
	 * 関数名:getFuel()
	 * 概要:残り燃料を取得
	 * 引数:なし
	 * 戻り値:double型・carFuel・残りの燃料
	 * 作成日:2023/04/27
	 * */
	double getFuel() {
		//残り燃料を返す
		return carFuel;
	}

	/*
	 * 関数名:getFuel()
	 * 概要:残り燃料を取得
	 * 引数:なし
	 * 戻り値:double型・carFuel・残りの燃料
	 * 作成日:2023/04/27
	 * */
	double Fuel() {
		//残り燃料を返す
		return carFuel;
	}
	
	/*
	 * 関数名:FuelIn()
	 * 概要:給油量を取得
	 * 引数:なし
	 * 戻り値:double型・refuelValue・給油量
	 * 作成日:2023/04/27
	 * */
	double fuelIn() {
		//タンク容量から残っている燃料分ひく
		double refuelValue = tankCapacity - carFuel;
		//給油量を返す
		return refuelValue;
	}

	/*
	 * 関数名:putSpec
	 * 　概要:車種・車幅・車高・車長・車のナンバーを表示する
	 * 　引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/26
	 * */
	void putSpec() {
		//名前を表示する
		System.out.println("名前："+carName);
		//車幅を表示する
		System.out.println("車幅："+carWidth);
		//車高を表示する
		System.out.println("車高："+heightValue);
		//車長を表示する
		System.out.println("車長："+carLength);
		//車のナンバーを表示する
		System.out.println("ナンバー："+carNumber);
	}
	
	/*
	 * 関数名:howCanMove
	 * 　概要:どれだけ移動できるか
	 * 　引数:double型・dx・x方向の移動距離
	 *		　double型・dy・y方向の移動距離
	 *		　double型・gasMileage・燃費
	 * 戻り値:任意の距離が移動可能であればtrue、不可であればfalseを返す
	 * 作成日:2023/04/27
	 * */
	boolean howcanMove(double dx, double dy) {
		//任意の距離が移動可能かどうか
		boolean canMove = true;
		//移動距離
		double dist = Math.sqrt(dx*dx + dy*dy);
		//必要になる燃料
		double needFuel = dist/gasMileage;
		
		//消費燃料が残りの燃料より少ない場合
		if(needFuel < carFuel) {
			//移動距離の分だけ燃料が減る
			carFuel -= needFuel;
			//移動した分の座標変化を反映される
			locationX += dx;
			//移動した分の座標変化を反映される
			locationY += dy;
		}
		//燃料が足り場合は移動できないとする
		else {canMove = false;}
		//移動可能かどうかの判定結果を返す
		return canMove;
	}
	
}//これはCarClassnの閉じ括弧

/*
 * クラス名:Ensyu8_2
 * 概要:演習8-2(CarClassのテスト)
 * 作成日:2023/04/26
 * 作成者:城所佑奈
 * */
public class Ensyu8_2 {
	
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	/*
	 * 関数名:readPlusInt
	 * 概要:三角形の段数として正の整数値の入力を求め、その値を返す
	 * 引数:なし
	 * 戻り値:int型・plusInteger・入力された値(段数)を表す変数
	 * 作成日:2023/04/20
	 * */
	static int readPlusInt() {
		//正の整数を表す変数を宣言
		int plusInteger = 0;
		do {
			//入力された値を読み込む
			plusInteger = inputNumber.nextInt();
			//入力が0以下の場合は繰り返す
		}while(plusInteger <=0);
		//入力された値を返す
		return plusInteger;
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
		int carheight  = readPlusInt();
		
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
		double tankCapacity = readPlusInt();
		
		//現在のガソリン残量の入力を促す
		System.out.print("残りのガソリン量[L]は：");
		//入力された値を読み込む
		double leftFuel = readPlusInt();
		
		//燃費の入力を促す
		System.out.print("燃費[km/L]は；");
		//入力された値を読み込む
		double gasMileage = readPlusInt();
		
		//読み込んだ値を元にCar型のインスタンスmyCarを構築する
		CarClass myCar = new CarClass(carName, carheight, carLength, 
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
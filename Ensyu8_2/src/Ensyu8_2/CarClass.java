package Ensyu8_2;
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
	 * 概要:残りの燃料を取得
	 * 引数:なし
	 * 戻り値:double型・carFuel・残りの燃料
	 * 作成日:2023/04/27
	 * */
	double getFuel() {
		//残り燃料を返す
		return carFuel;
	}
	
	/*
	 * 関数名:FuelIn()
	 * 概要:満タンにするのに必要な給油量を取得
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
	 * 　引数:double型・dx・x方向の移動距離[m]
	 *		　double型・dy・y方向の移動距離[m]
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
}
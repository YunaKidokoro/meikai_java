package Ensyu12_1;

/*
 * クラス名:InheritCar
 * 概　要:Carクラスから派生させたクラス、総走行距離を調べる
 * 作成日:2023/5/8
 * 作成者:yuna
 * */
public class InheritCar extends Car{
	//総走行距離を表すフィールド
	double totalDistance;
	
	//コンストラクタ
	InheritCar(String carName,	int heightValue,	int carLength, 
			double carFuel, 	double gasMileage,	String carNumber,
			double tankCapacity,int carWidth, double totalDistance){
		//スーパークラスのフィールドを初期化
		super(carName,heightValue,carLength, carFuel,gasMileage,
				carNumber,tankCapacity,carWidth);
		//総走行距離を表すフィールドを初期化する
		this.totalDistance = totalDistance;
	}
	/*
	 * 関数名:getTotalDistance
	 * 概要:総走行距離を取得する
	 * 引数:なし
	 * 戻り値:総走行距離の値を返す
	 * 作成日:2023/5/8
	 * */
	public double getTotalDistance() {
		//総走行距離の値を返す
		return totalDistance;
	}
	
	/*
	 * 関数名:getTotalDistance
	 * 概要:総走行距離を求める
	 * 引数:
	 * 戻り値:総走行距離の値を返す,sumDistance
	 * 作成日:2023/5/8
	 * */
	public double getTotalDistance(double dx,double dy) {
		
		//任意の距離を動ける場合
		if(super.howcanMove(dx,dy)) {
			//移動距離を求める
			double distance = Math.sqrt(dx * dx + dy * dy);
			//移動距離を総走行距離に加える
			totalDistance += distance;
		}
		//移動できない場合
		else{
			//燃料が不足していることを表示する
			System.out.println("燃料が足りません！");
		}
		//総走行距離の値を返す
		return totalDistance;
	}
}



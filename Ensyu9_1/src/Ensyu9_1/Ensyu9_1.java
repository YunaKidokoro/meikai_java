package Ensyu9_1;

/*
 * クラス名:Ensyu9_1
 * 概要:演習9-1
 * 作成日:2023/04/26
 * 作成者:城所佑奈
 * */
public class Ensyu9_1 {
	/*
	 * 関数名:main
	 * 概要:HumanClassの配列を生成する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/26
	 * */
	public static void main(String[]args) {
		//配列の生成時に要素を初期化する場合であることを表示
		System.out.println("配列の生成時に要素を初期化");
		//クラス型の配列を生成
		HumanClass []humanArray = {
			//配列要素をインスタンスへの参照で初期化する
			new HumanClass("yuna",160,50,0),
			//配列要素をインスタンスへの参照で初期化する
			new HumanClass("mama",150,45,0),
			//配列要素をインスタンスへの参照で初期化する
			new HumanClass("papa",170,60,0),
		};
		
		//配列の要素数ぶんループ
		for(int i=0; i<humanArray.length; i++) {
			//配列のインデックスを表示
			System.out.println( "x["+i+"]= " 
			//名前を取得して表示
			+ humanArray[i].getName() +", "
			//身長を取得して表示
			+ humanArray[i].getHeight() + " cm, "
			//体重を取得して表示
			+ humanArray[i].getWeight() + " kg, BMI="
			//BMIを取得して表示
			+ humanArray[i].getBMI() );
		}
		//見やすくしたいので改行
		System.out.println();
		
		//配列の生成後に各要素にインスタンスの参照を代入する
		System.out.println("配列の生成後に各要素にインスタンスの参照を代入");
		//配列を生成する
		HumanClass []arrayAfter ;
		
		//配列の各要素にインスタンスの参照を代入していく
		arrayAfter = new HumanClass[] {
			//インデックス0の配列要素に代入
			new HumanClass("yuna",160,50,0),
			//インデックス1の配列要素に代入
			new HumanClass("mama",150,45,0),
			//インデックス2の配列要素に代入
			new HumanClass("papa",170,60,0),};
		
		//配列の要素数ぶんループ
		for(int i=0; i<humanArray.length; i++) {
			//配列のインデックスを表示
			System.out.println( "y["+i+"]= " 
			//名前を取得して表示
			+ arrayAfter[i].getName() +", "
			//身長を取得して表示
			+ arrayAfter[i].getHeight() + " cm, "
			//体重を取得して表示
			+ arrayAfter[i].getWeight() + " kg, BMI="
			//BMIを取得して表示
			+ arrayAfter[i].getBMI() );
		}
	}
}
	
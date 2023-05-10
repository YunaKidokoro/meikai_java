package Ensyu14_1;
//スキャナークラスをインポートする
import java.util.Scanner;
/**
 * クラス名:Ensyu14_1
 * 概要:演習14-1
 * 作成日:2023/5/10
 * 作成者:yuna
 */
public class Ensyu14_1 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);
	/*
	 * 関数名:inputPlusNumber
	 * 概　要:正の値を入力させる
	 * 引　数:何についての入力なのかを表す文字列
	 * 戻り値:入力された値
	 * 作成日:2023/5/9
	 * */
	public static int inputPlusNumber(String message) {
		//入力された値を読み込む変数
		int inputInteger = 0;
		//ループの開始
		do {
			//何について入力させたいのかを表示する
			System.out.print(message);
			//入力された値を読み込む
			inputInteger = inputNumber.nextInt();
			//入力値が0以下の場合
			if(inputInteger<=0) {
				//再入力を求める文を表示する
				System.out.println("もう一度入力して下さい。");
			}
		//入力値が0以下の場合は繰り返す
		}while(inputInteger<=0);
		//入力値を返却する
		return inputInteger;
	}
	
	/**
	 * 関数名:main
	 * 概要:実装したインタフェースのメソッドを確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/10
	 * 作成者:yuna
	 */
	public static void main(String[]args) {
		//平行四辺形の描画を行うことを表示
		System.out.println("平行四辺形の描画をします。");
		//平行四辺形の底辺の幅を取得
		int parallelWidth = inputPlusNumber("底辺の幅：");
		//平行四辺形の高さを取得
		int parallelHeight = inputPlusNumber("高さ：");
		//平行四辺形クラスのインスタンスを生成する
		Parallelogram palallelInstance = new Parallelogram(parallelWidth,parallelHeight);
		//平行四辺形を表示
		palallelInstance.print();
		
		//改行する
		System.out.println();
		
		//長方形の描画を行うことを表示
		System.out.println("長方形の描画をします。");
		//長方形の底辺の幅を取得
		int RectangleWidth = inputPlusNumber("底辺の幅：");
		//長方形の高さを取得
		int RectangleHeight = inputPlusNumber("高さ：");
		//長方形クラスのインスタンスを生成する
		Rectangle RectangleInstance = new Rectangle(RectangleWidth,RectangleHeight);
		//長方形を表示
		RectangleInstance.print();
	}
}

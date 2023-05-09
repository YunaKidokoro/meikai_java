package Ensyu13_1;
//
import java.util.Scanner;
/*
 * クラス名:Ensyu13_1
 * 概　要:演習13-1
 * 作成日:2023/5/9
 * 作成者:yuna
 * */
public class Ensyu13_1 {
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
			System.out.println(message);
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
	/*
	 * 関数名:main
	 * 概　要:図形クラス群のテストプログラム
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/9
	 * 作成者:yuna
	 * */
	public static void main(String[]args) {
		
		//いくつ図形を表示させるかを入力させて変数に値を読み込む
		int howMany =  inputPlusNumber("図形は何個？:");
		
		//図形ごとのインスタンスを格納する配列を生成
		Shape[] instanceArray = new Shape[howMany];

		//表示する図形の種類を表す変数
		int inputShape = 0;
		//点を表す数字を１とする
		final int pointNumber = 1;
		//水平直線を表す数字を２とする
		final int horizonNumber = 2;
		//垂直直線を表す数字を３とする
		final int verticalNumber = 3;
		//長方形を表す数字を４とする
		final int rectangleNumber = 4;
		
		//表示させたい図形の個数分ループする
		for(int i=0; i<howMany; i++) {
			//ループの開始
			do{
				//表示させたい図形の種類の入力を求める文を表示する
				System.out.print((i+1)+"番の図形の種類(1...点/2...水平直線/3...垂直直線/4...長方形):");
				//入力された値を読み込む
				inputShape = inputNumber.nextInt();
				//入力された値が1~4の数字でない場合
				if(inputShape<1 || inputShape>4) {
					//再入力を求める文を表示する
					System.out.println("もう一度入力して下さい。");
				}
			//入力された値が1~4の数字でない場合は繰り返す
			}while(inputShape<1|| inputShape>4);
			
			//入力されたのが点の場合
			if(inputShape==pointNumber) {
				//Pointクラスのインスタンスを生成して配列に格納
				instanceArray[i] = new Point();
			}	
			//入力されたのが水平直線の場合
			if(inputShape==horizonNumber) {
				//入力された値を読み込む
				int inputLength = inputPlusNumber("長さ：");
				//HorzLineクラスのインスタンスを生成して格納
				instanceArray[i] = new HorzLine(inputLength);
				
			}
			//入力されたのが垂直直線の場合
			if(inputShape==verticalNumber) {		
				//入力された値を読み込む
				int inputLength = inputPlusNumber("長さ：");
				//VirtLineクラスのインスタンスを生成して格納
				instanceArray[i] = new VirtLine(inputLength);
				
			}
			//入力されたのが長方形の場合
			if(inputShape==rectangleNumber) {
				//幅を入力させて値を読み込む
				int inputWidth = inputPlusNumber("幅：");
				//高さを入力させて値を読み込む
				int inputHeight = inputPlusNumber("高さ：");
				//Rectangleクラスのインスタンスを生成して格納
				instanceArray[i] = new Rectangle(inputWidth,inputHeight);
			}
		}
		//拡張for文
		//instanceArrayの先頭から順にループする
		for(Shape s:instanceArray) {
			//図形情報と図形の描画
			s.print();
			//次の図形を表示する前に改行を行う
			System.out.println();
		}
	}
}
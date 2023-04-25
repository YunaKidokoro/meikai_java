package Ensyu7_31;
//スキャナークラスをインポートする
import java.util.Scanner;
/*
* クラス名:Ensyu7_31
* 概要:演習7-31
* 作成者:城所佑奈
* 作成日:2023/04/25
* */
public class Ensyu7_31 {
	//スキャナークラスのインスタンスを初期化する
	static Scanner inputNumber = new Scanner(System.in);

	/*
	 * 関数名：absolute
	 * 概要:int型整数の絶対値を返す
	 * 　引数:int型・x・絶対値を求めたい値
	 * 戻り値:int型・absoluteNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static int absolute(int x) {
		//絶対値を表す変数を宣言する
		int absoluteNumber = x;
		//xが負の場合
		if(absoluteNumber<0) {
			//変数の絶対値を求める
			absoluteNumber = -x;
		}
		//絶対値を返す
		return absoluteNumber;
	}

	/*
	 * 関数名：absolute
	 * 概要:long型整数の絶対値を返す
	 * 　引数:long型・x・絶対値を求めたい値
	 * 戻り値:long型・absoluteNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static long absolute(long x) {
		//絶対値を表す変数を宣言する
		long absoluteNumber = x;
		//xが負の場合
		if(absoluteNumber<0) {
			//変数の絶対値を求める
			absoluteNumber = -x;
		}
		//絶対値を返す
		return absoluteNumber;
	}
	
	/*
	 * 関数名：absolute
	 * 概要:float型整数の絶対値を返す
	 * 　引数:float型・x・絶対値を求めたい値
	 * 戻り値:float型・absoluteNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static float absolute(float x) {
		//絶対値を表す変数を宣言する
		float absoluteNumber = x;
		//xが負の場合
		if(absoluteNumber<0) {
			//変数の絶対値を求める
			absoluteNumber = -x;
		}
		//絶対値を返す
		return absoluteNumber;
	}
	
	/*
	 * 関数名：absolute
	 * 概要:double型整数の絶対値を返す
	 * 　引数:double型・x・絶対値を求めたい値
	 * 戻り値:double型・absoluteNumber・xの絶対値
	 * 作成日:2023/04/25
	 * */
	static double absolute(double x) {
		//絶対値を表す変数を宣言する
		double absoluteNumber = x;
		//xが負の場合
		if(absoluteNumber<0) {
			//変数の絶対値を求める
			absoluteNumber = -x;
		}
		//絶対値を返す
		return absoluteNumber;
	}
	/*
	 * 関数名:twoMultiplier
	 * 概要:2のべき乗の計算をする
	 * 引数:int型・putOnNumber・乗数を表す
	 * 戻り値:int型・ResultNumber・2のputOnNumber乗を表す
	 * 作成日:2023/04/20
	 * */
	static int twoMultiplier(int putOnNumber) {
		//計算結果を表す変数
		int ResultNumber = 1;
			//putOnNumber回ループする
			for(int i=0; i<putOnNumber ; i++) {
			//2を書ける
			ResultNumber *= 2;
		}
		//計算結果を表示
		return ResultNumber;
	}
	/*
	 * 関数名:main
	 * 概要:様々な整数型の値の絶対値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/04/25
	 * 作成者:城所佑奈
	 */
	public static void main(String[]argd) {
		//プログラムの説明文と共に入力を促す
		System.out.print("入力した値の絶対値を表示します:");
		//入力された値を読み込む
		double inputFigure = inputNumber.nextDouble();
		
		//入力値が整数のとき
		if(inputFigure%1 ==0) {
			//入力値がint型の範囲内の場合
			if(-twoMultiplier(31)<inputFigure && inputFigure<twoMultiplier(31)-1) {
				//int型で求めたときの表示
				System.out.println("int型\n"+absolute((int)inputFigure));
			}
			//int型の範囲外の場合
			else{
				//long型で求めたときの表示
				System.out.println("long型\n"+absolute((long)inputFigure));
			}
		}
		//入力値が小数点以下を含む場合
		else {
			//入力値が負の場合
			if(inputFigure<0) {
				//float型の範囲内の場合
				if(-3.4*10e38<inputFigure && inputFigure<-1.4e-45) {
					//float型で求めたときの表示
					System.out.println("float型\n"+absolute((float)inputFigure));
				}
				//float型の範囲外の場合
				else {
					//double型で求めたときの表示
					System.out.println("double型\n"+absolute(inputFigure));
				}
			}
			//入力値が正の場合
			else {
				//float型の範囲内の場合
				if(1.4e-45<inputFigure && inputFigure<3.4e38) {
					//float型で求めたときの表示
					System.out.println("float型\n"+absolute((float)inputFigure));
				}
				//float型の範囲外の場合
				else {
					//double型で求めたときの表示
					System.out.println("double型\n"+absolute(inputFigure));
				}
			}
		}		
	}
}

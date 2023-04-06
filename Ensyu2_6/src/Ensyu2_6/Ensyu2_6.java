package Ensyu2_6;
//単一型インポート宣言
//キーボードからの入力を行うためにjava.util.Scannerをインポート
import java.util.Scanner;
/*
 * クラス名:Ensyu2_6
 * 概要:演習2-6
 * 作成者:城所佑奈
 * 作成日:2023/04/05
 * */
public class Ensyu2_6 {
	/*
	* 関数名:main
	* 概要:三角形の底辺と高さを読み込み面積を求める
	* 引数:なし
	* 戻り値:なし
	* 作成者:城所佑奈
	* 作成日:2023/04/05
	* */
	public static void main (String[] args){
		//変数InputNumberを用意して、入力ストリームを渡す
		Scanner InputNumber= new Scanner(System.in);
		//三角形の面積を求めることを表示する。
		System.out.println("三角形の面積を求める");
		//三角形の高さの値の入力を促す
		System.out.print("三角形の高さは?：");
		//double型の変数HeightValueに入力された値を読み込む
		double HeightValue = InputNumber.nextDouble();
		//三角形の底辺の値の入力を促す
		System.out.print("三角形の底辺の長さは？：");
		//double型の変数BaseValueに入力された値を読み込む
		double BaseValue = InputNumber.nextDouble();
		//入力された値から面積を求め表示する。
		System.out.println("三角形の面積は"+(HeightValue*BaseValue*0.5)+"です。");
		}
}
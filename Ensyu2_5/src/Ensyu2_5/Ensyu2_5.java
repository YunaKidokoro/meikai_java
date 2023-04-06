package Ensyu2_5;
//単一型インポート宣言、
//キーボードからの入力を行うためにjava.util.Scannerをインポート
import java.util.Scanner;
/*
 * クラス名:Ensyu2_5
 * 概要:演習2-5
 * 作成者:城所佑奈
 * 作成日:2023/04/05
 * */
public class Ensyu2_5 {
/*
* 関数名:main
* 概要:演習2-5
* 引数:なし
* 戻り値:なし
* 作成者:城所佑奈
* 作成日:2023/04/05
* */
public static void main (String[] args){
	    //変数InputNumberを用意して、入力ストリームを渡す
		Scanner InputNumber= new Scanner(System.in);
		//xの値の入力を促す文を表示する
		System.out.print("xの値：");
		//double型の変数xに入力された値を読み込む
		double x = InputNumber.nextDouble();
		//変数ｙに値の入力を促す。
		System.out.print("yの値：");
		//double型の変数ｙに入力された値を読み込む
		double y = InputNumber.nextDouble();
		//入力されたxとyの値を
		System.out.println("合計は"+(x+y)+"です。");
		System.out.println("平均は"+(x+y)/2 + "です。");
	}
}
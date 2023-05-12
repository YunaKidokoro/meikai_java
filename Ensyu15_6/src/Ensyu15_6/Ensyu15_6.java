package Ensyu15_6;
/**
 * Ensyu15_6<br>演習15-6<br>
 * 作成日：2023/5/12
 * @author yuna
 */
public class Ensyu15_6 {
	/**
	 * main<br>コマンドライン引数を用いて円周と面積を表示する<br>
	 * 作成日：2023/5/12
	 * @param args 円の半径
	 * @return なし
	 */
	public static void main(String[]args) {
		//dable型の配列を宣言
		Double[]circleArray = new Double[args.length] ;
		//引数の数だけループする
		for (int i=0; i<args.length; i++) {
			//コマンドライン引数の値をdable型に変えて配列に格納する
			circleArray[i] = Double.parseDouble(args[i]);
			//i番目の半径を表示する
			System.out.println((i+1)+"つめの半径[cm]："+args[i]);
			//円周の長さを求める
			double circleLength =  2 * Math.PI*circleArray[i];
			//円周の長さを表示する
			System.out.printf("円周[cm]：%.2f\n",circleLength);
			//円の面積を求める
			double circleArea = Math.PI*circleArray[i]*circleArray[i];
			//円の面積を表示する
			System.out.printf("面積[cm^2]：%.2f\n\n",circleArea);
		}
	}
}

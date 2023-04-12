package Ensyu4_26;
//キーボードからの入力を行うためにScannerクラスをインポートする。
import java.util.Scanner ;
/*
 * クラス名:Ensyu4_26
 * 概要:演習4-26
 * 作成者:城所佑奈
 * 作成日:2023/04/12
 * */
public class Ensyu4_26 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ整数を加算（ただし負の値は加算しない）して平均も求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:城所佑奈
	 * 作成日:2023/04/12
	 * */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputValue = new Scanner (System.in);
		//整数を加算することを表示
		System.out.println("整数を加算します。");
		
		//入力を読み込むための変数を宣言する
		int firstInput = 0;
		//ループの開始
		do {
			//何個加算するかの入力を促す文
			System.out.println("何個加算しますか：");
			//入力された値を読み込む、加算する個数
			firstInput = inputValue.nextInt();
		//0以下の整数が入力された場合には繰り返し入力を求める
		}while(firstInput <= 0);
		
		//合計値を表す変数
		int sumValue = 0;
		
		//カウント数を表す変数を宣言する
		int countNumber = 0;
		//実際にループした回数を数えるための変数
		int loopCount   = 0;
		//カウント数を表す変数が0から入力値まで１ずつ増える間ループする
		for(countNumber = 0 ; countNumber < firstInput; countNumber++) {
			//整数の入力を促す文を表示
			System.out.print("整数：");
			//入力された値を読み込む
			int secondInput = inputValue.nextInt();
			//入力された値が0より小さい場合
			if(secondInput < 0) {
				//負の値は加算しないことを表示
				System.out.println("負の数は加算しません。");
				//残りの部分の処理を飛ばしてループの最初に戻る
				continue;
			}
			//これまでの合計値に入力された値を加算する。
			sumValue += secondInput;
			//ループ回数を数える
			loopCount++;
		}
		//合計値を表示する
		System.out.print("合計は"+ sumValue +"です。");
		//平均値を計算する
		int averageValue = sumValue/loopCount;
		//平均値を表示する
		System.out.print("平均は"+ averageValue +"です。");
	}
}

package Ensyu10_3;
import java.util.Scanner;
public class normalInput {

	static Scanner inputNumber = new Scanner(System.in);
	
	public static int elementInput() {
		int inputElement = 0;
		System.out.print("要素数：");
		do {
			inputElement = inputNumber.nextInt();
			if(inputElement<=0) {
				System.out.print("もう一度入力して下さい：");
			}
		}while(inputElement<=0);
		return inputElement;
	}
	
	 /* 関数名:arrayInput
	 * 　概要:各配列要素を入力して返す
	 * 　引数:int型　・elementValue・配列要素の数
	 * 戻り値:int[]型・inputArray・入力した値の格納された配列を返す
	 * 作成日:2023/04/21
	 * */
	public static int[] arrayInput(int[] inputArray, int elementValue) {
		
		//配列のインデックスが0から配列要素数分ループする
		for(int i=0; i<elementValue ;i++) {
			//値を入力する配列のインデックスを表示
			System.out.print("a["+i+"]=");
			//入力された値を配列に代入する
			inputArray[i] = inputNumber.nextInt();
		}
		//値の格納された値を返す
		return inputArray;
	}
}

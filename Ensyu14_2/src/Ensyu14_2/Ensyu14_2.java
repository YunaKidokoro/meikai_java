package Ensyu14_2;
//スキャナークラスをインポートする
import java.util.Scanner;
/**
 * 演習14_2<br>
 * 作成日:2023/5/10
 * @author yuna
 */
public class Ensyu14_2 {
	
	/**
	 * inputNumber<br>
	 * 作成日:2023/5/11
	 * @param message String型 何を入力させるかに関する文字列
	 * @return 入力された値 int型
	 * @author yuna
	 */
	static int inputNumber(String message) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		//入力された値読み込む変数
		int inputSkin = 0;
		//ループの開始
		do {
			//入力を求める文を表示する
			System.out.print(message);
			//入力された値を変数に読み込む
			inputSkin = inputNumber.nextInt();
			//0~5の数字以外が入力された場合
			if(inputSkin<0 || inputSkin>5) {
				//再入力を求める文を表示する
				System.out.println("もう一度入力して下さい。");
			}
		//0~5の数字以外が入力された場合は繰り返す
		}while(inputSkin<0 || inputSkin>5);
		//入力された値を返却する
		return inputSkin;
	}
	/**
	 * Skinnableインタフェースの実装を確認<br>
	 * 作成日:2023/5/10
	 * @param args
	 * @return なし
	 * @author yuna
	 */
	public static void main(String[] args) {
		//SkinnablePetクラスのインスタンスを生成する
		SkinnablePet petInstance = new SkinnablePet("teto","yuna",0);
		//ペットの自己紹介文を表示する
		petInstance.introduce();
		//着せ替えの種類を表示する
		petInstance.printSkin();
		//変更を尋ねる文を表示
		System.out.println("今の着せ替えは"+petInstance.getSkin()+"です");
		int inputSkin = inputNumber("どれに変える？：");
		//着せ替えを変更する
		petInstance.changeSkin(inputSkin);
	}
}

package Ensyu14_2;
//スキャナークラスをインポートする
import java.util.Scanner;
/**
 * 演習14_2
 * @author yuna
 * 作成日:2023/5/10
 */
public class Ensyu14_2 {
	/**
	 * Skinnableインタフェースの実装を確認
	 * @author yuna
	 * 作成日:2023/5/10
	 */
	public static void main(String[] args) {
		//スキャナークラスのインスタンスを初期化する
		Scanner inputNumber = new Scanner(System.in);
		//SkinnablePetクラスのインスタンスを生成する
		SkinnablePet petInstance = new SkinnablePet("teto","yuna",0);
		//ペットの自己紹介文を表示する
		petInstance.introduce();
		//着せ替えの種類を表示する
		petInstance.printSkin();
		//変更を尋ねる文を表示
		System.out.print("どれに変える？：");
		//入力された値を変数に読み込む
		int inputSkin = inputNumber.nextInt();
		//着せ替えを変更する
		petInstance.changeSkin(inputSkin);
	}
}

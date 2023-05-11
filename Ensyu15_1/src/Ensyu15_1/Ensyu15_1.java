package Ensyu15_1;
//スキャナークラスをインポートする
import java.util.Scanner; 
/**
 * Ensyu15_1<br> 演習15-1<br>
 * 作成日：2023/5/11
 * @author yuna
 */
public class Ensyu15_1 {
	
	/**
	 * main <br> 文字列を読み込んで逆順に表示する<br>
	 * 作成日：2023/5/11
	 * @param args
	 * @return なし
	 * @author yuna
	 */
	public static void main(String[]args) {
		//文字列を表す変数を宣言
		String inputSentence = "a";
		//スキャナークラスのインスタンスを初期化する
		Scanner inputText = new Scanner(System.in);
		//文字列の入力を促す文を表示
		System.out.print("文字列を入力して下さい：");
		//入力された文字列を変数に読み込む
		inputSentence = inputText.next();
		//文字列を逆順に表示する
		//文字列の後ろの文字から先頭に向うループ
		for(int i=inputSentence.length()-1; i>=0; i--) {
			//i番目の文字を表示
			System.out.print(inputSentence.charAt(i));
		}
		//ループの終わりに改行をしておく
		System.out.println();
			
	}
}

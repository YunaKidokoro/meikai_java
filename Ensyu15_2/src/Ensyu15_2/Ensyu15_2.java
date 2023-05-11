package Ensyu15_2;
//スキャナークラスをインポートする
import java.util.Scanner;
/**
 * Ensyu15_2<br> 演習15-2<br>
 * 作成日：2023/5/11
 * @author yuna
 */
public class Ensyu15_2 {
	/**
	 * main <br> 読み込んだ文字列の文字コードを表示する<br>
	 * 作成日：2023/5/11
	 * @param args
	 * @return なし
	 * @author yuna
	 */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを生成する
		Scanner input = new Scanner(System.in);
	    //文字列の入力を促す文を表示
		System.out.print("文字列を入力して下さい：");
		//入力された文字を変数に読み込む
		String inputText = input.next();
		//文字列を一文字ずつchar型の配列に格納する
		char[] inputTextArray = inputText.toCharArray();
		
		//配列の先頭から末尾までループ
		for(int i=0; i<inputTextArray.length; i++) {
			//i文字めの文字コードを表示すること、を表示する
			System.out.println((i+1)+"文字目:"+inputTextArray[i]);
			//文字に対応するUnicodeコードを取得する
			int stringCode = (int)inputTextArray[i];
			//10進数で文字コードを表示する
			System.out.println("文字コード(10進数):"+stringCode);
			//16進数に変換して文字コードを表示
			System.out.println("文字コード(16進数):0x"+Integer.toHexString(stringCode)+"\n");
		}
	}
}
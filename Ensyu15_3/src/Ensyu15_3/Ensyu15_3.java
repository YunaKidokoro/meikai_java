package Ensyu15_3;
//スキャナークラスをインポートする
import java.util.Scanner;

/**
 * Ensyu15_3<br> 演習15-3<br>
 * 作成日:2023/5/11
 * @author yuna
 */
public class Ensyu15_3 {
	/**
	 * countNumberOf<br> 文字数を半角は１、全角は２として数える<br>
	 * 作成日:2023/5/11
	 * @param text 文字数を知りたい文字列
	 * @return 文字数
	 * @author yuna
	 */
	static int countNumberOf(String text) {
		//文字数を表す変数
		int countNumber = 0;
		//文字列を一文字ずつ配列に格納する
		char[] charArray = text.toCharArray();
		//文字配列の先頭から末尾までループ
		for(int i=0; i<charArray.length; i++) {
			//i番目の文字のバイト数を調べて1以下の場合
			if(String.valueOf(charArray[i]).getBytes().length <=1) {
				//文字は半角だったので文字数を１カウントする
				countNumber += 1;
			}
			//全角の場合
			else {
				//文字数を２カウントする
				countNumber +=2;
			}
		}
		//文字数を返却する
		return countNumber;
	}
	/**
	 *  main<br> 2つの文字列の一致する部分があれば縦に揃えて表示する
	 * 作成日:2023/5/11
	 * @param args
	 * @return なし
	 * @author yuna
	 */
	public static void main(String[]args) {
		//スキャナークラスのインスタンスを生成する
		Scanner inputStrings = new Scanner(System.in);
		//1つめの文字列の入力を促す文を表示
		System.out.print("文字列s1:");
		//入力された文字列を読み込む
		String s1 = inputStrings.next();
		//2つめの文字列の入力を促す文を表示
		System.out.print("文字列s2:");
		//入力された文字列を読み込む
		String s2 = inputStrings.next();
		
		//一致した文字列の先頭のインデックスを調べて変数に代入する
		//一致しない場合は-1
		int indexNumber = s1.indexOf(s2);
		
		//一致する箇所がなかった場合
		if(indexNumber==-1) {
			//s1の中にs2は含まれないことを表示すうｒ
			System.out.println("s1の中にs2は含まれません。");
		}
		//一致する箇所がある場合
		else {
			//一致するまでの文字とそのあとの文字に分ける
			String[] stringArray = s1.split(s2);
			//一致するまでの文字数を数える
			int countNumber = countNumberOf(stringArray[0]);
			//一つ目の文字列を表示する
			System.out.println("s1:"+ s1);
			//二つ目の文字列を表示する
			System.out.print("s2:");
			//1文字目から一致する文字目までの回数ループ
			for(int i=0 ; i < countNumber ; i++) {
				//スペースを表示
				System.out.print(" ");
			}
			//一致した文字列を表示する
			System.out.print(s2);
		}
	}
}

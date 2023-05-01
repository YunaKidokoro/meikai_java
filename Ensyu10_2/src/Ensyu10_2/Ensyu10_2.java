package Ensyu10_2;
import java.util.Scanner ;
/*
 * クラス名:Ensyu10_2
 * 概　要:演習10-2
 * 作成者:yuna
 * 作成日:2023/5/1
 * */
public class Ensyu10_2 {
	static Scanner inputNumber = new Scanner(System.in);
	
	/*
	 * 関数名:changeN
	 * 概　要:識別番号の増加幅の変更
	 * 引　数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/1
	 * */
	static void changeN() {
		//現在の識別番号の増加幅を表示
		System.out.println("識別番号はn="+ExId.getN() + "個ずつ増えます。");
		//増加幅を変更するかを尋ねる
		System.out.print("nの値を変更しますか？yes...1/no...その他：");
		//入力された値を読み込む
		int answerNumber = inputNumber.nextInt();
		//変更を行う場合
		if(answerNumber == 1) {
			//新しい増加幅を入力させる
			System.out.print("nの値を入力して下さい：");
			//入力された値を読み込む
			int inputN = inputNumber.nextInt();
			//増加幅を設定し直す
			ExId.setN(inputN);
		}
	}

	/*
	 * 関数名：main
	 * 概要:ExIdクラスのテストクラス
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:yuna
	 * 作成日:2023/5/1
	 * */
	public static void main(String[]args) {

		//新しく識別番号を与えることを表示する
		System.out.println("インスタンスaに識別番号を与えます。");
		//最初の識別番号のインスタンスaを生成
		ExId a = new ExId();
		//aの識別番号を表示
		System.out.println("aの識別番号："+ a.getId());
		//コンソール画面を見やすくするために改行
		System.out.println();
		
		//次の番号を与えることを表示する
		System.out.println("インスタンスbに識別番号を与えます。");
		//識別番号の増加幅を変更するか
		changeN();
		//２番めの識別番号のインスタンスbを生成
		ExId b = new ExId();
		//bの識別番号を表示
		System.out.println("bの識別番号："+ b.getId());	
		//コンソール画面を見やすくするために改行
		System.out.println();

		//次の番号を与えることを表示する
		System.out.println("インスタンスbに識別番号を与えます。");
		//識別番号の増加幅を変更するか
		changeN();
		//3番めの識別番号のインスタンスbを生成
		ExId c = new ExId();
		//cの識別番号を表示
		System.out.println("cの識別番号："+ c.getId());	
		//コンソール画面を見やすくするために改行
		System.out.println();

		//最後に与えた識別番号を表示する
		System.out.println("最後に与えた識別番号："+ExId.getMaxid());		
	}
}
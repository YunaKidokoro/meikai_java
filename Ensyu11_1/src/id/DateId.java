package id;
//GregorianCalendarをインポートする
import static java.util.Calendar.*;

//GregorianCalendarをインポートする
import java.util.GregorianCalendar;
/*
 * クラス名:DateId
 * 概　要:識別番号クラス
 * 作成者:yuna
 * 作成日:2023/5/8
 * */
public class DateId {
	//何番まで識別番号を与えたかを表すフィールド
	private static int counter;
	//識別番号を表すフィールド
	private int id;
	//静的初期化子
	static {
		//GregorianCalendarクラスのインスタンスを初期化する
		GregorianCalendar today = new GregorianCalendar();
		//今日が何年かを変数に代入する
		int thisYear  = today.get(YEAR);
		//今日が何月かを変数に代入する
		int thisMonth = today.get(MONTH) + 1;
		//今日が何日かを変数に代入する
		int thisDate  = today.get(DATE);
		//今日の日付を表示する
		System.out.printf("今日は%04d年%02d月%02d日です。\n", thisYear, thisMonth, thisDate);
		//今日の日付を元に識別番号を決める
		counter = thisYear * 1000000 + thisMonth * 10000 + thisDate * 100;
	}
	
	//コンストラクタ
	public DateId() {
		//新しくインスタンスが生成される度に識別番号を数える
		id = ++counter;
	}
	
	/*
	 * 関数名:getId
	 * 概要:識別番号を取得する
	 * 引数:なし
	 * 戻り値:識別番号を返却、id
	 * */
	public int getId() {
		//識別番号を返却する
		return id;
	}
}	
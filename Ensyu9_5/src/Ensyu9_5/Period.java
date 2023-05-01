package Ensyu9_5;
/*
 * クラス名:Period
 * 概要:開始日と終了日から構成される期間を表すクラス
 * 作成日:2023/5/1
 * 作成者:城所佑奈
 * */
public class Period {
	//フィールド
	//開始日を表すフィールド
	private Day from;
	//終了日を表すフィールド
	private Day to;
	
	//コンストラクタ
	Period (Day from, Day to){
		//開始日を表すインスタンスを初期化する
		this.from = from;
		//終了日を表すインスタンスを初期化する
		this.to   = to;
	}
	
	/*
	 * 関数名:getFrom
	 * 概要:開始日の値を取得
	 * 引数:なし
	 * 戻り値:開始日がいつかを返す
	 * 作成日:2023/5/1
	 * */
	public static Day getFrom(Day from) {
		//開始日がいつかを返す
		return from;
	}
	/*
	 * 関数名:getTo
	 * 概要:終了日の値を設定
	 * 引数:なし
	 * 戻り値:終了日を設定する
	 * 作成日:2023/5/1
	 * */
	public static Day getTo(Day to) {
		//終了日がいつかを返す
		return to;
	}
	/*
	 * 関数名:setFrom
	 * 概要:開始日を設定する
	 * 引数:開始日がいつか
	 * 戻り値:なし
	 * 作成日:2023/5/1
	 * */
	public void setFrom(Day from) {
		//開始日を表すインスタンスに値を代入
		this.from = from;
	}
	
	/*
	 * 関数名:setTo
	 * 概要:終了日を設定する
	 * 引数終了日がいつか
	 * 戻り値:なし
	 * 作成日:2023/5/1
	 * */
	public void setTo(Day to) {
		//終了日を表すインスタンスに値を代入
		this.to = to;
	}
	
	/*
	 * 関数名:printPeriod
	 * 概要:開始日と終了日の文字を表示する
	 * 引数:なし
	 * 戻り値:文字列を返す
	 * 作成日:2023/5/1
	 * */
	public void printPeriod() {
		//日付と、その日付が開始日を表すことを表示
		System.out.println("開始日:" + from);
		//日付と、その日付が終了日を表すことを表示
		System.out.println("終了日:" + to);
	}
	
}

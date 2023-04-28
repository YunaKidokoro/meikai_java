package Ensyu9_3;
/*
 * クラス名:Accoun
 * 概要:銀行口座の情報
 * 作成者:yuna
 * 作成日:2023/04/28
 * */
public class Account {
	//フィールド
	//口座名義を表すフィールド
	private String name;
	//口座番号を表すフィールド
	private String no;
	//預金残高を表すフィールド
	private long balance;
	//開設日を表す(Dayクラスのインスタンスを参照する)フィールド
	private Day openingDate;
	
	//コンストラクタ
	Account (String name, String no, long balance, Day openingDate){
		//口座名義を表すインスタンスの初期化
		this.name = name;
		//口座番号を表すインスタンスの初期化
		this.no = no;
		//預金残高を表すインスタンスの初期化
		this.balance = balance;
		//開設日を表すインスタンスの初期化
		this.openingDate = new Day(openingDate);
	}
	//ゲッタ
	//口座名義を取得
	String getName() {return name;}
	//口座番号を取得
	String getNo()	 {return no;}
	//預金残高を取得
	long getBalance(){return balance;}
	//開設日を取得
	Day getDate() {return new Day(openingDate);}


	//セッタ
	//口座番号を設定する
	public void setName(String name) {this.name = name;}
	//口座番号を設定する
	public void setNo(String no)	 {this.no = no;}
	//預金残高を設定する
	public void setBalance(long balance){this.balance = balance;}
	//開設日を設定する
	public void setDate(Day openingDate){this.openingDate = openingDate;}
	
	/*
	 *関数名：deposit
	 *概　要：ｋ円預ける
	 *引　数：long型・k・預け入れる金額
	 *戻り値：long型・k・預金残高
	 *作成日：2023//04/28
	 */
	void deposit(long k) {balance +=k;}

	/*
	 *関数名：withdraw
	 *概　要：ｋ円引き出す
	 *引　数：long型・k・引き出す金額
	 *戻り値：long型・k・預金残高
	 *作成日：2023//04/28
	 */	
	void withdraw(long k) {balance -=k;}
	
	/*
	 *関数名：toString
	 *概　要：文字列表現の返却、口座情報について
	 *引　数：なし
	 *戻り値：String型・口座情報をまとめた文字列を返す
	 *作成日：2023/04/28
	 * */
	public String toString() {
		//口座情報をまとめた文字列を返す
		return String.format("口座名義：%s\n口座番号：%s\n預金残高："
	+ "%d\n口座開設日：%s\n",name, no, balance, openingDate);
	}
}

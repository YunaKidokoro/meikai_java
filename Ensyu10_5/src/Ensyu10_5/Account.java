package Ensyu10_5;

/*
 * クラス名:Account
 * 概　要:銀行口座クラス
 * 作成日:2023/5/8
 * 作成者:yuna
 * */
public class Account {
	//識別番号をいくつ与えたかを表す変数
	private static int counter = 0;
	//フィールド
	//口座名義を表すフィールド
	private String name;
	//口座番号を表すフィールド
	private String no;
	//預金残高を表すフィールド
	private long balance;
	//識別番号を表すフィールド
	private int id;
	
	//インスタンス初期化子
	{
		//インスタンスが生成される度に以下のメッセージを表示する
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	
	//コンストラクタ
	Account (String name, String no, long balance){
		//口座名義を表すインスタンスの初期化
		this.name = name;
		//口座番号を表すインスタンスの初期化
		this.no = no;
		//預金残高を表すインスタンスの初期化
		this.balance = balance;
		//識別番号を数える
		id = ++counter;
	}
	//ゲッタ
	/*
	 * 関数名:getName
	 * 概要:口座名義を取得
	 * 引数:なし
	 * 戻り値:口座名義
	 * 作成日:2023/5/8
	 * */
	String getName() {
		//口座名義を返す
		return name;
	}
	/*
	 * 関数名:getNo
	 * 概要:口座番号を取得
	 * 引数:なし
	 * 戻り値:口座番号
	 * 作成日:2023/5/8
	 * */
	String getNo(){
		//口座番号を返す
		return no;
	}
	/*
	 * 関数名:getBalance
	 * 概要:預金残高を取得
	 * 引数:なし
	 * 戻り値:預金残高
	 * 作成日:2023/5/8
	 * */
	long getBalance(){
		//預金残高を返す
		return balance;
	}

	/*
	 * 関数名:getId
	 * 概要:識別番号を取得
	 * 引数:なし
	 * 戻り値:識別番号
	 * 作成日:2023/5/8
	 * */
	long getId(){
		//識別番号を返す
		return id;
	}

	
	//セッタ
	/*
	 * 関数名:setName
	 * 概要:口座名義を設定する
	 * 引数:口座名義,name
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void setName(String name) {
		//口座名義を表すフィールドに引数の値を代入する
		this.name = name;
	}
	/*
	 * 関数名:setNo
	 * 概要:口座番号を設定する
	 * 引数:口座番号, no
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public void setNo(String no){
		//口座番号を表すフィールドに引数の値を代入する
		this.no = no;
	}
	/*
	 * 関数名:setBalance
	 * 概要:預金残高を設定する
	 * 引数:預金残高,balance
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */

	public void setBalance(long balance){
		//預金残高を表すフィールドに引数の値を代入する
		this.balance = balance;
	}
	
	/*
	 *関数名：deposit
	 *概　要：ｋ円預ける
	 *引　数：long型・k・預け入れる金額
	 *戻り値：long型・k・預金残高
	 *作成日：2023//04/28
	 */
	void deposit(long k) {
		//預金残高にk円足す
		balance +=k;
	}

	/*
	 *関数名：withdraw
	 *概　要：ｋ円引き出す
	 *引　数：long型・k・引き出す金額
	 *戻り値：long型・k・預金残高
	 *作成日：2023//04/28
	 */	
	void withdraw(long k) {
		//預金残高からk円引き出す
		balance -=k;
	}
	
	/*
	 *関数名：toString
	 *概　要：文字列表現の返却、口座情報について
	 *引　数：なし
	 *戻り値：String型・口座情報をまとめた文字列を返す
	 *作成日：2023/04/28
	 * */
	public String toString() {
		//口座情報をまとめた文字列を返す
		return String.format("口座名義：%s\n口座番号："
		+ "%s\n預金残高：%s\n識別番号：%s\n",name, no, balance,id);
	}
}

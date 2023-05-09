package Ensyu12_2;
/*
 * クラス名:Ensyu12_2
 * 概要:定期預金付き銀行口座クラス(Accountクラスの派生クラス
 * 作成日:2023/5/8
 * 作成者:yuna
 * */
public class TimeAccount extends Account{
	//定期預金
	private long timeBalance;
	
	//コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance){
		//スーパークラスのインスタンスの初期化
		super(name,no,balance);
		//定期預金のインスタンスの初期化
		this.timeBalance = timeBalance;
	}
	/*
	 * 関数名:getBalance
	 * 概要:定期預金付き口座残高を取得する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成日:2023/5/9
	 * */
	long getBalance(){
		//定期預金の金額と口座の残高の合計を返す
		return timeBalance + super.getBalance();
	  
	}

	/*
	 * 関数名:compBalance
	 * 概　要:二つの口座残高の比較結果を返却する
	 * 引　数:Accountクラスのインスタンスa,b
	 * 戻り値:a(普通預金)の方が多い場合は１を
	 * 		  b(定期預金付き)の方が多い場合は－1を
	 * 		  a,bが等しい額の場合は0を返却する
	 * 作成日:2023/5/8
	 * */
	public static int compBalance(Account a, Account b){
		//預金額の比較した結果を返す変数を宣言
		int returnResult = 0;
		//a(普通預金)の方が多い場合は１とする
		final int moreThanA = 1;
		//b(定期預金付き)の方が多い場合は－1とする
		final int moreThanB = -1;
		//a,bが等しい額の場合は0とする
		final int equalAB = 0;
		
		//普通預金の口座残高を取得して変数に代入
		long balanceA = a.getBalance();
		//定期預金付きの口座残高を取得して変数に代入
		long balanceB = b.getBalance();
		
		//普通預金の方が多い場合
		if (balanceA > balanceB) {
			//比較結果として１を返す
			returnResult = moreThanA;
		}
		//普通預金の方が少ない場合
		else if (balanceA < balanceB) {
			//比較結果としてー１を返す
			returnResult = moreThanB;
		}
		//等しい場合
		else{
			//比較結果としてー１を返す
			returnResult = equalAB;
		}
		//比較結果を返却する
		return returnResult;		
	}
	/*
	 * 関数名:printCompBalance
	 * 概　要:口座残高の比較結果を表示する
	 * 引　数:Accountクラスのインスタンスa,b
	 * 戻り値:なし
	 * 作成日:2023/5/8
	 * */
	public static  void printCompBalance(Account a, Account b) {
		//口座名を取得する
		String accountNameA = a.getName();
		//口座名を取得する
		String accountNameB = b.getName();
		
		//なにを比較したのかを表示
		System.out.print("口座残高は");
		
		//比較結果がAの方が多い場合
		if(compBalance(a,b) == 1) {
			//Aが多いことを表示する
			System.out.println(accountNameA + "の方が多いです。");
		}
		//比較結果がBの方が多い場合
		else if(compBalance(a,b) == -1) {
			//Bが多いことを表示する
			System.out.println(accountNameB + "の方が多いです。");
		}
		//比較結果が等しい場合
		else if(compBalance(a,b) == 0) {
			//口座残高が等しいことを表示する
			System.out.println("等しいです。");
		}
	}
}
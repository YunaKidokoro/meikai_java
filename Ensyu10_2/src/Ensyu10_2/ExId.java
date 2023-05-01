package Ensyu10_2;
/*
 * クラス名:Id
 * 概　要:個々のインスタンスを区別できるようにする連番クラス
 * 作成日:2023/5/1
 * 作成者:城所佑奈
 * */
public class ExId {
	
	/*
	 * 関数名:getMaxid
	 * 概　要:最後に与えた識別番号を返す
	 * 引　数:なし
	 * 戻り値:int型・distinctionNumber・最後に与えた識別番号
	 * 作成日:2023/5/1
	 * */
	static int getMaxid() {
		//最後に与えた識別番号を表す変数にいくつ与えたかを代入
		int distinctionNumber = counter;
		//最後に与えた識別番号を返す
		return distinctionNumber;
	}
	
	//何番まで識別番号を与えたかを記憶する変数
	static int counter = 0;
	//識別番号をいくつずつ増やすかを表すフィールド
	static int n = 1;
	//識別番号を表すフィールド
	private int id = 0;
	
	//識別番号のコンストラクタ
	public ExId() {
		//インスタンスが新しく生成されると識別番号も数字が増えていく
		id = n +counter ;
		counter = id;
	}
	/*
	 * 関数名：getId
	 * 概　要:識別番号を取得する
	 * 引　数:なし
	 * 戻り値:Id 識別番号を返す
	 * 作成日:2023/5/1
	 * */
	public int getId() {return id;}
	
	/*
	 * 関数名：getN
	 * 概　要:識別番号をいくつ増やしているか取得する
	 * 引　数:なし
	 * 戻り値:識別番号をいくつ増やしているかを返す
	 * 作成日:2023/5/1
	 * */
	static public int getN() {return n;}	
	/*
	 * 関数名：serN
	 * 概　要:識別番号をいくつ増やすかを設定する
	 * 引　数:設定するnの値
	 * 戻り値:なし
	 * 作成日:2023/5/1
	 * */
	static public void setN(int inputN) {n = inputN;}
	
}
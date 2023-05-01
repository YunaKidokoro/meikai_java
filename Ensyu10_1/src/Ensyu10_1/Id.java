package Ensyu10_1;
/*
 * クラス名:Id
 * 概　要:個々のインスタンスを区別できるようにする連番クラス
 * 作成日:2023/5/1
 * 作成者:城所佑奈
 * */
public class Id {
	
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
	//識別番号を表すフィールドの宣言
	private int id = 0;
	//識別番号のコンストラクタ
	public Id() {
		//インスタンスが新しく生成されると識別番号も数字が増えていく
		id = ++counter;
	}
	/*
	 * 関数名：getId
	 * 概要:識別番号を取得する
	 * 引数:なし
	 * 戻り値:Id 識別番号を返す
	 * 作成日:
	 * */
	public int getId() {return id;}
}

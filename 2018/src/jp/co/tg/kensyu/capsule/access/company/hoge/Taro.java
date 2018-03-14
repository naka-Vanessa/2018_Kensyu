package jp.co.tg.kensyu.capsule.access.company.hoge;

/**
 * タロさんです。
 * @author masaki
 *
 */
public class Taro {

	/**
	 * 住所
	 */
	public String streetAddress = "東京都千代田区霞が関２丁目１−１";
	//↑個人情報が誰からでも見れるし勝手に変えられてしまうなんてコワい!!　ちなみに警視庁本部の住所です。

	/**
	 * 正気度
	 */
	protected int sanity = 100;
	//詳しくは継承の項目で確認する。

	/**
	 * パソコンのパスワード
	 */
	String pcPassword = "12345678";
	//同じチームの人であれば知ってたりするんすが、やはりよろしくないです…。

	/**
	 * 所持金
	 */
	private int money = 1000000;

	/**
	 * コンストラクタ
	 */
	public Taro() {

	}

	/**
	 * 仕事します
	 */
	public void doWork() {
		sanity -= 10;
	}

	/**
	 * リフレッシュします。
	 */
	protected void doRefresh() {
		buyJuice();
		removeBooger();
	}

	/**
	 * PCを使用可能状態にします。
	 */
	void doPcAccess() {
		System.out.println(this.getClass().getSimpleName() + "：ログオンします。パスワードは...  → [" + pcPassword + "]");
	}

	/**
	 * ジュースを買う
	 */
	private void buyJuice() {
		money -= 100;
		sanity += 2;
	}

	/**
	 * 鼻くそを取り除きます。
	 */
	//人には、自身のパフォーマンスを高めるため他人に知られたくない事をしているものです。
	private void removeBooger() {
		sanity += 50;
	}
}

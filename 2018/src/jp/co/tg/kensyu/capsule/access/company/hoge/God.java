package jp.co.tg.kensyu.capsule.access.company.hoge;

/**
 * 神様です。
 * @author masaki
 *
 */
public class God {

	/**
	 *　プライベートコンストラクタ
	 */
	//神様は誰にも生成できません。
	private God() {}

	/**
	 * 天変地異を起こします。
	 */
	public void doNaturalDisaster() {
		System.out.println(this.getClass().getSimpleName() + ":ドカーン!!");
	}
}

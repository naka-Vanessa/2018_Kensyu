package jp.co.tg.kensyu.capsule.access.company.hoge;

/**
 * 暗部です。<br>
 * 汚れ仕事を行う、外部に存在がバレてはまずい連中です。
 * @author masaki
 *
 */
class DarkPart {
	DarkPart() {}
	/**
	 * 偽装工作します。
	 */
	void doCamouflageWork() {
		System.out.println(this.getClass().getSimpleName() + ":資料改竄!!");
	}
}

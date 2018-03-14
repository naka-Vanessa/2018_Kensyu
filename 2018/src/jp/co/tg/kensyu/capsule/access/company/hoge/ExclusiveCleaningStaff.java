package jp.co.tg.kensyu.capsule.access.company.hoge;

/**
 * 専属の清掃員です。
 * @author masaki
 *
 */
public class ExclusiveCleaningStaff {

	/**
	 * パッケージプライベート
	 */
	ExclusiveCleaningStaff(){
	}

//	/* package */ ExclusiveCleaningStaff(){
//	/* default */ ExclusiveCleaningStaff(){
// のように書かれていることがあったりします。「アクセス修飾子忘れたわけじゃないからね!」という意思表示として。

	/**
	 * 清掃を行います
	 */
	public void doWash() {
		System.out.println(this.getClass().getSimpleName() + ":クリーン！");
	}
	/**
	 * 整理整頓します。
	 */
	void doPrepare() {
		System.out.println(this.getClass().getSimpleName() + ":整理整頓!!");
	}

}

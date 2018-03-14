package jp.co.tg.kensyu.extend.override;

public class ClassAA extends ClassA{
	/* (非 Javadoc)
	 * @see jp.co.tg.kensyu.extend.override.ClassA#testOverride()
	 */
	@Override
	public void testOverride() {
		System.out.println("サブクラスのAAです。");
	}
}

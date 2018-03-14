package jp.co.tg.kensyu.polymorphism.abstract1;

/**
 * 男性
 * @author masaki
 *
 */
public abstract class AbstractMale extends AbstractHuman {
	@Override
	public void eat() {
		System.out.println("カレー");
	}
	/**
	 * 健康維持方法
	 */
	public abstract void maintainingHealth();
}

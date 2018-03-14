package jp.co.tg.kensyu.polymorphism.abstract1;

/**
 * 女性
 * @author masaki
 *
 */
public abstract class AbstractFemale extends AbstractHuman {
	@Override
	public void eat() {
		System.out.println("アボガド");
	}
	/**
	 * 美容維持方法
	 */
	public abstract void maintenanceBeauty();
}

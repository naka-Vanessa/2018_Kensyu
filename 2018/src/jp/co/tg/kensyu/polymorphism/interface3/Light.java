package jp.co.tg.kensyu.polymorphism.interface3;

/**
 * 照明
 * @author masaki
 *
 */
public class Light implements Startable{
	/**
	 * 点灯/消灯状態
	 */
	private boolean state = false;
	@Override
	public void start() {
		state = !state;
		String text = state ? "ピカ!!(点灯)" : "フゥ(消灯)";
		System.out.println(this.getClass().getSimpleName() + " : " + text);
	}

}

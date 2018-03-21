package jp.co.tg.kensyu.polymorphism.interface3;

/**
 * やる気スイッチ人間
 * @author masaki
 *
 */
public class YarukiSwitchHuman implements Startable{

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " : なんかやる気出てきたー！！");
	}

}

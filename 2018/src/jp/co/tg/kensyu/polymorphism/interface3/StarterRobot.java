package jp.co.tg.kensyu.polymorphism.interface3;

public class StarterRobot {
	public void execute(Startable obj) {
		System.out.println(this.getClass().getSimpleName() + ": ぽちっとな");
		obj.start();
	}
}

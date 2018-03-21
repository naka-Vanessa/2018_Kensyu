package jp.co.tg.kensyu.polymorphism.interface3;

public class Main {
	public static void main(String[] args) {
		StarterRobot robot = new StarterRobot();

		YarukiSwitchHuman human = new YarukiSwitchHuman();
		Light light = new Light();
		PC pc = new PC();

		sleep();
		robot.execute(human);
		sleep();
		robot.execute(light);
		sleep();
		robot.execute(light);
		sleep();
		robot.execute(light);
		sleep();
		robot.execute(light);
		sleep();
		robot.execute(pc);

	}

	public static void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}

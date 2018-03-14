package jp.co.tg.kensyu.polymorphism.interface2;

import jp.co.tg.kensyu.polymorphism.interface2.PonkotsuButton.PushListener;

public class Main {
	public static void main(String[] artgs) {
		PonkotsuButton btn = new PonkotsuButton();

		btn.setPushListener(new PushListener() {
			@Override
			public void pushed(int state) {
				switch(state) {
				case 0:
					System.out.println("OFFの状態のようだ。");
					break;
				case 1:
					System.out.println("ONの状態のようだ。");
					break;
				}
			}
		});

		for(int i=0;i<5;i++) {
			System.out.println("-------------------------");
			System.out.println("ポチっとな!");
			btn.push();
		}
	}
}

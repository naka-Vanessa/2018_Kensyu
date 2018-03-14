package jp.co.tg.kensyu.polymorphism.abstract1;

public class Sachiko extends AbstractFemale{

	@Override
	public void hobby() {
		System.out.println("化粧");
	}

	@Override
	public void maintenanceBeauty() {
		System.out.println("水素水を飲む");
	}

}

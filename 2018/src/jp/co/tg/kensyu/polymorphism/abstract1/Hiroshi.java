package jp.co.tg.kensyu.polymorphism.abstract1;

public class Hiroshi extends AbstractMale{

	@Override
	public void hobby() {
		System.out.println("ラップ");
	}

	@Override
	public void maintainingHealth() {
		System.out.println("腹筋100回");
	}

}

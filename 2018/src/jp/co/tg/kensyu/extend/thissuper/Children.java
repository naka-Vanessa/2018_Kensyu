package jp.co.tg.kensyu.extend.thissuper;

public class Children extends Parent{
	protected int age = 10;
	protected String skill = "熱々おでん芸";

	public Children() {
	}

	@Override
	public void show() {
		System.out.println("私は " + this.getClass().getSimpleName());
		System.out.println("年齢 : " + age);
		System.out.println("特技！！  " + skill);
	}
	@Override
	public void show2() {
		System.out.println("show2メソッドなど存在しない。");
	}
}

package jp.co.tg.kensyu.extend.thissuper;

public class Parent {
	protected int age = 30;
	protected String skill = "高速電話帳破り";

	public Parent() {
	}

	public void setSkill(String skill) {
		skill = skill;
//		this.skill = skill;
	}

	public void show() {
		System.out.println("私は " + this.getClass().getSimpleName());
		System.out.println("年齢 : " + age);
		System.out.println("特技！！  " + skill);
	}

	public void show2() {
		System.out.println(age + "才の"+skill + "!!");

	}

}

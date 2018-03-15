package jp.co.tg.kensyu.extend.thissuper;

public class Check {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Children children = new Children();

		System.out.println("--- parent.show ----------------");
		parent.show();
		System.out.println("--- children.show --------------");
		children.show();
	}
}

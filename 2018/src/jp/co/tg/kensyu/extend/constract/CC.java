package jp.co.tg.kensyu.extend.constract;

public class CC extends BB {
	public CC() {
		System.out.println("CC コンストラクタ");
	}
	public CC(int i) {
		super(i,"CC");
		System.out.println("CC int コンストラクタ");
	}
	public CC(String s) {
		System.out.println("CC String コンストラクタ");
	}
	public CC(int i,String s) {
		System.out.println("CC int String コンストラクタ");
	}
}

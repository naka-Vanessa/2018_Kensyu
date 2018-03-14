package jp.co.tg.kensyu.extend.constract;

public class BB extends AA{
	public BB() {
		System.out.println("BB コンストラクタ");
	}
	public BB(int i) {
		System.out.println("BB int コンストラクタ");
	}
	public BB(String s) {
		System.out.println("BB String コンストラクタ");
	}
	public BB(int i,String s) {
		System.out.println("BB int String コンストラクタ");
	}
}

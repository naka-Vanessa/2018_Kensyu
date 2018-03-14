package jp.co.tg.kensyu.capsule.final1;

public final class FinalObject {
	private final int finalInt = 0;
	final String finalString = "";
	final StringBuilder finalStringBuilder;

//	public final FinalObject(){} //これは無理
	public FinalObject() {
		finalStringBuilder = new StringBuilder();
		System.out.println("中の文字列  ：" + finalStringBuilder.toString());

//		finalStringBuilder = new StringBuilder(); //再度代入できないのでエラーになる。

		finalStringBuilder.append("変更できないのは代入のみ");
		System.out.println("中の文字列  ：" + finalStringBuilder.toString());
	}
}
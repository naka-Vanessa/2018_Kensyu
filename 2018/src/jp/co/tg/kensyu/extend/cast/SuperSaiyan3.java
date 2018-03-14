package jp.co.tg.kensyu.extend.cast;

public class SuperSaiyan3 extends SuperSaiyan2{
	@Override
	public void explain() {
		System.out.println(this.getClass().getSimpleName() + " : そしてこれがスーパーサイヤ人３だ");
	}
	public void ss3() {
		System.out.println("ss3");
	}
}

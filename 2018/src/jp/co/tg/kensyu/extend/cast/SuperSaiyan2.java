package jp.co.tg.kensyu.extend.cast;

public class SuperSaiyan2 extends SuperSaiyan{
	@Override
	public void explain() {
		System.out.println(this.getClass().getSimpleName() + " : これがスーパーサイヤ人２だ");
	}
	public void ss2() {
		System.out.println("ss2");
	}

}

package jp.co.tg.kensyu.extend.cast;

public class SuperSaiyan extends Goku{
	@Override
	public void explain() {
		System.out.println(this.getClass().getSimpleName() + " : これがスーパーサイヤ人だ");
	}
	public void ss() {
		System.out.println("ss");
	}

}

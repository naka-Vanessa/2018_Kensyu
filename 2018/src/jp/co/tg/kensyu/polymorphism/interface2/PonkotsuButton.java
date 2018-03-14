package jp.co.tg.kensyu.polymorphism.interface2;


/**
 * ポンコツボタンです。<br>
 * 押してもちゃんとON/OFFが切り替わるかわかりません。<br>
 * @author masaki
 *
 */
public class PonkotsuButton {

	private static PushListener nullImpl = new PushListener() {
		@Override public void pushed(int state) {}
	};

	private PushListener impl = nullImpl;


	/**
	 * ボタンを押されたときの処理を登録します。
	 * @param impl
	 */
	public void setPushListener(PushListener impl) {
		this.impl = impl == null ? nullImpl : impl;
	}

	/**
	 * ボタンを押します。
	 */
	public void push() {
		int state = (int) (Math.random() * 2);
		impl.pushed(state);
	}

	/**
	 * ボタンが押されたときに動作するイベントリスナーです。
	 * @author masaki
	 *
	 */
	public interface PushListener{
		/**
		 * ボタンが押されたときに呼び出されます。
		 * @param state 0 : OFF状態       1 : ON状態
		 */
		void pushed(int state);
	}
}

package jp.co.tg.kensyu.polymorphism.interface2;

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

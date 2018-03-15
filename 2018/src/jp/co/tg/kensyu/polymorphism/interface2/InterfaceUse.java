package jp.co.tg.kensyu.polymorphism.interface2;

public class InterfaceUse {
	public static void main(String[] args){
//		PushListener impl = new InterfaceUse(); //PushListenerをインプリメントしていないのでエラー
		PushListener impl = new PushListenerAdapter(); //PushListenerをインプリメントしているのでOK

//		PushListener impl = new PushListener(); //インスタンスを作れない。
		PushListener impl2 = new PushListener() {
			@Override
			public void pushed(int state) {
				// TODO 自動生成されたメソッド・スタブ

			}
		};


		//「new PushListener()」の後にある『{』からが無名クラスであり、下のような意味となる。
//		class 1 implements PushListener{
//			@Override
//			public void pushed(int state) {
//				// TODO 自動生成されたメソッド・スタブ
//
//			}
//		}
//		PushListener impl2 = new 1();
	}
}

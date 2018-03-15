package jp.co.tg.kensyu.extend.cast;

public class Cast {
	public static void main(String[] args) {
		SuperA	a1	= new SubB();
//		AA	b1 = new A(); これはコンパイルエラーになる。



		SuperA	a2	= new SuperA();
		SubB	b2 = new SubB();

		SuperA 	a3	= b2;
//		SubB	b3 = a2; //これもコンパイルエラー。 a2はA型であり、スーパークラスからのサブクラスへの変換は暗黙的にできない。

		SuperA 	a4 = (SuperA)b2;  // a3変数の定義と同じことをやっている。
		try {
			SubB b4 = (SubB)a2;  //コンパイルエラーにはならないが、動かすと実行時エラー(java.lang.ClassCastException)が発生する。
		}catch(ClassCastException e) {
			e.printStackTrace();
		}

		//どちらも変数の型は同じA型だが…
		a2.thisName("a2");
		a3.thisName("a3");

		//a3の中身は紛れもなくAAクラスのインスタンスであることが分かった。では、a3変数でAAクラスだけに書かれたメソッドを呼び出すことができるか？
//		a3.;

		SubB b5 = (SubB)a3; //正しく動作する。a3にはb2のインスタンスが入っているため。

	}

	public static class SuperA{
		public void thisName(String hennsuu) {
			System.out.println(hennsuu + " : I'm " + this.getClass().getSimpleName());
		}
	}
	public static class SubB extends SuperA{
		public void special() {
			System.out.println("special!!");
		}
	}
}

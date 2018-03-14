package jp.co.tg.kensyu.extend.cast;

public class Cast {
	public static void main(String[] args) {
		A	a1	= new AA();
//		AA	aa1 = new A(); これはコンパイルエラーになる。



		A	a2	= new A();
		AA	aa2 = new AA();

		A 	a3	= aa2;
//		AA	aa3 = a2; これもコンパイルエラー。 a2はA型なのでダメ。

		A 	a4 = (A)aa2;  // a3変数の定義と同じことをやっている。
		try {
			AA aa4 = (AA)a2;  //コンパイルエラーにはならないが、動かすと実行時エラー(java.lang.ClassCastException)が発生する。
		}catch(ClassCastException e) {
			e.printStackTrace();
		}

		//どちらも変数の型は同じA型だが…
		a2.thisName("a2");
		a3.thisName("a3");

		//a3の中身は紛れもなくAAクラスのインスタンスであることが分かった。では、a3変数でAAクラスだけに書かれたメソッドを呼び出すことができるか？
//		a3.;

	}

	public static class A{
		public void thisName(String hennsuu) {
			System.out.println(hennsuu + " : I'm " + this.getClass().getSimpleName());
		}
	}
	public static class AA extends A{
		public void special() {
			System.out.println("special!!");
		}
	}
}

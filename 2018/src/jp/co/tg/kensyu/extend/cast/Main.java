package jp.co.tg.kensyu.extend.cast;

public class Main {
	public static void main(String[] args) {
		Goku goku = null;

		goku = new Goku();
		check(goku);
		System.out.println("-----------------------------------");
		goku = new SuperSaiyan();
		check(goku);
		System.out.println("-----------------------------------");
		goku = new SuperSaiyan2();
		check(goku);
		System.out.println("-----------------------------------");
		goku = new SuperSaiyan3();
		check(goku);
		System.out.println("-----------------------------------");
	}

	public static void check(Goku goku) {
		goku.explain();
		if(goku instanceof SuperSaiyan3) {
			SuperSaiyan3 ss3 = (SuperSaiyan3)goku;
			ss3.ss3();
		}else if(goku instanceof SuperSaiyan2) {
			SuperSaiyan2 ss2 = (SuperSaiyan2)goku;
			ss2.ss2();
		}else if(goku instanceof SuperSaiyan) {
			SuperSaiyan ss = (SuperSaiyan)goku;
			ss.ss();
		}else if(goku instanceof Goku) {
			goku.nomal();
		}
	}
}


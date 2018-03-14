package jp.co.tg.kensyu.polymorphism.abstract2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Card> yama = new ArrayList<>();
		yama.add(new Speade1());
		yama.add(new Clover2());
		yama.add(new Diamond3());
		yama.add(new Heart4());

		System.out.println("--- 1回目 -------------------------");
		Collections.shuffle(yama);
		view(yama);
		System.out.println("--- 2回目 -------------------------");
		Collections.shuffle(yama);
		view(yama);
		System.out.println("--- 3回目 -------------------------");
		Collections.shuffle(yama);
		view(yama);
	}

	public static void view(List<Card> yama) {
		for(Card card : yama) {
			System.out.println(card.getMark() + card.getNumber());
		}
	}
}

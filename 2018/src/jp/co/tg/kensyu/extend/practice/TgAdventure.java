package jp.co.tg.kensyu.extend.practice;

/**
 * TGアドベンチャー
 * @author masaki
 *
 */
public class TgAdventure {
	private int progress = 0;

	public TgAdventure() {
	}

	public void start() {
		doPrologue();
		printProgress();

		doChapter1();
		printProgress();

		doEnding();
		printProgress();

	}

	protected void doPrologue() {
		progress = 100;
	};
	protected void doChapter1() {
		progress = 200;
	};
	protected void doChapter2() {
		progress = 300;
	};
	protected void doEnding() {
		progress = 400;
	}

	protected final void printProgress() {
		System.out.println("進捗 : " + progress);
	}
}

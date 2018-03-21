package jp.co.tg.kensyu.polymorphism.interface3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * パソコン
 * @author masaki
 *
 */
public class PC implements Startable{
	private final String  tag;
	public PC() {
		tag = this.getClass().getSimpleName() + "(serial number " + this.hashCode() +")";
	}
	@Override
	public void start() {
		System.out.println(tag + " : ピッ....");
		System.out.println(tag + " : タスクを開始します。");
		ExecutorService executor = Executors.newCachedThreadPool();
		List<Future<?>> list = new ArrayList<>();
		list.add(executor.submit(task1()));
		list.add(executor.submit(task2()));

		for(Future<?> f : list) {
			try {
				f.get();
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}

	private Runnable task1() {
		return new Runnable() {
			@Override
			public void run() {
				String taskName = "タスク１";
				String[] numbers = new String[] {"1","2","3","4","5","6","7","8","9","10"};
				System.out.println(tag + "@" + taskName + " : start");
				try {
					for(String number : numbers) {
						System.out.println(tag + "@" + taskName + " : " + number);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					System.out.println(tag + "@" + taskName + " : エラーが発生しました。");
					e.printStackTrace();
				}
			}
		};
	}

	private Runnable task2() {
		return new Runnable() {
			@Override
			public void run() {
				String taskName = "タスク2";
				String[] characters = new String[] {"a","b","c","d","e","f","g","h","i","j"};
				System.out.println(tag + "@" + taskName + " : start");
				try {
					for(String number : characters) {
						System.out.println(tag + "@" + taskName + " : " + number);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					System.out.println(tag + "@" + taskName + " : エラーが発生しました。");
					e.printStackTrace();
				}
			}
		};
	}
}

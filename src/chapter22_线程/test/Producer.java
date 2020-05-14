package chapter22_Ïß³Ì.test;

import java.util.Random;

public class Producer extends Thread {
	private Shop shop;

	public Producer(Shop shop) {
		super();
		this.shop = shop;
	}

	@Override
	public void run() {
		while (true) {
			try {
				shop.produce();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

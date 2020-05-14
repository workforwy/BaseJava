package chapter22_Ïß³Ì.test;

import java.util.Random;

public class Custmer extends Thread {
	private Shop shop;

	public Custmer(Shop shop) {
		super();
		this.shop = shop;
	}

	@Override
	public void run() {
		while(true){
			try {
				shop.consume();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}	
			try {
				Thread.sleep(new Random().nextInt(2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

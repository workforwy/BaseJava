package c22_thread.pack1;

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
                Thread.sleep(new Random().nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

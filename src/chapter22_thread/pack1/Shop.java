package chapter22_thread.pack1;

public class Shop {
    public int goodCount = 0;
    public int goodMaxCount = 5;

    public synchronized void produce() throws InterruptedException {
        if (goodCount < goodMaxCount) {
            notify();
            goodCount++;
            System.out.println("生产了商品,当前库存是:" + goodCount);
        } else {
            wait();
            System.out.println("商品达到上限,暂停生产商品......");
        }
    }

    public synchronized void consume() throws InterruptedException {
        if (goodCount > 0) {
            notify();
            goodCount--;
            System.out.println("商品被购买了,当期库存是:" + goodCount);
        } else {
            System.out.println("商品已经卖完,明日请早......");
            wait();
        }
    }
}

package chapter22_thread.pack1;

public class Shop {
    public int goodCount = 0;
    public int goodMaxCount = 5;

    public synchronized void produce() throws InterruptedException {
        if (goodCount < goodMaxCount) {
            notify();
            goodCount++;
            System.out.println("��������Ʒ,��ǰ�����:" + goodCount);
        } else {
            wait();
            System.out.println("��Ʒ�ﵽ����,��ͣ������Ʒ......");
        }
    }

    public synchronized void consume() throws InterruptedException {
        if (goodCount > 0) {
            notify();
            goodCount--;
            System.out.println("��Ʒ��������,���ڿ����:" + goodCount);
        } else {
            System.out.println("��Ʒ�Ѿ�����,��������......");
            wait();
        }
    }
}

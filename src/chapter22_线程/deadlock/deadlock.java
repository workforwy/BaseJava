package chapter22_线程.deadlock;

public class deadlock extends Thread {

    public static Object key1 = new Object();
    public static Object key2 = new Object();
    public static int flag;

    @Override
    public void run() {
        if (flag == 0) {
            synchronized (key1) {
                System.out.println(getName() + "锁住了key1");
                try {
                    deadlock.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (key2) {
                    System.out.println(getName() + "锁住了key2");
                }
            }
        } else {
            synchronized (key2) {
                System.out.println(getName() + "锁住了key2");
                try {
                    deadlock.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (key1) {
                    System.out.println(getName() + "锁住了key1");
                }
            }
        }
    }
}

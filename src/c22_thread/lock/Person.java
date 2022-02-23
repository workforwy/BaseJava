package c22_thread.lock;

public class Person extends Thread {
    public Object lock = new Object();

    @Override
    public void run() {

        System.out.println(getName() + "现在开始取钱了");
        synchronized (Account.lock) {
            if (Account.account >= 8000) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Account.account -= 8000;
                System.out.println(getName() + "取钱成功,余额是" + Account.account);
            } else {
                System.out.println(getName() + "取钱失败,余额是" + Account.account);
            }
        }
    }
}

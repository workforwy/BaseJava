package c22_thread.lock;

public class Person extends Thread {
    public Object lock = new Object();

    @Override
    public void run() {

        System.out.println(getName() + "���ڿ�ʼȡǮ��");
        synchronized (Account.lock) {
            if (Account.account >= 8000) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Account.account -= 8000;
                System.out.println(getName() + "ȡǮ�ɹ�,�����" + Account.account);
            } else {
                System.out.println(getName() + "ȡǮʧ��,�����" + Account.account);
            }
        }
    }
}

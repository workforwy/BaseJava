package chapter22_thread.test;
/**
 * �����ߺ������ߵĹ�ϵ
 * 
 * @author 1
 *
 */
public class Test {

	public static void main(String[] args) {

		Shop shop = new Shop();
		Custmer custmer = new Custmer(shop);
		Producer producer = new Producer(shop);

		custmer.start();
		producer.start();
	}

}
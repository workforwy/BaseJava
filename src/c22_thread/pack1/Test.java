package c22_thread.pack1;
/**
 * 生产者和消费者的关系
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

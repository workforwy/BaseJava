package c22_thread.lock;

public class Test {
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		Person d = new Person();

		a.start();
		b.start();
		c.start();
		d.start();
	}
}

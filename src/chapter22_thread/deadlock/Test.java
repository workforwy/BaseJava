package chapter22_thread.deadlock;

public class Test {
	public static void main(String[] args) {

		deadlock d1 = new deadlock();
		deadlock d2 = new deadlock();

		d1.start();
		d2.start();
	}
}

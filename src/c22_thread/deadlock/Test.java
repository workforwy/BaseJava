package c22_thread.deadlock;

public class Test {
	public static void main(String[] args) {

		Deadlock d1 = new Deadlock();
		Deadlock d2 = new Deadlock();

		d1.start();
		d2.start();
	}
}

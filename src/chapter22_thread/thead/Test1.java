package chapter22_thread.thead;

public class Test1 {
	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		for (long i = 0; i < 1000000000; i++) {
		}
		long b = System.currentTimeMillis();
		System.out.println(b - a);
	}
}

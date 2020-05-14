package chapter22_thread.thead;

public class ThreadSample {
	public static void main(String[] args) {
		LoopThread thread = new LoopThread();
		LoopRunner runner = new LoopRunner();
		Thread thread2 = new Thread(runner);
		thread.start();
		thread2.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main->" + i);
		}
	}
}

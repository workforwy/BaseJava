package chapter22_thread.thead;

public class LoopRunner implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runnable->" + i);
		}
	}
}

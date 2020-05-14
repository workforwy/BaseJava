package chapter22_thread.thead;

public class LoopThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("LoopThread->" + i);
		}
	}
}

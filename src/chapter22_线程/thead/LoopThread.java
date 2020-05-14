package chapter22_Ïß³Ì.thead;

public class LoopThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("LoopThread->" + i);
		}
	}
}

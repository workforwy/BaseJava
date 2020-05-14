package chapter07_¼Ì³Ð.transformer;

public class Sword implements Weapon{
	@Override
	public void kill() {
		System.out.println("Ë£½£");
	}
	@Override
	public String getName() {
		return "ÒÐÌì½£";
	}
	@Override
	public int getType() {
		return 1;
	}	
}

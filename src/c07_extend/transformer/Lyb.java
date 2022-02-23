package c07_extend.transformer;

public class Lyb implements Weapon{

	@Override
	public void kill() {
		System.out.println("»Ó°ô");
	}

	@Override
	public String getName() {
		return "ÀÇÑÀ°ô";
	}

	@Override
	public int getType() {
		return 3;
	}

}

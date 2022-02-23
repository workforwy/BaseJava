package c07_extend.transformer;

public class AK47 implements Weapon{

	@Override
	public void kill() {
		System.out.println("¿ªÇ¹");
	}

	@Override
	public String getName() {
		return "AK47";
	}
 
	@Override
	public int getType() {
		return 2;
	}
}

package c07_extend.transformer;

public class Lyb implements Weapon{

	@Override
	public void kill() {
		System.out.println("�Ӱ�");
	}

	@Override
	public String getName() {
		return "������";
	}

	@Override
	public int getType() {
		return 3;
	}

}

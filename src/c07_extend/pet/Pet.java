package c07_extend.pet;

public abstract class Pet {
	String name;
	int hungry;
	int happy;

	public void feed() {
		System.out.println("��" + name + "ιʳ");
		hungry -= 10;
	}

	public void play() {
		System.out.println("��" + name + "��ˣ");
		hungry += 10;
		happy += 10;
	}

	public void punish() {
		System.out.println("��" + name + "��PP");
		happy -= 10;
		// ִ��������ʵ�ֵķ���
		cry();
	}

	public void cry() {

	}
}

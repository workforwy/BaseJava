package chapter06_object.dog;

public class Test {
	public static void main(String[] args) {
		Dog b = new Dog();

		b.name = "С����";
		b.happy = 100;
		b.hungry = 50;
		System.out.println("b�Ļ��ֶ���:" + b.happy + "  �������ǣ�" + b.hungry);
		b.feed();
		b.punish();
		b.play();
	}
}

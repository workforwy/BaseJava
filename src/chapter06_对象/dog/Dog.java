package chapter06_����.dog;

//��װ�� ��Ա�����������ԡ�������װ��һ���������
public class Dog {
	String name;
	int hungry;
	int happy;

	public void feed() {
		System.out.println("��" + name + "ιʳ");
		hungry -= 10;
		System.out.println("������Ϊ" + hungry);
	}

	public void play() {
		System.out.println("��" + name + "��ˣ");
		happy += 10;
		System.out.println("���ֶ�Ϊ" + happy);
	}

	public void punish() {
		System.out.println("��" + name + "ƨƨ");
		happy -= 10;
		System.out.println("���ֶ�Ϊ" + happy);
	}
}

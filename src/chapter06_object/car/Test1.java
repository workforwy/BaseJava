package chapter06_object.car;

public class Test1 {
	public static void main(String[] args) {
		// �½�car���󸳸�����a
		Car a = new Car("��ɫ", "��ʱ��", 200);// �Ծֲ�������ֵ����
		Car b = new Car("��ɫ", "��������", 250);
		// ��a������ִ��go��������
		a.go();
		b.go();
		a.stop();
		b.stop();
	}

}

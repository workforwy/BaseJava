package chapter06_object.soldier;

public class Test1 {
	public static void main(String[] args) {
		//�½�һ��soldier����  ��ʼ������
		Soldier a=new Soldier();
		Soldier b=new Soldier();
		//��a��b�ҵ���һ��ʿ��������ڴ�ռ䣬��������id����������
		a.id=9527;
		b.id=9528;
		//��a�ҵ���һ��ʿ��������ִ��go�ȳ�Ա����
		a.go();
		a.standby();
		b.attcak();
		b.attcak();
		b.attcak();
		b.attcak();
		b.attcak();
		b.attcak();
	}
}

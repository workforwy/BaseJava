package chapter06_object.soldier;

import java.util.Random;

/*
 * ��װ��
 * ��������ԡ��������
 * ��װ��һ�������
 */
public class Soldier {// ���Ա�������Ա����
	int id;// ��Ա������Ĭ��ֵ
	int blood = 100;// ��Ա�������Ը�ֵ
	static int count;// ��̬��Ա����countʿ������d����

	public Soldier() {// ���췽��Soldier
		System.out.println("�½���һ��ʿ������");
		Soldier.count++;
		System.out.println("Ŀǰ����" + count + "��ʿ��");
	}

	// ��Ա���� go standby attack
	public void go() {
		System.out.println(id + "��ʿ��ǰ��");
	}

	public void standby() {
		System.out.println(id + "��ʿ������");
	}

	public void attcak() {
		if (blood == 0) {
			System.out.println("����" + id + "��ʿ����ʬ��");
			return;
		}
		System.out.println(id + "��ʿ������");
		int b = new Random().nextInt(10);
		if (blood < b) {// Ѫ������ʱ���ж��ټ�����
			b = blood;
		}
		blood -= b;// ������BѪ����Ѫ
		System.out.println("��Ѫ��" + b);
		System.out.println("��ǰѪ����" + blood);
		if (blood == 0) {
			System.out.println(id + "��ʿ������");
			Soldier.count--;
			System.out.println("Ŀǰ����" + count + "��ʿ��");
		}
	}
}

package chapter06_object.soldier;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/*
		 * �½����Soldier ��������� �������ÿһ��λ�ã���һ���´�����ʿ������ һ�δδӱ����⼸��ʿ�����������ǵĽ���������
		 * ֱ������ʿ������Ϊֹ
		 */
		System.out.println("��һ�̿���������ʿ�������ǣ�");
		int n = new Scanner(System.in).nextInt();
		Soldier[] a = new Soldier[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Soldier();
			a[i].id = 1 + i;
		}
		while (Soldier.count > 0) {
			for (int i = 0; i < a.length; i++) {
				a[i].attcak();
			}
		}
	}
}

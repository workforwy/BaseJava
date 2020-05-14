package chapter05_sort.day0507;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int[] a = random();
		System.out.println(Arrays.toString(a));
		System.out.println("===========================");
		sort(a);
		System.out.println("===========================");
		System.out.println(Arrays.toString(a));
	}

	/**
	 * 1.����[5,11����Χ�ĳ��ȸ���len 2.�½�len���ȵ����鸳��a 3.��������a 4.��ÿ��λ�÷���100�ڵ������ ��������a
	 */
	private static int[] random() {
		int len = 5 + new Random().nextInt(9);
		int[] a = new int[len];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	/**
	 * 1.ѭ��i��1��a.length 2.ѭ��j��i-1��>=0�ݼ� 3.���a[j+1]<a[j] 4.������λ�õ�ֵ 5.���� break
	 * 6.jѭ����������ʾ����a
	 */
	private static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] > a[j + 1]) {
					int c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				} else {
					break;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}

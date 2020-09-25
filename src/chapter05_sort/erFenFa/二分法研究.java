package chapter05_sort.erFenFa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ���ַ��о� {
	public static void main(String[] args) {
		int[] a = random();// ������������
		Arrays.sort(a);// ����������
		System.out.println(Arrays.toString(a));// ��ӡ���кõ�����
		System.out.println("������ҵ�ֵ��");// ������ҵ�ֵ
		int t = new Scanner(System.in).nextInt();// �����������ֵ
		int index = binarySearch(a, t); // ���ַ�����
		System.out.println(index);// ��ӡ�����ַ����к������
	}

	private static int[] random() {
		int len = 5 + new Random().nextInt(6);// �涨�������ȡֵ��ΧΪ5��11
		int[] a = new int[len];// ����aΪ�涨��Χ�ڵ�����ֵ
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);// �������a����ĵ�iλΪ��0��100��ѡȡ�������
		}
		return a;// ����a��ֵ
	}

	private static int binarySearch(int[] a, int t) {
		int lo = 0;// ������СֵΪ0
		int hi = a.length - 1;// �������ֵΪ����a�ĳ���-1
		int mid;// ����mid��ֵ
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (a[mid] < t) {
				lo = mid + 1;
			} else if (a[mid] > t) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -(lo + 1);// ��lo>hiʱ��ֱ�ӷ��ص�ֵ
	}
}

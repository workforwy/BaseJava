package c05_sort.maopao;

import java.util.Arrays;
import java.util.Random;

public class 冒号排序研究 {
	public static void main(String[] args) {
		int[] a = random();// 获得一个随机数组
		System.out.println(Arrays.toString(a));// 打印数组a
		System.out.println("===============================");
		sort(a);// 对数组排序
		System.out.println("===============================");
		System.out.println(Arrays.toString(a));// 打印排序完成的数组
	}

	private static int[] random() {
		int len = 5 + new Random().nextInt(6);
		int[] a = new int[len];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int c = a[j - 1];
					a[j - 1] = a[j];
					a[j] = c;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
	}

}

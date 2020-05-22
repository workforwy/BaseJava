package chapter05_sort.maopao;

import java.util.Arrays;
import java.util.Random;

public class √∞∫≈≈≈–Ú {
	public static void main(String[] args) {
		int[] a = random();
		System.out.println(Arrays.toString(a));
		System.out.println("==================");
		sort(a);
		System.out.println("==================");
		System.out.println(Arrays.toString(a));
	}

	private static int[] random() {
		// TODO Auto-generated method stub
		int len = 5 + new Random().nextInt(6);
		int[] a = new int[len];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 00; i < a.length; i++) {
			boolean flag = false;
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int c = a[j];
					a[j] = a[j - 1];
					a[j - 1] = c;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
	}
}

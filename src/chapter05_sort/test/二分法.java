package chapter05_sort.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 二分法 {
	public static void main(String[] args) {
		int[] a = random();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("输入查找的值");
		int t = new Scanner(System.in).nextInt();
		int index = binarySearch(a, t);
		System.out.println(index + 1);
	}

	private static int[] random() {
		int len = 5 + new Random().nextInt(6);
		int[] a = new int[len];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static int binarySearch(int[] a, int t) {
		int lo = 0;
		int hi = a.length - 1;
		int mid;
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
		return -(lo + 1);
	}
}

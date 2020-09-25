package chapter05_sort.erFenFa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 二分法研究 {
	public static void main(String[] args) {
		int[] a = random();// 产生乱序数组
		Arrays.sort(a);// 对数组排序
		System.out.println(Arrays.toString(a));// 打印排列好的数组
		System.out.println("输入查找的值：");// 输入查找的值
		int t = new Scanner(System.in).nextInt();// 定义新输入的值
		int index = binarySearch(a, t); // 二分法查找
		System.out.println(index);// 打印经二分法排列后的数组
	}

	private static int[] random() {
		int len = 5 + new Random().nextInt(6);// 规定在数组的取值范围为5到11
		int[] a = new int[len];// 数组a为规定范围内的数组值
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);// 随机定义a数组的第i位为从0到100内选取的随机数
		}
		return a;// 返回a的值
	}

	private static int binarySearch(int[] a, int t) {
		int lo = 0;// 定义最小值为0
		int hi = a.length - 1;// 定义最大值为数组a的长度-1
		int mid;// 定义mid的值
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
		return -(lo + 1);// 当lo>hi时，直接返回的值
	}
}

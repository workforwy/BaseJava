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
	 * 1.产生[5,11）范围的长度赋给len 2.新建len长度的数组赋给a 3.遍历数组a 4.在每个位置放入100内的随机数 返回数组a
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
	 * 1.循环i从1到a.length 2.循环j从i-1到>=0递减 3.如果a[j+1]<a[j] 4.交换两位置的值 5.否则 break
	 * 6.j循环结束后显示数组a
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

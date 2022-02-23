package c05_sort.digui;

import java.util.Scanner;

public abstract class Test1 {
	public static void main(String[] args) {
		System.out.println("输入整数求阶乘");
		int n = new Scanner(System.in).nextInt();
		long r = f(n);
		System.out.println(r);
	}

	public static long f(int n) {
		System.out.println(n);
		if (n == 0) {
			return 1;
		}

		return n * f(n - 1);
	}
}

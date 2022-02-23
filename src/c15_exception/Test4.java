package c15_exception;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		while (true) {
			try {
				f();
				break;
			} catch (Exception e) {
				System.out.println("老头子，他又错了");
			} finally {
				System.out.println("不论出错，都会执行");
			}
		}
	}

	private static void f() {
		System.out.println("输入,隔开两个整数");
		String s = new Scanner(System.in).nextLine();
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
	}
}

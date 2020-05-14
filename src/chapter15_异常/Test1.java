package chapter15_异常;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入两个浮点数：");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double c = divide(a, b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("老头子，他又错了");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static double divide(double a, double b) throws RuntimeException {
		if (b == 0) {
			ArithmeticException e = new ArithmeticException("/ by zero");
			throw e;// 执行抛出动作
		}
		return a / b;
	}
}

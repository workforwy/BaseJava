package chapter15_�쳣;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double c = divide(a, b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("��ͷ�ӣ����ִ���");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static double divide(double a, double b) throws RuntimeException {
		if (b == 0) {
			ArithmeticException e = new ArithmeticException("/ by zero");
			throw e;// ִ���׳�����
		}
		return a / b;
	}
}

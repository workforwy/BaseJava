package chapter11_��װ��;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * �����ֶ���
 * 
 * @author WY
 *
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("����������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();

		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println("--------------------------------------");

		BigDecimal bd1 = BigDecimal.valueOf(a);
		BigDecimal bd2 = BigDecimal.valueOf(b);
		BigDecimal bd3;

		bd3 = bd1.add(bd2);
		System.out.println(a + "+" + b + "=" + bd3.doubleValue());
		bd3 = bd1.subtract(bd2);
		System.out.println(a + "-" + b + "=" + bd3.doubleValue());
		bd3 = bd1.multiply(bd2);
		System.out.println(a + "*" + b + "=" + bd3.doubleValue());
		bd3 = bd1.divide(bd2, 10, BigDecimal.ROUND_HALF_UP);// ����10λС�������һλ����
		System.out.println(a + "/" + b + "=" + bd3.doubleValue());

	}

	/**
	 * ����С���㼸
	 */
	private static void fun2() {
		System.out.println("���븡������");
		double a = new Scanner(System.in).nextDouble();

		BigDecimal bd = BigDecimal.valueOf(a);

		bd = bd.setScale(3, BigDecimal.ROUND_HALF_UP);// ��������3λС��
		System.out.println(bd.doubleValue());
	}
}

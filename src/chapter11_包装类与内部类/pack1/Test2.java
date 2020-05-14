package chapter11_包装类;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 大数字对象
 * 
 * @author WY
 *
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入两个浮点数：");
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
		bd3 = bd1.divide(bd2, 10, BigDecimal.ROUND_HALF_UP);// 保留10位小数，最后一位五入
		System.out.println(a + "/" + b + "=" + bd3.doubleValue());

	}

	/**
	 * 保留小数点几
	 */
	private static void fun2() {
		System.out.println("输入浮点数：");
		double a = new Scanner(System.in).nextDouble();

		BigDecimal bd = BigDecimal.valueOf(a);

		bd = bd.setScale(3, BigDecimal.ROUND_HALF_UP);// 保留到第3位小数
		System.out.println(bd.doubleValue());
	}
}

package c01;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 数字运算
 * 大数字对象之间的运算
 */
public class Test4 {
	public static void main(String[] args) {
		/*
		 * 1.提示“输入时间（秒）：”
		 * 2.获得输入的值赋给变量t
		 * 3.套公式求出降落距离赋给d
		 * 4.显示d的值
		 */
		System.out.println("输入时间（秒）：");
		double t = new Scanner(System.in).nextDouble();
		double d = 0.5 * 9.8 * t * t;
		System.out.println(d);
		System.out.println(BigDecimal.valueOf(d));

		System.out.println("==============================");
		BigDecimal bd1 = BigDecimal.valueOf(0.5);
		BigDecimal bd2 = BigDecimal.valueOf(9.8);
		BigDecimal bd3 = BigDecimal.valueOf(t);
		BigDecimal bd4;
		bd4 = bd1.multiply(bd2).multiply(bd3).multiply(bd3);
		System.out.println(bd4.doubleValue());
	}
}




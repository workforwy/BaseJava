package c01;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * ��������
 * �����ֶ���֮�������
 */
public class Test4 {
	public static void main(String[] args) {
		/*
		 * 1.��ʾ������ʱ�䣨�룩����
		 * 2.��������ֵ��������t
		 * 3.�׹�ʽ���������븳��d
		 * 4.��ʾd��ֵ
		 */
		System.out.println("����ʱ�䣨�룩��");
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




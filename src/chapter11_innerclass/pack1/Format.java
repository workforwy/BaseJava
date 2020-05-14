package chapter11_innerclass.pack1;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

/**
 * ���ֶ����ʽ��
 * 
 * @author WY
 *
 */
public class Format {
	public static void main(String[] args) throws ParseException {

		System.out.println("��������:");
		double a = new Scanner(System.in).nextDouble();

		DecimalFormat f = new DecimalFormat("\u00a4###,###.0000");
		String s = f.format(a);
		System.out.println(s);
		System.out.println("==============================");

		Number n = f.parse(s);
		double d = n.doubleValue();
		System.out.println(d);
	}
}

package c09_string.string;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("������ģ�");
		String s = new Scanner(System.in).nextLine();

		boolean b = huiwen(s);
		System.out.println("�Ƿ���ģ�" + b);
	}

	/**
	 * �����ж�
	 * �±����i �±����j 1.i��0��j��s.length-1��i<j) 2.���iλ���ַ���jλ���ַ�����ȣ�����false 3.����true
	 */
	static boolean huiwen(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}

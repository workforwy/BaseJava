package c10_regex;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("�ؼ����б�,     �ö��š��ֺŻ�ո������");
		String s = new Scanner(System.in).nextLine();
		/*
		 * [,; ]+
		 * +�ſ�����һ����Ҳ�����ж��
		 */
		String[] a = s.split("[,; .]+");
		for (String value : a) {
			System.out.println(value);
		}
	}
}

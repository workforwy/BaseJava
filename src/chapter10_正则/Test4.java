package tarena.day1302;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("�ؼ����б�,�ö��š��ֺŻ�ո������");
		String s = new Scanner(System.in).nextLine();
		/*
		 * [,; ]+
		 */
		String[] a = s.split("[,; ]+");// +�ſ�����һ����Ҳ�����ж��
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

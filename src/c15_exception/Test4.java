package c15_exception;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		while (true) {
			try {
				f();
				break;
			} catch (Exception e) {
				System.out.println("��ͷ�ӣ����ִ���");
			} finally {
				System.out.println("���۳�������ִ��");
			}
		}
	}

	private static void f() {
		System.out.println("����,������������");
		String s = new Scanner(System.in).nextLine();
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
	}
}

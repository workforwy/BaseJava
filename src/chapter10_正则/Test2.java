package chapter10_����;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("����");
		String s = new Scanner(System.in).nextLine();
		/*
		 * \d{15}| \d{15}|\d{17}[\dxX] "\��Ҫ\��ת��" \\d{15}|\\d{17}[\\dxX]
		 */
		String regex = "\\d{15}|\\d{17}[\\dxX]";
		if (s.matches(regex)) {// �жϵ�ǰ�ַ������ܷ���������ʽƥ��
			System.out.println("��ʽ��ȷ");
		} else {
			System.out.println("��ʽ����");
		}
	}
}

package chapter09_string.string;

import java.util.Scanner;

/**
 * @author wangyong
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("����email��");
		String s = new Scanner(System.in).nextLine();
		String n = getName(s);
		System.out.println(n);
	}

	/**
	 * ��ȡ���ֲ��� �ҵ�@�����±��λ�ø���index ���index==-1 �����ء���ʽ���� ��ȡ[0,index)���Ӵ�����name
	 * ����name
	 */
	private static String getName(String email) {
		int index = email.indexOf("@");
		if (index == -1) {
			return "��ʽ����";
		}
		return email.substring(0, index);
	}
}

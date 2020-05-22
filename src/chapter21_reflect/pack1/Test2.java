package chapter21_reflect.pack1;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		
		System.out.println("����������");
		String s = new Scanner(System.in).nextLine();
		Class c = Class.forName(s);
		Object a = null;
		Object b = null;
		
		try {
			// �޲ι��췽����������
			a = c.newInstance();
		} catch (Exception e) {
			System.out.println("�������޲ι��췽��");
		}
		try {
			// ����int�����ĵĹ��췽��
			Constructor con = c.getConstructor(int.class);
			b = con.newInstance(10);
		} catch (Exception e) {
			System.out.println("������int�������췽��");
		}
		
		System.out.println(a);
		System.out.println(b);
	}
}

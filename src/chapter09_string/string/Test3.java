package chapter09_string.string;

public class Test3 {
	public static void main(String[] args) {
		String s = "   abc   abc     abc     ";
		System.out.println(s);
		System.out.println("1.3λ�õ��ַ�:" + s.charAt(3));
		System.out.println("2.���д��" + s.toUpperCase());
		System.out.println("3.����:" + s.length());
		System.out.println("4.��xyz�ȴ�С:" + s.compareTo("   x,y,z  "));
		System.out.println("5.�Ƿ���abc��ͷ:" + s.startsWith("abc"));
		System.out.println("6.�Ƿ���abc��β:" + s.endsWith("abc"));
		System.out.println("7.��һ��bc����ʼλ��:" + s.indexOf("bc"));
		System.out.println("8.3λ�������bc:" + s.indexOf("bc", 3));
		System.out.println("9.�Ӻ���ǰ��bc:" + s.lastIndexOf("bc"));
		System.out.println("10.�Ҳ����ڵ��Ӵ�:" + s.indexOf("xxx"));
		System.out.println("11.��a�滻��-:" + s.replace('a', '-'));
		System.out.println("12.��ȡ6��ĩβ��λ��:" + s.substring(6));
		System.out.println("13.��ȡ6��10��λ��:" + s.substring(6, 10));
		System.out.println("14.ȥ�����˿հ��ַ���" + s.trim());
	}
}

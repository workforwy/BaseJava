package chapter09_string.string;

public class Test1 {
	public static void main(String[] args) {
		char[] a = { 'h', 'e', 'l', 'l', 'o' };
		String s1 = new String(a);
		String s2 = "hello";// �����ط����ڴ�
		String s3 = "hello";// ���ʳ������д��ڵĶ���

		System.out.println(s1.equals(s2));// ��д��equals����
		System.out.println(s2.equals(s3));// �ַ����Ƚ�һ��Ƚ�������equal��˫��һ��Ƚ��ڴ��ַ
		System.out.println(s1 == s2);// ������ͬ������ַ��ͬ
		System.out.println(s2 == s3);
	}
}

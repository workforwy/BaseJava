package chapter11_��װ��;

/**
 * ��װ��
 * 
 * @author WY
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Integer a = new Integer(230);
		Integer b = Integer.valueOf(230); // -128��127��Χ���Ƿ��ʻ����ַ
		Integer c = Integer.valueOf(230);// ���ڷ�Χ�����½�����ַ��ͬ

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("---------------------");

		System.out.println(a == b);// �Ƚ��ڴ��ַ
		System.out.println(b == c);
		System.out.println(a.equals(b));// �Ƚ�����
		System.out.println("---------------------");

		System.out.println(a.byteValue());
		System.out.println(a.shortValue());
		System.out.println(a.intValue());
		System.out.println(a.longValue());
		System.out.println(a.doubleValue());
		System.out.println("---------------------");

		System.out.println(Integer.parseInt("255"));//
		System.out.println(Integer.parseInt("11111111", 2));// �����ƽ�����int����
		System.out.println(Integer.parseInt("377", 8));// 8���ƽ�����int����
		System.out.println(Integer.parseInt("ff", 16));// 16���ƽ�����int����
		System.out.println("---------------------");

		System.out.println(Integer.toBinaryString(255));// ת��������
		System.out.println(Integer.toOctalString(255));// ת���˽���
		System.out.println(Integer.toHexString(255));// ת��ʮ������
	}
}

package chapter11_包装类;

/**
 * 包装类
 * 
 * @author WY
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Integer a = new Integer(230);
		Integer b = Integer.valueOf(230); // -128到127范围内是访问缓存地址
		Integer c = Integer.valueOf(230);// 大于范围外是新建，地址不同

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("---------------------");

		System.out.println(a == b);// 比较内存地址
		System.out.println(b == c);
		System.out.println(a.equals(b));// 比较内容
		System.out.println("---------------------");

		System.out.println(a.byteValue());
		System.out.println(a.shortValue());
		System.out.println(a.intValue());
		System.out.println(a.longValue());
		System.out.println(a.doubleValue());
		System.out.println("---------------------");

		System.out.println(Integer.parseInt("255"));//
		System.out.println(Integer.parseInt("11111111", 2));// 二进制解析成int类型
		System.out.println(Integer.parseInt("377", 8));// 8进制解析成int类型
		System.out.println(Integer.parseInt("ff", 16));// 16进制解析成int类型
		System.out.println("---------------------");

		System.out.println(Integer.toBinaryString(255));// 转换二进制
		System.out.println(Integer.toOctalString(255));// 转换八进制
		System.out.println(Integer.toHexString(255));// 转换十六进制
	}
}

package chapter09_string.string;

public class Test1 {
	public static void main(String[] args) {
		char[] a = { 'h', 'e', 'l', 'l', 'o' };
		String s1 = new String(a);
		String s2 = "hello";// 常量池分配内存
		String s3 = "hello";// 访问常量池中存在的对象

		System.out.println(s1.equals(s2));// 重写了equals方法
		System.out.println(s2.equals(s3));// 字符串比较一般比较内容用equal，双等一般比较内存地址
		System.out.println(s1 == s2);// 内容相同，但地址不同
		System.out.println(s2 == s3);
	}
}

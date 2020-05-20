package chapter01;

public class Test1 {
	public static void main(String[] args) {
		int i = 6;
		int j = 9;
		while (i-- > 3) {
			--j;
		}
		System.out.println(j);
	}
	int n = new Scanner(System.in).nextInt();
	byte[] a = intToBytes(n);

        System.out.println(Arrays.toString(a));
	int r = byteToInt(a);
        System.out.println(r);
}

	static byte[] intToBytes(int i) {
		byte[] a = new byte[4];
		a[0] = (byte) (i >> 24);
		a[1] = (byte) (i >> 16);
		a[2] = (byte) (i >> 8);
		a[3] = (byte) (i >> 0);
		return a;
	}

	static int byteToInt(byte[] a) {
		int r = 0;
		r |= a[0] << 24 >>> 0;
		r |= a[1] << 24 >>> 8;
		r |= a[2] << 24 >>> 16;
		r |= a[3] << 24 >>> 24;
		return r;
	}
}


/**
 * 位移运算
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("输入整数：");
		int n = new Scanner(System.in).nextInt();
		/*
		 * 1.n向右移动24位再强转成byte赋b1
		 * 2.n向右移动16位再强转成byte赋b2
		 * 3.n向右移动8位再强转成byte赋b3
		 * 4.n向右移动0位再强转成byte赋b4
		 */
		byte b1 = (byte) (n >> 24);
		byte b2 = (byte) (n >> 16);
		byte b3 = (byte) (n >> 8);
		byte b4 = (byte) (n >> 0);
		System.out.println(b4);
		System.out.println(b3);
		System.out.println(b2);
		System.out.println(b1);
		/*
		 * 0.定义变量r=0
		 * 1.b1向左移动24位再不带符号右移0位，再与r求位或，结果重新赋给r
		 * 2.b1向左移动24位再不带符号右移8位，再与r求位或，结果重新赋给r
		 * 3.b1向左移动24位再不带符号右移16位，再与r求位或，结果重新赋给r
		 * 4.b1向左移动24位再不带符号右移24位，再与r求位或，结果重新赋给r
		 */
		int r = 0;
		r = r | (b1 << 24 >>> 0);
		r = r | (b2 << 24 >>> 8);
		r = r | (b3 << 24 >>> 16);
		r = r | (b4 << 24 >>> 24);
		System.out.println(r);
	}
}


/**
 * 数字运算
 * 大数字对象之间的运算
 */
public class Test4 {
	public static void main(String[] args) {
		/*
		 * 1.提示“输入时间（秒）：”
		 * 2.获得输入的值赋给变量t
		 * 3.套公式求出降落距离赋给d
		 * 4.显示d的值
		 */
		System.out.println("输入时间（秒）：");
		double t = new Scanner(System.in).nextDouble();
		double d = 0.5 * 9.8 * t * t;
		System.out.println(d);
		System.out.println(BigDecimal.valueOf(d));

		System.out.println("==============================");
		BigDecimal bd1 = BigDecimal.valueOf(0.5);
		BigDecimal bd2 = BigDecimal.valueOf(9.8);
		BigDecimal bd3 = BigDecimal.valueOf(t);
		BigDecimal bd4;
		bd4 = bd1.multiply(bd2).multiply(bd3).multiply(bd3);
		System.out.println(bd4.doubleValue());
	}
}


	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 97;
		char c5 = '\u0061';
		// char类型16进制前缀
		char c3 = '中';
		char c4 = 20013;
		// 整数16进制前缀
		char c6 = 0x4e2d;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c5);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c6);
	}

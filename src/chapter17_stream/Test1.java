package tare.day1802;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * 1.创建outputstream对象 2.利用第一步创建的对象，写入一些内容 3.写入单独的数字 4.写入byte[]
		 */
		OutputStream os = new FileOutputStream("d:/abc/f3", false);// true会追加新内容，false会覆盖原内容
		os.write(97);
		os.write(98);
		os.write(99);
		os.write(356);
		byte[] bytes = new byte[] { 101, 102, 103, 104 };
		os.write(bytes);// 写入数组bytes[]
		String str = "我是中国人";
		byte[] strbyte = str.getBytes();// 把一个字符串转换成byte[]
		os.write(strbyte);
		os.close();

		InputStream in = new FileInputStream("d:/abc/f3");
		int b;
		while ((b = in.read()) != -1) {
			System.out.println(b);
		}
		in.close();

		InputStream in2 = new FileInputStream("d:/abc/f3");
		byte[] bytes2 = new byte[18];
		in2.read(bytes2);
		System.out.println(Arrays.toString(bytes2));// 数组打印成字符串
		// 准备一个数组，该数组的内容来自bytes2数组
		byte[] bytes3 = new byte[10];
		for (int i = 8; i < bytes2.length; i++) {
			bytes3[i - 8] = bytes2[i];
		}
		// 利用bytes3数组，构建一个字符串
		String s = new String(bytes3);
		System.out.println(s);
		in2.close();
	};
}

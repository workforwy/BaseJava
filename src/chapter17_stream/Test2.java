package tare.day1802;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("d:/abc/456");// cpu输出数据
		BufferedOutputStream bout = new BufferedOutputStream(out);
		InputStream in = new FileInputStream("d:/abc/123");// cpu输入数据
		int b;
		byte[] bytes = new byte[1024 * 4];
		while ((b = in.read(bytes)) != -1) {
			bout.write(bytes, 0, b);
			System.out.println("复制中......");
		}
		System.out.println("复制完成");
		in.close();
		bout.close();
	}
}

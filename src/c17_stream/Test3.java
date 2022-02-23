package c17_stream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * �ļ����
 * @author 1
 *
 */
public class Test3 {
	public static final int size = 2 * 1024 * 1024;
	public static final String file = "d:/abc/�����ļ�.exe";

	public static void main(String[] args) throws Exception {
		int filename = 1;
		InputStream in = new FileInputStream(file);
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("d:/abc/�����ļ�.exe_" + (filename++)));
		byte[] bytes = new byte[4 * 1024];
		int b;
		int bytecount = 0;
		while ((b = in.read(bytes)) != -1) {
			if (bytecount == size) {
				out.close();
				out = new BufferedOutputStream(new FileOutputStream("d:/abc/�����ļ�.exe_" + (filename++)));
				bytecount = 0;
			}
			out.write(bytes, 0, b);
			bytecount += b;
			System.out.println("�����...");
		}
		System.out.println("������");
		in.close();
		out.close();
	}
}

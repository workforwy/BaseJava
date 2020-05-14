package chapter17_stream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 文件合并
 * @author 1
 *
 */
public class Test4 {
	public static void main(String[] args) throws Exception {
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("d:/abc/测试文件（合并后的文件）.exe"));
		FileInputStream in = null;
		byte[] bytes = new byte[4 * 1024];
		int b;
		for (int i = 1; i <= 281; i++) {
			in = new FileInputStream("d:/abc/测试文件.exe_" + i);
			while ((b = in.read(bytes)) != -1) {
				out.write(bytes, 0, b);
			}
			in.close();
		}
		out.close();
	}
}

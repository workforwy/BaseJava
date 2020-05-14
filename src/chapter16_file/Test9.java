package chapter16_file;

import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * RandomAccessFile
 * 
 * @author 1
 *
 */
public class Test9 {
	public static void main(String[] args) throws Exception {
		/*
		 * 1.如果文件不存在，会新建文件 2.如果所在目录不存在，会出现异常
		 */
		RandomAccessFile raf = new RandomAccessFile("d:/abc/f2", "rw");
		raf.write(97);// 00 00 00 61
		raf.write(98);
		raf.write(99);
		raf.write(97);
		raf.write(356);// 00 00 01 64
		byte[] a = { 101, 102, 103, 104, 105, 106, 107, 108 };
		raf.write(a);
		raf.write(a, 4, 3);
		raf.seek(0);// 下标到0的位置
					// 单字节读取标准格式
		int b;
		while ((b = raf.read()) != -1) {
			System.out.println(b);
		}
		System.out.println("===================================");
		raf.seek(0);
		// 批量读取标准格式
		byte[] buff = new byte[6];
		int n;// 每一批的数量
		while ((n = raf.read(buff)) != -1) {
			System.out.println(n + ":" + Arrays.toString(buff));
		}
		raf.close();// 释放系统资源
	}
}

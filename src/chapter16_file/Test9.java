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
		 * 1.����ļ������ڣ����½��ļ� 2.�������Ŀ¼�����ڣ�������쳣
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
		raf.seek(0);// �±굽0��λ��
					// ���ֽڶ�ȡ��׼��ʽ
		int b;
		while ((b = raf.read()) != -1) {
			System.out.println(b);
		}
		System.out.println("===================================");
		raf.seek(0);
		// ������ȡ��׼��ʽ
		byte[] buff = new byte[6];
		int n;// ÿһ��������
		while ((n = raf.read(buff)) != -1) {
			System.out.println(n + ":" + Arrays.toString(buff));
		}
		raf.close();// �ͷ�ϵͳ��Դ
	}
}

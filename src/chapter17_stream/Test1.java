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
		 * 1.����outputstream���� 2.���õ�һ�������Ķ���д��һЩ���� 3.д�뵥�������� 4.д��byte[]
		 */
		OutputStream os = new FileOutputStream("d:/abc/f3", false);// true��׷�������ݣ�false�Ḳ��ԭ����
		os.write(97);
		os.write(98);
		os.write(99);
		os.write(356);
		byte[] bytes = new byte[] { 101, 102, 103, 104 };
		os.write(bytes);// д������bytes[]
		String str = "�����й���";
		byte[] strbyte = str.getBytes();// ��һ���ַ���ת����byte[]
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
		System.out.println(Arrays.toString(bytes2));// �����ӡ���ַ���
		// ׼��һ�����飬���������������bytes2����
		byte[] bytes3 = new byte[10];
		for (int i = 8; i < bytes2.length; i++) {
			bytes3[i - 8] = bytes2[i];
		}
		// ����bytes3���飬����һ���ַ���
		String s = new String(bytes3);
		System.out.println(s);
		in2.close();
	};
}

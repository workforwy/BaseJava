package chapter16_file;

import java.io.File;

public class Test2 {
	public static void main(String[] args) throws Exception {
		File f = new File("d:/abc/f1");
		if (f.exists()) {
			boolean b = f.delete();
			System.out.println("ɾ���ɹ���" + b);
		} else {
			/*
			 * 1.���ڵ�Ŀ¼�����ڣ�����쳣 2.�ļ��Ѿ����ڣ�����false
			 */
			boolean b = f.createNewFile();
			System.out.println("�����ɹ���" + b);
		}
	}
}

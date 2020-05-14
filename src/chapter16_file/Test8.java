package tarena.day1702;

import java.io.File;
import java.util.Scanner;

/**
 *  Ŀ¼�ܴ�С
 * @author 1
 *
 */
public class Test8 {
	public static void main(String[] args) {
		System.out.println("����Ŀ¼·����");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (!dir.isDirectory()) {
			System.out.println("��������ȷ��Ŀ¼·��");
			return;
		}
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		/**
		 * 1.�����ۼӱ���long sum=0; 2.�Բ���Ŀ¼dir�б���files 3.���files��null 4.����0
		 * 5.����files���飬ȡ����Files���󸳸�f 6.���f���ļ� 7.����ļ�f�Ĵ�С���ۼӵ�sum 8.����
		 * 9.�ݹ���Ŀ¼f�Ĵ�С���ۼӵ�sum 10.����sum��ֵ
		 */
		long sum = 0;
		File[] Files = dir.listFiles();
		if (Files == null) {
			return 0;
		}
		for (File f : Files) {
			if (f.isFile()) {
				sum += f.length();
			} else {
				sum += dirLength(f);
			}
		}
		return sum;
	}
}

package tarena.day1702;

import java.io.File;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String path;
		path = "D:/";
		path = "D:/software/androidnidaye.exe";
		path = "D:/software/�½��ļ���/8uftp.exe";

		File f = new File(path);
		System.out.println("�Ƿ�ɶ�" + f.canRead());
		System.out.println("�Ƿ��д" + f.canWrite());
		System.out.println("�Ƿ��ִ��" + f.canExecute());
		System.out.println("�Ƿ�����" + f.isHidden());
		System.out.println("�Ƿ����" + f.exists());
		System.out.println("����·��" + f.getAbsolutePath());
		System.out.println("�ļ���" + f.getName());
		System.out.println("��Ŀ¼" + f.getParent());
		System.out.println("����޸�" + f.lastModified());
		System.out.println("����޸�" + Date(f.lastModified()));
		System.out.println("�ֽ���" + t(f.length()));
		System.out.println("�Ƿ�Ŀ¼" + f.isDirectory());
		System.out.println("�Ƿ��ļ�" + f.isFile());
		System.out.println("�ܿռ�" + t(f.getTotalSpace()) + "G");
		System.out.println("���ÿռ�" + t(f.getFreeSpace()) + "G");
	}

	private static double t(long totalSpace) {
		double a;
		int c = 0;
		for (int i = 1;; i++) {
			a = totalSpace / (i * 1024);
			c++;
			if (a < 1024)
				break;
		}
		System.out.println(c);
		return a;
	}
	/**
	 * 
	 * @param lastModified
	 * @return
	 */
	private static String Date(long lastModified) {
		Date d = new Date(lastModified);
		return d.toString();
	}
}

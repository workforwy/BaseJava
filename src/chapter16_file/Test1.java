package tarena.day1702;

import java.io.File;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String path;
		path = "D:/";
		path = "D:/software/androidnidaye.exe";
		path = "D:/software/新建文件夹/8uftp.exe";

		File f = new File(path);
		System.out.println("是否可读" + f.canRead());
		System.out.println("是否可写" + f.canWrite());
		System.out.println("是否可执行" + f.canExecute());
		System.out.println("是否隐藏" + f.isHidden());
		System.out.println("是否存在" + f.exists());
		System.out.println("完整路径" + f.getAbsolutePath());
		System.out.println("文件名" + f.getName());
		System.out.println("父目录" + f.getParent());
		System.out.println("最后修改" + f.lastModified());
		System.out.println("最后修改" + Date(f.lastModified()));
		System.out.println("字节量" + t(f.length()));
		System.out.println("是否目录" + f.isDirectory());
		System.out.println("是否文件" + f.isFile());
		System.out.println("总空间" + t(f.getTotalSpace()) + "G");
		System.out.println("可用空间" + t(f.getFreeSpace()) + "G");
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

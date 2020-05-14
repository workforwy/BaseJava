package tarena.day1702;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
		File f1 = new File("d:/abc/f1");
		File f2 = new File("d:/abc/f2");
		if (!(f1.exists() ^ f2.exists())) {
			System.out.println("f1和f2必须存在一个");
			return;
		}
		if (f1.exists()) {
			boolean c = f1.renameTo(f2);
			System.out.println("f1改成f2" + c);
		} else {
			boolean c = f2.renameTo(f1);
			System.out.println("f2改成f1" + c);
		}
	}
}

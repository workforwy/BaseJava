package chapter16_file;

import java.io.File;

public class Test2 {
	public static void main(String[] args) throws Exception {
		File f = new File("d:/abc/f1");
		if (f.exists()) {
			boolean b = f.delete();
			System.out.println("删除成功：" + b);
		} else {
			/*
			 * 1.所在的目录不存在，会出异常 2.文件已经存在，返回false
			 */
			boolean b = f.createNewFile();
			System.out.println("创建成功：" + b);
		}
	}
}

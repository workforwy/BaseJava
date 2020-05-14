package tarena.day1702;

import java.io.File;
import java.util.Scanner;

/**
 *  目录总大小
 * @author 1
 *
 */
public class Test8 {
	public static void main(String[] args) {
		System.out.println("输入目录路径：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (!dir.isDirectory()) {
			System.out.println("请输入正确的目录路径");
			return;
		}
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		/**
		 * 1.定义累加变量long sum=0; 2.对参数目录dir列表赋给files 3.如果files是null 4.返回0
		 * 5.遍历files数组，取出的Files对象赋给f 6.如果f是文件 7.获得文件f的大小，累加到sum 8.否则
		 * 9.递归求目录f的大小，累加到sum 10.返回sum的值
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

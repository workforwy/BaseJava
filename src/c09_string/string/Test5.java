package c09_string.string;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("输入回文：");
		String s = new Scanner(System.in).nextLine();

		boolean b = huiwen(s);
		System.out.println("是否回文：" + b);
	}

	/**
	 * 回文判断
	 * 下标变量i 下标变量j 1.i从0，j从s.length-1（i<j) 2.如果i位置字符与j位置字符不相等，返回false 3.返回true
	 */
	static boolean huiwen(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}

package chapter09_string.string;

import java.util.Scanner;

/**
 * @author wangyong
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入email：");
		String s = new Scanner(System.in).nextLine();
		String n = getName(s);
		System.out.println(n);
	}

	/**
	 * 提取名字部分 找到@符号下标的位置赋给index 如果index==-1 ，返回“格式错误” 截取[0,index)的子串赋给name
	 * 返回name
	 */
	private static String getName(String email) {
		int index = email.indexOf("@");
		if (index == -1) {
			return "格式错误";
		}
		return email.substring(0, index);
	}
}

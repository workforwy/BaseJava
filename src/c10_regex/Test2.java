package c10_regex;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入");
		String s = new Scanner(System.in).nextLine();
		/*
		 * \d{15}| \d{15}|\d{17}[\dxX] "\需要\来转译" \\d{15}|\\d{17}[\\dxX]
		 */
		String regex = "\\d{15}|\\d{17}[\\dxX]";
		if (s.matches(regex)) {
			System.out.println("格式正确");
		} else {
			System.out.println("格式错误");
		}
	}
}

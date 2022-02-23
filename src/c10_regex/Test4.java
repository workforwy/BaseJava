package c10_regex;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("关键词列表,     用逗号、分号或空格隔开：");
		String s = new Scanner(System.in).nextLine();
		/*
		 * [,; ]+
		 * +号可能有一个，也可能有多个
		 */
		String[] a = s.split("[,; .]+");
		for (String value : a) {
			System.out.println(value);
		}
	}
}

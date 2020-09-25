package chapter10_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
	public static void main(String[] args) {
		System.out.println(" ‰»Î£∫");
		String s = new Scanner(System.in).nextLine();
		String regex = "\\d{3}";
		Matcher m = Pattern.compile(regex).matcher(s);
		while (m.find()) {
			String s2 = m.group();
			int start = m.start();
			int end = m.end();
			System.out.println(start + "," + end + ":" + s2);
		}
	}
}
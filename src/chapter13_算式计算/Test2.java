package chapter13_算式计算;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入算式：");
		String s = new Scanner(System.in).nextLine();

		Formula f = new Formula(s);
		double d = f.eval();
		System.out.println(d);
	}
}

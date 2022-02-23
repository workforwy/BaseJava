package c26_formula;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("请输入一个字符串:");
		String s=new Scanner(System.in).nextLine();
		
		Formula2 a=new Formula2(s);
		double d =a.eval();
		System.out.println(d);
	}
}

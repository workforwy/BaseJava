package base;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("������ʽ��");
		String s=new Scanner(System.in).nextLine();
		
		Formula2 a=new Formula2(s);
		double d =a.eval();
		System.out.println(d);
	}
}

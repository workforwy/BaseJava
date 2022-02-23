package c13_iterator;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(" ‰»ÎÀ„ Ω£∫");
		String s = new Scanner(System.in).nextLine();

		Formula f = new Formula(s);
		double d = f.eval();
		System.out.println(d);
	}
}

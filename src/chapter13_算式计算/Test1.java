package tarena.day1403;

import java.util.Scanner;

import tarena.day1403.Formula.DieDaiQi;

public class Test1 {
	public static void main(String[] args) {
		System.out.println(" ‰»ÎÀ„ Ω£∫");
		String s = new Scanner(System.in).nextLine();

		tarena.day1403.Formula f = new tarena.day1403.Formula(s);
		DieDaiQi d = f.new DieDaiQi();
		while (d.hasNext()) {
			String s2 = d.next();
			System.out.println(s2);
		}
	}
}

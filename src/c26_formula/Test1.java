package c26_formula;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®:");
        @SuppressWarnings("resource")
        String s = new Scanner(System.in).nextLine();

        Formula f = new Formula(s);
        Formula.DieDaiQi d = f.new DieDaiQi();
        while (d.hasNext()) {
            String s2 = d.next();
            System.out.println(s2);
        }
    }
}

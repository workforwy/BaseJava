package c13_iterator;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(" ‰»ÎÀ„ Ω£∫");
        String s = new Scanner(System.in).nextLine();

        Formula f = new Formula(s);
        Formula.DieDaiQi d = f.new DieDaiQi();
        while (d.hasNext()) {
            String s2 = d.next();
            System.out.println(s2);
        }
    }
}

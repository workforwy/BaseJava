package c09_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please input regex:");
            String regex = sc.nextLine();
            Pattern p = Pattern.compile(regex);
            System.out.println("please input a string:");
            String input = sc.nextLine();
            Matcher m = p.matcher(input);
            System.out.println("matches=" + m.matches());
        }
    }
}

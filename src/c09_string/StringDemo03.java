package c09_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StringDemo03 {
    public static void main(String[] args)
            throws FileNotFoundException {
        String s1 = "abcd";

        boolean f1 = s1.endsWith(".jpg");//jpg
        boolean f2 = s1.startsWith("ab");
        System.out.println(f2);

        String s2 =
                new String("Abcd");
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
        System.out.println(
                s1.equalsIgnoreCase(s2));

        String s3 = "a/b/c/d";

        String[] s =
                s3.split("/");
        System.out.println(
                Arrays.toString(s));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please input:");
            String content = sc.nextLine();
            if ("exit".equalsIgnoreCase(content.trim()))
                break;
            System.out.println(content);
        }
        //释放资源
        sc.close();
    }
}

package c02_enum.varparams;

/**静态引入*/
import static java.lang.Math.*;
import static java.lang.System.*;

import java.util.Scanner;
public class StaticImportDemo01 {
    public static void main(String[] args) {
        sqrt(9);
        pow(10,3);
        floor(12.5);
        ceil(12.3);
        out.println("hello");
        Scanner sc=new Scanner(in);
        String content=sc.nextLine();
        System.out.println(content);
    }
}


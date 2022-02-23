package c03_for.pack1;

import java.util.Scanner;

public class Yueshu {
    public static void main(String[] args) {
        System.out.println("输入整数显示它的约数");
        int n = new Scanner(System.in).nextInt();
        /*
         * 1.循环i从1到<=n递增 2.如果n能被i整除, 3.显示i
         */
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}

package c05_sort.digui;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
         * 斐波那契数列
         */
        System.out.println("求第n个斐波那契数 ");
        System.out.println("n = ");
        int n = new Scanner(System.in).nextInt();

        long r = g(n);
        System.out.println(r);
    }

    public static long f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }

    public static long g(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i < n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }
}

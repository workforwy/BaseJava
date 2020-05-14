package chapter03_for.pack1;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args) {
        System.out.println("输入n求n以内的质数的数量:");
        int n = new Scanner(System.in).nextInt();
        int count = f(n);
        System.out.println(count);
    }

    /**
     * 1.定义一个计数变量c=1
     * 2.循环i 从3开始到<=n递增
     * 3.循环J从2到<=i开方+递增（避免漏除整数）
     * 4.如果i能被j整除
     * 5.继续i循环下一轮
     * 6.c++
     */
    private static int f(int n) {
        int c = 1;
        a:
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue a;
                }
            }
            c++;
        }
        b:
        System.out.println(c);
        return c;
    }
}

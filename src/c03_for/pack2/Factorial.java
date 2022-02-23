package c03_for.pack2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("输入整数求阶乘");
        int n = new Scanner(System.in).nextInt();
        long r = f(n);
        System.out.println(r);
    }

    /**
     * 1.定义变量r=1L 2.循环i从n到>=1递减 3.r*=i 4.返回r的值
     */
    private static long f(int n) {
        long r = 1L;
        for (int i = n; i >= 1; i--) {
            r *= i;// r=r*i
        }
        return r;
    }
}

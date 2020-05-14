package chapter01;

import java.math.BigInteger;
import java.util.Scanner;

public class Jiecheng {
    public static void main(String[] args) {
        System.out.println("输入整数求阶乘:");
        int n = new Scanner(System.in).nextInt();
        String r = factorialByPositive(n);
        System.out.println(r);
        System.out.println(factorial(n));
    }

    /**
     * 正整数的阶乘 r=1 i=2 r*=i r=r*i
     */
    private static String factorialByPositive(int n) {
        BigInteger r = BigInteger.valueOf(1);
        for (int i = 2; i < n; i++) {
            BigInteger bi = BigInteger.valueOf(i);
            r = r.multiply(bi);
        }
        return r.toString();
    }

    /**
     * 数的阶乘 1.定义变量r = 1L 2.循环i 从5到>=1递减 3.r*=i 4.返回r的值
     */
    private static long factorial(int n) {
        long r = 1;
        for (int i = n; i >= 1; i--) {
            r = r * i;// r*=i;
        }
        return r;
    }
}

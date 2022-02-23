package c03_for.pack1;

import java.math.BigInteger;
import java.util.Scanner;

public class Jiecheng {
    public static void main(String[] args) {
        System.out.println("����������׳�:");
        int n = new Scanner(System.in).nextInt();
        System.out.println(factorialByPositive(n));
        System.out.println(factorial(n));
    }

    /**
     * �������Ľ׳� r=1 i=2 r*=i r=r*i
     */
    private static BigInteger factorialByPositive(int n) {
        BigInteger r = BigInteger.valueOf(1);
        for (int i = 2; i < n; i++) {
            BigInteger bi = BigInteger.valueOf(i);
            r = r.multiply(bi);
        }
        return r;
    }

    /**
     * ���Ľ׳� 1.�������r = 1L 2.ѭ��i ��5��>=1�ݼ� 3.r*=i 4.����r��ֵ
     */
    private static long factorial(int n) {
        long r = 1;
        for (int i = n; i >= 1; i--) {
            r = r * i;// r*=i;
        }
        return r;
    }
}

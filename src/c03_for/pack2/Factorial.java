package c03_for.pack2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("����������׳�");
        int n = new Scanner(System.in).nextInt();
        long r = f(n);
        System.out.println(r);
    }

    /**
     * 1.�������r=1L 2.ѭ��i��n��>=1�ݼ� 3.r*=i 4.����r��ֵ
     */
    private static long f(int n) {
        long r = 1L;
        for (int i = n; i >= 1; i--) {
            r *= i;// r=r*i
        }
        return r;
    }
}

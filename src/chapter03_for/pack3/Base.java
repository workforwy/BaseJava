package chapter03_for.pack3;

import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        doWhile();
        while1();
    }

    /**
     * 1.�Ȳ���һ��0.999��ֵ 2.��������������Ҫ��ֵ���ص�����1
     */
    public static void doWhile() {
        double d;
        long a = 0;
        do {
            d = Math.random();
            System.out.println(d);
            a++;
        } while (d >= 0.5);
        System.out.println(a);
    }

    /**
     * 1.��ʾ���� 2.�����ֵ����n 3.��n��= 0 4.n��10ȡ�ำ��y 5.��ʾy��ֵ 6.n/=10
     */
    public static void while1() {
        System.out.println("����һ��������");
        int n = new Scanner(System.in).nextInt();
        while (n != 0) {
            int y = n % 10;
            System.out.println(y);
            n /= 10;
        }
    }
}

package chapter03_for.pack3;

import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        doWhile();
        while1();
    }

    /**
     * 1.先产生一个0.999的值 2.当它不是我们想要的值，回到步骤1
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
     * 1.提示输入 2.输入的值赋给n 3.当n！= 0 4.n对10取余赋给y 5.显示y的值 6.n/=10
     */
    public static void while1() {
        System.out.println("输入一个整数：");
        int n = new Scanner(System.in).nextInt();
        while (n != 0) {
            int y = n % 10;
            System.out.println(y);
            n /= 10;
        }
    }
}

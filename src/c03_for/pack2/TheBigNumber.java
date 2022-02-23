package c03_for.pack2;

import java.util.Scanner;

/**
 * @author WY
 */
public class TheBigNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请再输入一个数字");
        int b = new Scanner(System.in).nextInt();
        theBigNumber1(a, b);
        theBigNumber2(a, b);
    }

    /**
     * @param a
     * @param b
     */
    static void theBigNumber1(int a, int b) {
        if (a >= b) {
            for (int i = b; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            for (int i = a; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    /**
     * @param a
     * @param b
     */
    private static void theBigNumber2(int a, int b) {
        int c = Math.max(a, b);
        for (int i = c; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
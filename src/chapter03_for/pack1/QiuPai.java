package chapter03_for.pack1;

import java.util.Scanner;

public class QiuPai {

    public static void main(String[] args) {
        System.out.println("输入运算次数：");
        int n = new Scanner(System.in).nextInt();
        double pi = f(n);
        System.out.println(pi);
    }

    /**
     * 1.返回类型
     * 2.方法名
     * 3.参数列表
     *
     * @param n
     * @return
     */
    static double f(int n) {
        /*
         * sum 累加变量 a 分子 b 分母 i 次数
         */
        double sum = 0;
        for (int a = 1, b = 1, i = 0; i < n; a *= -1, b += 2, i++) {
            sum += a / (double) b;
        }
        return sum * 4;
    }
}

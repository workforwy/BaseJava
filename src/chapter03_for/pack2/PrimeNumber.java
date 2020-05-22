package chapter03_for.pack2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个循环次数");
        int n = new Scanner(System.in).nextInt();
        int a = f(n);
        System.out.println(a);
    }

    private static int f(int n) {
        int c = 1;// 初始化计数器
        outer:
        // 定义外部循环代理
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {// 内部循环
                if (i % j == 0) {// 条件成立后,跳出内部循环,继续外部循环
                    continue outer;
                }
            } // 内部循环结束
            c++;// 计数自增
        } // 计数循环
        return c;
    }

}

package chapter02_function;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("输入整数：");
        int n = new Scanner(System.in).nextInt();
        /*
         * 调用f（）方法，将n的值，传递到f（）进行运算 然后得到它的返回值，赋给变量r 显示变量r的值
         */
        int r = fun(n);
        System.out.println(r);
    }

    /**
     * 1.返回类型
     * 2.方法名
     * 3.参数列表
     */
    static int fun(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

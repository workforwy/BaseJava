package tarena_day0303;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("输入分数计算学生学习状况：");
        int n = new Scanner(System.in).nextInt();
        // 调用f()方法，将n的值传递到f（）方法中运算，然后得到它的返回值赋给变量r
        String r = jisuan(n);
        System.out.println(r);
    }

    /**
     * 计算过程
     *
     * @param n
     * @return
     */
    static String jisuan(int n) {
        if (n < 0 || n > 100) {
            return "错误";
        }
        String r = "";
        switch (n / 10) {
            case 10:
            case 9:
                r = "A";
                break;
            case 8:
            case 7:
                r = "B";
                break;
            case 6:
                r = "C";
                break;
            case 5:
            case 4:
            case 3:
                r = "D";
                break;
            case 2:
            case 1:
                r = "E";
                break;
        }
        return r;
    }
}

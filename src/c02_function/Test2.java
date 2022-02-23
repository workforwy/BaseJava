package c02_function;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("输入工资：");
        int salary = new Scanner(System.in).nextInt();
        /*
         * 1.调用f（n）方法，讲salary的值传递到f（n）方法运算 然后得到的运算结果返回值赋给tax
         */
        double tax = b(salary);
        System.out.println("个人所得税：" + tax);
    }

    /**
     * 根据参数工资s，求出所得税
     * 1.如果s小于等于3500,返回0
     * 3.s减去3500是工资的应纳部分
     * 4.定义税率变量r=0
     * 5.定义速算扣除数变量k=0
     * 6.根据s的范围，为r，k赋值
     * 7.套入公式求出所得税，赋给结果
     * 8.返回result的值
     */
    static double b(int s) {
        if (s <= 3500)
            return 0;
        s -= 3500; // s = s-3500;
        double r = 0;
        int k = 0;
        if (s <= 1500) {
            r = 0.03;
            k = 0;
        } else if (s <= 4500) {
            r = 0.1;
            k = 105;
        } else if (s <= 9000) {
            r = 0.2;
            k = 555;
        } else if (s <= 35000) {
            r = 0.25;
            k = 1055;
        } else if (s <= 55000) {
            r = 0.3;
            k = 2755;
        } else if (s <= 80000) {
            r = 0.35;
            k = 5505;
        } else {
            r = 0.45;
            k = 13505;
        }
        return s * r - k;
    }

}

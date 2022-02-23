package c03_for.pack1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        int a = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = i;
            sum += sum;
        }
        System.out.println(sum);
    }
}
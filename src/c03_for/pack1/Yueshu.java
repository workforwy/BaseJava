package c03_for.pack1;

import java.util.Scanner;

public class Yueshu {
    public static void main(String[] args) {
        System.out.println("����������ʾ����Լ��");
        int n = new Scanner(System.in).nextInt();
        /*
         * 1.ѭ��i��1��<=n���� 2.���n�ܱ�i����, 3.��ʾi
         */
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
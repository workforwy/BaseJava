package chapter03_for.pack2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("������һ��ѭ������");
        int n = new Scanner(System.in).nextInt();
        int a = f(n);
        System.out.println(a);
    }

    private static int f(int n) {
        int c = 1;// ��ʼ��������
        outer:
        // �����ⲿѭ������
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {// �ڲ�ѭ��
                if (i % j == 0) {// ����������,�����ڲ�ѭ��,�����ⲿѭ��
                    continue outer;
                }
            } // �ڲ�ѭ������
            c++;// ��������
        } // ����ѭ��
        return c;
    }

}

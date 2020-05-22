package chapter03_for.pack1;

import java.util.Scanner;

public class QiuPai {

    public static void main(String[] args) {
        System.out.println("�������������");
        int n = new Scanner(System.in).nextInt();
        double pi = f(n);
        System.out.println(pi);
    }

    /**
     * 1.��������
     * 2.������
     * 3.�����б�
     *
     * @param n
     * @return
     */
    static double f(int n) {
        /*
         * sum �ۼӱ��� a ���� b ��ĸ i ����
         */
        double sum = 0;
        for (int a = 1, b = 1, i = 0; i < n; a *= -1, b += 2, i++) {
            sum += a / (double) b;
        }
        return sum * 4;
    }
}

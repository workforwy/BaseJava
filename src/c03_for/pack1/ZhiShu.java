package c03_for.pack1;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args) {
        System.out.println("����n,��n���ڵ�����������:");
        int n = new Scanner(System.in).nextInt();
        System.out.println(fun(n));
    }

    /**
     * 1.����һ����������c=1
     * 2.ѭ��i ��3��ʼ��<=n����
     * 3.ѭ��J��2��<=i����+����������©��������
     * 4.���i�ܱ�j����
     * 5.����iѭ����һ��
     * 6.c++
     */
    private static int fun(int n) {
        int c = 1;
        a:
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue a;
                }
            }
            c++;
        }
        return c;
    }
}

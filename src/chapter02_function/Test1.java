package chapter02_function;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("��������:");
        int n = new Scanner(System.in).nextInt();
        /*
         * ����f������������n��ֵ�����ݵ�f������������ Ȼ��õ����ķ���ֵ����������r ��ʾ����r��ֵ
         */
        int r = fun(n);
        System.out.println(r);
    }

    /**
     * 1.��������
     * 2.������
     * 3.�����б�
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

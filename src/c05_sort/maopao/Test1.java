package c05_sort.maopao;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] a = random();
        System.out.println(Arrays.toString(a));
        System.out.println("===========================");
        sort(a);
        System.out.println("===========================");
        System.out.println(Arrays.toString(a));
    }

    private static int[] random() {
        /*
         * 1.����[5,11����Χ�ĳ��ȸ���len 2.�½�len���ȵ����鸳��a 3.��������a 4.��ÿ��λ�÷���100�ڵ������ ��������a
         */
        int len = 5 + new Random().nextInt(6);
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    private static void sort(int[] a) {
        /*
         * 1.ѭ�������±�i��0��<a.length���� 2.ѭ�������±�j��a.length-1��>i �ݼ� 3.���a[j]<a[j-1]
         * 4.��λ�ý��� 5.j��������ʾ����a
         */
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int c = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = c;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            System.out.println(Arrays.toString(a));
        }
    }
}

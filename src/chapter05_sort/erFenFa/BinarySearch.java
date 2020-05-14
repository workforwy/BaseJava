package chapter05_sort.erFenFa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = random();// �����������
        Arrays.sort(a);// ��������
        System.out.println(Arrays.toString(a));// ��ӡ������ɵ�����

        System.out.println("������ҵ�ֵ");
        int t = new Scanner(System.in).nextInt();// ϵͳ������ֵT

        int index = binarysearch(a, t);// ��������ж��ַ�����
        System.out.println(index + 1);// ��ӡ
    }

    private static int[] random() {
        int len = 5 + new Random().nextInt(6);
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    private static int binarysearch(int[] a, int t) {
        /*
         * 1.�����±���� lo=0 hi=a.length-1 mid 2.��lo<=hi 3.mid=(lo+hi)/2 4.���mid
         * λ�õ�ֵ��Ŀ��ֵtС�� 5.lo�ƶ���mid+1 6.���� ���midλ�õ�ֵ��t�� 7.hi�ƶ���mid-1 8.���򣬷���midֵ
         * 9.�Ҳ�������һ��������ֵ-��lo+1��
         */
        int lo = 0;
        int hi = a.length - 1;
        int mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (a[mid] < t)
                lo = mid + 1;
            else if (a[mid] > t)
                hi = mid - 1;
            else
                return mid;
        }
        return -(lo + 1);
    }
}

package chapter05_sort.erFenFa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = random();// 产生随机数组
        Arrays.sort(a);// 数组排序
        System.out.println(Arrays.toString(a));// 打印排序完成的数组

        System.out.println("输入查找的值");
        int t = new Scanner(System.in).nextInt();// 系统输入新值T

        int index = binarysearch(a, t);// 对数组进行二分法查找
        System.out.println(index + 1);// 打印
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
         * 1.定义下标变量 lo=0 hi=a.length-1 mid 2.当lo<=hi 3.mid=(lo+hi)/2 4.如果mid
         * 位置的值比目标值t小， 5.lo移动到mid+1 6.否则 如果mid位置的值比t大 7.hi移动到mid-1 8.否则，返回mid值
         * 9.找不到返回一个无意义值-（lo+1）
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

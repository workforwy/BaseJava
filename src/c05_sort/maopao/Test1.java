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
         * 1.产生[5,11）范围的长度赋给len 2.新建len长度的数组赋给a 3.遍历数组a 4.在每个位置放入100内的随机数 返回数组a
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
         * 1.循环正序下标i从0到<a.length递增 2.循环倒序下标j从a.length-1到>i 递减 3.如果a[j]<a[j-1]
         * 4.两位置交换 5.j结束后显示数组a
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

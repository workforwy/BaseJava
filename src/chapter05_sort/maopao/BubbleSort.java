package chapter05_sort.maopao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {1, 2, 8, 9, 6, 4, 7};
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}

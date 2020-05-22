package chapter05_sort.maopao;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {1, 9, 8};
//        int temp = 0;
//        for (int i = a.length - 1; i > 0; --i) {
//
//            for (int j = 0; j < i; ++j) {
//                if (a[j + 1] < a[j]) {
//                    temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }
//        System.out.print(Arrays.toString(a));

        bubbleSort(a);
    }

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("i= " + i + "j=" + j);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}

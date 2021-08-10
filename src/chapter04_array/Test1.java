package chapter04_array;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        int[] b = {1, 2, 3};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

package chapter04_array;

import java.util.Arrays;
import java.util.Random;

public class MinAndAvg {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        int m = Min(a);
        System.out.println("数组中最小的是：" + m);

        System.out.println("数组平均值是：" + avg(a));
    }

    /**
     * 假设第一个值为最小赋给min 循环i从1到a.lenth递增 如果a[i]<min 将a[i]的值赋给min
     */
    private static int Min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    /**
     * 定义累加变量sum=0 循环从i从到a.length递增 向sum累加a[i] 返回sum/a.length
     * @return
     */
    private static double avg(int[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            // sum=sum+a[i]
            sum += a[i];
        }
        return sum / a.length;
    }
}

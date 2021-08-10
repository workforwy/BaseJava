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
        System.out.println("��������С���ǣ�" + m);

        System.out.println("����ƽ��ֵ�ǣ�" + avg(a));
    }

    /**
     * �����һ��ֵΪ��С����min ѭ��i��1��a.lenth���� ���a[i]<min ��a[i]��ֵ����min
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
     * �����ۼӱ���sum=0 ѭ����i�ӵ�a.length���� ��sum�ۼ�a[i] ����sum/a.length
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

package chapter04_list;

import java.util.Arrays;
import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MinAndAvg {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        int m = Min(a);
        System.out.println("��������С���ǣ�" + m);
        int avg = avg(a);
        System.out.println("����ƽ��ֵ�ǣ�" + avg);
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
     */
    private static int avg(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            // sum=sum+a[i]
            sum += a[i];
        }
        return sum / a.length;
    }
}

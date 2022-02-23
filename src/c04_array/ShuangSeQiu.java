package c04_array;

import java.util.Arrays;
import java.util.Random;

public class ShuangSeQiu {
    public static void main(String[] args) {
        /*
         * �½�33�����ȵĺ����������r �½�16�����ȵ������������b ��r��������ֵ1...33 ��b��������ֵ1...16
         */
        int[] r = new int[33];
        int[] b = new int[16];
        for (int i = 1; i <= r.length; i++) {
            r[i-1] = i ;
        }
        for (int i = 1; i <= b.length; i++) {
            b[i-1] = i ;
        }
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(b));
        /*
         * 1.�½�����������red������ 6
         * 2.�½�������飬����33
         * 3.ѭ��i��0��<6����
         * 4.�������[0,33)��Χ�±긳��j
         * 5.��flag j��true���ص���һ��
         * 6.Ϊred[i]��ֵ����r[j]
         * 7.flag [j]�޸ĳ�true
         */
        int[] red = new int[6];
        boolean[] flag = new boolean[33];
        for (int i = 0; i < 6; i++) {
            int j;
            do {
                j = new Random().nextInt(33);
            } while (flag[j]);
            red[i] = r[j];
            flag[j] = true;
        }
        System.out.println("����:" + Arrays.toString(red));
        System.out.println("����:[" + b[new Random().nextInt(16)] + "]");
    }
}

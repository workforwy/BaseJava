package c04_array;

import java.util.Arrays;
import java.util.Random;

public class ShuangSeQiu {
    public static void main(String[] args) {
        /*
         * 新建33个长度的红球号码数组r 新建16个长度的篮球号码数组b 向r数组填入值1...33 向b数组填入值1...16
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
         * 1.新建红球结果数组red，长度 6
         * 2.新建标记数组，长度33
         * 3.循环i从0到<6递增
         * 4.随机产生[0,33)范围下标赋给j
         * 5.当flag j是true，回到上一步
         * 6.为red[i]赋值，赋r[j]
         * 7.flag [j]修改成true
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
        System.out.println("红球:" + Arrays.toString(red));
        System.out.println("蓝球:[" + b[new Random().nextInt(16)] + "]");
    }
}

package c04_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CaiZiMu {
    public static void main(String[] args) {
        char[] A = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'V', 'Y', 'Z'};
        /*
         * 1.循环i从0到<5递增 2.产生[i,26)范围的随机下标j 3.i位置字符与j位置字符交换 4.截取前5个位置成为一个新的数组赋给r
         */
        for (int i = 0; i < 5; i++) {
            int j = i + new Random().nextInt(26 - i);
            char c = A[i];
            A[i] = A[j];
            A[j] = c;
        }
        char[] r = Arrays.copyOf(A, 5);
        System.out.println(Arrays.toString(r));
        System.out.println("=================");
        System.out.println("已经产生了5个不重复的字母,请猜这5个字母");
        while (true) {
            System.out.println("猜");
            String s = new Scanner(System.in).nextLine();
            char[] c = s.toCharArray();// 将s转化成char类型的数组
            String result = bijiao(c, r);
            System.out.println(result);
            if (result.equals("5A0B")) {
                break;
            }
        }
    }

    static String bijiao(char[] c, char[] r) {
        /*
         * A=0 B=0 r数组JKHJK c数组HIJHK 1.定义计数变量a=0 b=0 2.循环变量i从0到<5递增 3.循环j从
         * 0到<5递增 4.如果c[i]==r[j] 5.如果i=j a++ 6.否则 b++ 7.break 8.返回a+"A"+b+"B"
         */
        int a = 0;
        int b = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (c[i] == r[j]) {
                    if (i == j) {
                        a++;
                    } else {
                        b++;
                    }
                    break;
                }
            }
        }
        return a + "A" + b + "B";
    }
}

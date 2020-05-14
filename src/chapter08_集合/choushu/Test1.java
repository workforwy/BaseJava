package chapter08_����.choushu;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("��������n���n������");
        int n = new Scanner(System.in).nextInt();
        String ugly = choushu(n);
        System.out.println(ugly);
    }

    ;

    private static String choushu(int n) {
        LinkedList<BigInteger> list3 = new LinkedList<>();
        LinkedList<BigInteger> list5 = new LinkedList<>();
        LinkedList<BigInteger> list7 = new LinkedList<>();

        list3.add(BigInteger.valueOf(3L));
        list5.add(BigInteger.valueOf(5L));
        list7.add(BigInteger.valueOf(7L));

        BigInteger r = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            BigInteger a = list3.getFirst();
            BigInteger b = list5.getFirst();
            BigInteger c = list7.getFirst();

            r = a.compareTo(b) < 0 ? a : b;
            r = r.compareTo(c) < 0 ? r : c;

            if (r.equals(a))
                list3.removeFirst();
            if (r.equals(b))
                list5.removeFirst();
            if (r.equals(c))
                list7.removeFirst();

            list3.add(r.multiply(BigInteger.valueOf(3)));
            list5.add(r.multiply(BigInteger.valueOf(5)));
            list7.add(r.multiply(BigInteger.valueOf(7)));
        }
        return r.toString();
    }

    private static long a(int n) {
        /*
         * 1.����һ����������long c=0 ����һ������r=0 2.ѭ��i��3��ʼ���������� 3.�����±���j=i 4.��j�ܱ�3������j/=3
         * 5.��j�ܱ�5������j/=5 6.��j�ܱ�7������j/=7 7.���j==1 8.c++ 9.���c==n 10.������i��������r
         * 11.break; 12.����r
         *
         */
        long r = 0;
        int c = 0;
        for (long i = 3; ; i++) {
            long j = i;
            while (j % 3 == 0) {
                j /= 3;
            }
            while (j % 5 == 0) {
                j /= 5;
            }
            while (j % 7 == 0) {
                j /= 7;
            }
            if (j == 1) {
                c++;
                if (c == n) {
                    r = i;
                    break;
                }
            }
        }
        return r;
    }
}

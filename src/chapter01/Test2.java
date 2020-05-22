package chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        byte[] a = intToBytes(n);

        System.out.println(Arrays.toString(a));
        int r = byteToInt(a);
        System.out.println(r);
    }

    static byte[] intToBytes(int i) {
        byte[] a = new byte[4];
        a[0] = (byte) (i >> 24);
        a[1] = (byte) (i >> 16);
        a[2] = (byte) (i >> 8);
        a[3] = (byte) (i >> 0);
        return a;
    }

    static int byteToInt(byte[] a) {
        int r = 0;
        r |= a[0] << 24 >>> 0;
        r |= a[1] << 24 >>> 8;
        r |= a[2] << 24 >>> 16;
        r |= a[3] << 24 >>> 24;
        return r;
    }
}

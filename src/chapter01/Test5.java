package chapter01;

import java.util.Scanner;

/**
 * λ������
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("����������");
		int n = new Scanner(System.in).nextInt();
		/*
		 * 1.n�����ƶ�24λ��ǿת��byte��b1
		 * 2.n�����ƶ�16λ��ǿת��byte��b2
		 * 3.n�����ƶ�8λ��ǿת��byte��b3
		 * 4.n�����ƶ�0λ��ǿת��byte��b4
		 */
		byte b1 = (byte) (n >> 24);
		byte b2 = (byte) (n >> 16);
		byte b3 = (byte) (n >> 8);
		byte b4 = (byte) (n >> 0);
		System.out.println(b4);
		System.out.println(b3);
		System.out.println(b2);
		System.out.println(b1);
		/*
		 * 0.�������r=0
		 * 1.b1�����ƶ�24λ�ٲ�����������0λ������r��λ�򣬽�����¸���r
		 * 2.b1�����ƶ�24λ�ٲ�����������8λ������r��λ�򣬽�����¸���r
		 * 3.b1�����ƶ�24λ�ٲ�����������16λ������r��λ�򣬽�����¸���r
		 * 4.b1�����ƶ�24λ�ٲ�����������24λ������r��λ�򣬽�����¸���r
		 */
		int r = 0;
		r = r | (b1 << 24 >>> 0);
		r = r | (b2 << 24 >>> 8);
		r = r | (b3 << 24 >>> 16);
		r = r | (b4 << 24 >>> 24);
		System.out.println(r);
	}
}

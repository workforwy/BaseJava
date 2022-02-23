package c04_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CaiZiMu {
    public static void main(String[] args) {
        char[] A = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'V', 'Y', 'Z'};
        /*
         * 1.ѭ��i��0��<5���� 2.����[i,26)��Χ������±�j 3.iλ���ַ���jλ���ַ����� 4.��ȡǰ5��λ�ó�Ϊһ���µ����鸳��r
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
        System.out.println("�Ѿ�������5�����ظ�����ĸ,�����5����ĸ");
        while (true) {
            System.out.println("��");
            String s = new Scanner(System.in).nextLine();
            char[] c = s.toCharArray();// ��sת����char���͵�����
            String result = bijiao(c, r);
            System.out.println(result);
            if (result.equals("5A0B")) {
                break;
            }
        }
    }

    static String bijiao(char[] c, char[] r) {
        /*
         * A=0 B=0 r����JKHJK c����HIJHK 1.�����������a=0 b=0 2.ѭ������i��0��<5���� 3.ѭ��j��
         * 0��<5���� 4.���c[i]==r[j] 5.���i=j a++ 6.���� b++ 7.break 8.����a+"A"+b+"B"
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

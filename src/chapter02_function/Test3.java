package chapter02_function;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("�����������ѧ��ѧϰ״����");
        int n = new Scanner(System.in).nextInt();
        // ����f()��������n��ֵ���ݵ�f�������������㣬Ȼ��õ����ķ���ֵ��������r
        String r = jisuan(n);
        System.out.println(r);
    }

    /**
     * �������
     *
     * @param n
     * @return
     */
    static String jisuan(int n) {
        if (n < 0 || n > 100) {
            return "����";
        }
        String r = "";
        switch (n / 10) {
            case 10:
            case 9:
                r = "A";
                break;
            case 8:
            case 7:
                r = "B";
                break;
            case 6:
                r = "C";
                break;
            case 5:
            case 4:
            case 3:
                r = "D";
                break;
            case 2:
            case 1:
                r = "E";
                break;
        }
        return r;
    }
}

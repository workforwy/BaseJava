package c02_function;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("���빤�ʣ�");
        int salary = new Scanner(System.in).nextInt();
        /*
         * 1.����f��n����������salary��ֵ���ݵ�f��n���������� Ȼ��õ�������������ֵ����tax
         */
        double tax = b(salary);
        System.out.println("��������˰��" + tax);
    }

    /**
     * ���ݲ�������s���������˰
     * 1.���sС�ڵ���3500,����0
     * 3.s��ȥ3500�ǹ��ʵ�Ӧ�ɲ���
     * 4.����˰�ʱ���r=0
     * 5.��������۳�������k=0
     * 6.����s�ķ�Χ��Ϊr��k��ֵ
     * 7.���빫ʽ�������˰���������
     * 8.����result��ֵ
     */
    static double b(int s) {
        if (s <= 3500)
            return 0;
        s -= 3500; // s = s-3500;
        double r = 0;
        int k = 0;
        if (s <= 1500) {
            r = 0.03;
            k = 0;
        } else if (s <= 4500) {
            r = 0.1;
            k = 105;
        } else if (s <= 9000) {
            r = 0.2;
            k = 555;
        } else if (s <= 35000) {
            r = 0.25;
            k = 1055;
        } else if (s <= 55000) {
            r = 0.3;
            k = 2755;
        } else if (s <= 80000) {
            r = 0.35;
            k = 5505;
        } else {
            r = 0.45;
            k = 13505;
        }
        return s * r - k;
    }

}

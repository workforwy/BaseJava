package c03_for.pack1;

public class Buy {
    public static void main(String[] args) {
        /*
         * 1.ѭ��g��0��<=20���� 2.����gֻ����ʣ���Ǯ����money 3.��money �����������ĸ������max
         * 4.ѭ��m��0��<=max���� 5.��ʣ���Ǯ��������С������x 6.���g+m+x=100 7.��ӡ������
         */
        int a = 0;
        System.out.println("����5Ԫ1ֻ\nĸ��3Ԫ1ֻ\nС��1Ԫ3ֻ\nһ��Ԫ��һ��ֻ����ϣ�");
        for (int g = 0; g <= 20; g++) {
            int money = 100 - 5 * g;
            int max = money / 3;
            for (int m = 0; m <= max; m++) {
                int x = (money - 3 * m) * 3;
                if (g + m + x == 100) {
                    System.out.println("����:" + g + "ĸ��:" + m + "С��:" + x);
//                    break;
                }
                a++;
            }
        }
        System.out.println(a);
    }
}

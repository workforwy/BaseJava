package tarena.day0408;

import java.util.Random;
import java.util.Scanner;

public class CaiShuZi {
    public static void main(String[] args) {
        int r = 1 + new Random().nextInt(1000);// ����0��1000��������1000��������
        /*
         * ��ʾ��ʾ ������ѭ�� ��ʾ�� ��������ֵ��������c- ���c>r, ��ʾ�� ���c<r,��ʾС ���� ��ʾ�� break
         */
        System.out.println("�Ѿ����������һ����,���һ�������");
        while (true) {
            System.out.println("��������µ�����");
            int c = new Scanner(System.in).nextInt();
            if (c > r) {
                System.out.println("�´��ˣ��ٲ�.....");
            } else if (c < r) {
                System.out.println("��С�ˣ��ٲ�.....");
            } else {
                System.out.println("��ϲ��¶���~~~~~");
                break;
            }
        }
    }
}

package chapter12_Date.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("�������£�yyyy-MM��");
        String s = new Scanner(System.in).nextLine();
        /*2015-12-->date 2015-12-1 0:0:0
         * 1.�½�SimpleDateFormat���󸳸�fmt,�ƶ���ʽ�ǣ�"yyyy-MM"
         * 2.��fmt��s������Date���󸳸�d
         * 3.�½�Calendar���󸳸�c
         * 4.��c���óɺ�d��ͬ��ʱ��
         * 5.��õ���1�����ܼ�������day
         * 6.��õ��������������max
         * 7.�����������count =0
         * 8.��ӡһ���ַ���"��\tһ \t��\t��\t��\t��\t��"
         * 9.ѭ������i��0��<day-1
         *    10.��ӡ \t
         *    11.count ++
         * 12.ѭ��i��1��<=max
         *    13.��ӡi+��\t��
         *    14.count++
         *    15.���count==7
         *      16.��ӡ����
         *      17.count =0
         */
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM");
        Date d = fmt.parse(s);
        Calendar c = Calendar.getInstance();
        Calendar j = Calendar.getInstance();

        c.setTime(d);
        int day = c.get(Calendar.DAY_OF_WEEK);
        int max = c.getActualMaximum(Calendar.DAY_OF_MONTH);//ĳһ���µ��������
        int count = 0;//��������
        System.out.println("��\tһ \t��\t��\t��\t��\t��");//\t=�ո�
        for (int i = 0; i < day - 1; i++) {
            System.out.print("\t");
            count++;
        }
        for (int i = 1; i <= max; i++) {
            System.out.print(i + "\t");
            count++;
            if (count == 7) {
                System.out.println();
                count = 0;
            }
        }

    }
}

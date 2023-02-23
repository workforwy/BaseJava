package c12_date.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("输入年月（yyyy-MM）");
        String s = new Scanner(System.in).nextLine();
        try {
            fun1(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * 1.新建SimpleDateFormat对象赋给fmt,制定格式是："yyyy-MM"
     * 2.用fmt将s解析成Date对象赋给d
     * 3.新建Calendar对象赋给c
     * 4.将c设置成和d相同的时间
     * 5.获得当天1号是周几，赋给day
     * 6.获得当月最大天数赋给max
     * 7.定义计数变量count =0
     * 8.打印一个字符串"日\t一 \t二\t三\t四\t五\t六"
     * 9.循环变量i从0到<day-1
     * 10.打印 \t
     * 11.count ++
     * 12.循环i从1到<=max
     * 13.打印i+“\t”
     * 14.count++
     * 15.如果count==7
     * 16.打印换行
     * 17.count =0
     */
    private static void fun1(String s) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date d = fmt.parse(s);
        Calendar c = Calendar.getInstance();
        Calendar j = Calendar.getInstance();

        c.setTime(d);
        int day = c.get(Calendar.DAY_OF_WEEK);
        //某一个月的最大天数
        int max = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        //计数变量
        int count = 0;
        //  \t = 空格
        System.out.println("日\t一 \t二\t三\t四\t五\t六");
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

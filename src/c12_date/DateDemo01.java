package c12_date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo01 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);

        //日历对象(构建)
        Calendar c1 =
                Calendar.getInstance();
        System.out.println(
                c1.getClass()
                        .getSimpleName());

        Calendar c2 =
                new GregorianCalendar();

        //获得系统时间
        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        int day = c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "-" + (month + 1) + "-" + day);

        //获得和周相关的天数(本周的第几天)
        int dayOfWeek =
                c1.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
        //c1.set(Calendar.YEAR, 2016);
        c1.set(2017, 11, 15);
        System.out.println(
                c1.get(Calendar.DAY_OF_WEEK));
        date = c1.getTime();//Date
        long l01 = date.getTime();
        //直接获得毫秒
        long l02 = c1.getTimeInMillis();
        //时间的加法运算
        c1.add(Calendar.DAY_OF_MONTH, 10);

        System.out.println(c1.getTimeZone());


    }
}


package c12_date;

import java.util.Calendar;
import java.util.TimeZone;

public class DateDemo02 {
    public static void main(String[] args) {
        Calendar c1 = null;
        //c1=Calendar.getInstance(TimeZone.getDefault());
        //获得所有时区id
        String ids[] =
                TimeZone.getAvailableIDs();
        for (String id : ids) {
            System.out.println(id);
        }
        //获得指定时区的日历对象
        c1 = Calendar.getInstance(
                TimeZone.getTimeZone("Pacific/Apia"));
        System.out.println(c1);

        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        int day = c1.get(Calendar.DAY_OF_MONTH);
        int hour = c1.get(Calendar.HOUR_OF_DAY);

        System.out.println(year + "-" + month + "-" + day + ":" + hour);
    }
}

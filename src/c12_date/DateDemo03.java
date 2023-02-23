package c12_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Date(java.util.Date)
//Calendar(java.util.Calendar)
//SimpleDateFormat
public class DateDemo03 {
    public static void main(
            String[] args) throws ParseException {
        String dateStr=
                "2015-12-15 15:12:12";
        //字符串转换为Date类型

        SimpleDateFormat sdf=
                new SimpleDateFormat(
                        "yyyy-MM-dd HH:mm:ss");

        Date date=
                sdf.parse(dateStr);

        System.out.println(date);

        Calendar c=
                Calendar.getInstance();
        c.setTime(date);
        int year=c.get(Calendar.YEAR);
        System.out.println(year);
        //日期转换为字符串
        dateStr=sdf.format(new Date());
        System.out.println(dateStr);
    }
}


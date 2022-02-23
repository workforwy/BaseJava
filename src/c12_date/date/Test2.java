package c12_date.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("输入生日：");
		String s = new Scanner(System.in).nextLine();
		/*
		 * 1.新建SimpleDateFormat对象赋给fmt，制定格式yyyy-MM-dd 2.用fmt解析字符串s，解析的Date对象赋给d
		 * 3.当前时间(System.currentTimeMillis()) 毫秒值减去Date对象d的毫秒值赋给t
		 * 4.t/1000/60/60/24结果再赋给t 5.显示t的值
		 */
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date d = fmt.parse(s);
		long t = System.currentTimeMillis() - d.getTime();
		t = t / 1000 / 60 / 60 / 24;
		System.out.println("你已经生存了" + t + "天");
	}
}

package chapter12_Date.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		Date a = new Date();
		Date b = new Date(600000000L);
		// 在打印方法内部会调用toString()获得字符串，再打印数据
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.getTime());
		System.out.println(b.getTime());
		// 格林尼治时间1970-1-1 0点
		// 北京时间8点
		a.setTime(0);
		System.out.println(a);
		System.out.println(a.getTime());
		String s;
		SimpleDateFormat f = new SimpleDateFormat("yyy*MM*dd HH:mm:ss");
		s = f.format(a);
		System.out.println(s);
		s = f.format(b);
		System.out.println(s);
	}
}

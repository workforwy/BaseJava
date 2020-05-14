package chapter12_Date.calender;

import java.util.Calendar;

public class Test1 {
	public static void main(String[] args) {
		// �½������������ʾ��ǰ��ʱ��
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));

		c.set(Calendar.YEAR, 2000);
		System.out.println(c.getTime());

		c.set(2000, 1, 1, 0, 0, 0);
		System.out.println(c.getTime());

		c.add(Calendar.DAY_OF_MONTH, 12);
		System.out.println(c.getTime());
		c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.getTimeInMillis());
	}
}


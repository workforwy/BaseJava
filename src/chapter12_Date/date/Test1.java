package chapter12_Date.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		Date a = new Date();
		Date b = new Date(600000000L);
		// �ڴ�ӡ�����ڲ������toString()����ַ������ٴ�ӡ����
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.getTime());
		System.out.println(b.getTime());
		// ��������ʱ��1970-1-1 0��
		// ����ʱ��8��
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

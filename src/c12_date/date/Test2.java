package c12_date.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("�������գ�");
		String s = new Scanner(System.in).nextLine();
		/*
		 * 1.�½�SimpleDateFormat���󸳸�fmt���ƶ���ʽyyyy-MM-dd 2.��fmt�����ַ���s��������Date���󸳸�d
		 * 3.��ǰʱ��(System.currentTimeMillis()) ����ֵ��ȥDate����d�ĺ���ֵ����t
		 * 4.t/1000/60/60/24����ٸ���t 5.��ʾt��ֵ
		 */
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date d = fmt.parse(s);
		long t = System.currentTimeMillis() - d.getTime();
		t = t / 1000 / 60 / 60 / 24;
		System.out.println("���Ѿ�������" + t + "��");
	}
}

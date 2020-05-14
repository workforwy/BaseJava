package tarena.day1701;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "2015-12-21", "2015-12-1", "2015-12-2", "2015-12-11", "2015-12-14", "455254564564546",
				"2015-12-17", "2015-12-19");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("-----------------------------------------------------");
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
				// 必须二选一 1.插管子继续抛 2.捕获
				try {
					Date a = f.parse(o1);
					Date b = f.parse(o2);
					return a.compareTo(b);
				} catch (ParseException e) {
					// 异常封装成(能抛出的异常类型)再抛出
					RuntimeException s = new RuntimeException(e);
					throw s;
				}
			}
		});
		System.out.println(list);
		System.out.println("-----------------------------------------------------");
	}
}

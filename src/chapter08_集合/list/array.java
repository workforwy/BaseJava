package chapter08_¼¯ºÏ.list;

import java.util.ArrayList;
import java.util.Iterator;

public class array {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(888);
		list.add(777);
		list.add(555);
		list.add(444);
		list.add(333);
		list.add(222);
		System.out.println(list);
		System.out.println(list.size());
		list.add(4, 999);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.contains(555));
		System.out.println(list.set(3, 777));
		System.out.println(list);
		System.out.println(list.remove(4));
		System.out.println(list);
		System.out.println(list.remove(Integer.valueOf(888)));
		System.out.println(list);
		Iterator<Integer> a = list.iterator();
		while (a.hasNext()) {
			Integer b = a.next();
			System.out.println(b);
		}
	}
}

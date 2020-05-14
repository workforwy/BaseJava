package chapter08_集合.list;

import java.util.Iterator;
import java.util.LinkedList;

public class link {
	public static void main(String[] args) {
		/*
		 * <>泛型 限制集合中存放的数据类型 泛型不支持基本类型
		 */
		LinkedList<String> s = new LinkedList<>();// 第二个string可以省略

		s.add("ccc");
		s.add("ddd");
		s.add("aaa");
		s.add("sss");
		s.add(null);
		System.out.println(s.size());
		System.out.println(s);
		s.add(3, "333");
		System.out.println(s);
		s.addFirst("<<<");
		s.addLast(">>>");
		System.out.println(s);
		System.out.println(s.getFirst());
		System.out.println(s.getLast());
		System.out.println(s.removeFirst());
		System.out.println(s.removeLast());
		System.out.println(s);
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		System.out.println(s.get(s.size() - 1));
		System.out.println(s.contains("aaa"));
		System.out.println(s.set(2, "555"));
		System.out.println(s.remove(2));
		System.out.println(s.remove("aaa"));
		System.out.println("=========================");

		for (String d : s) {
			System.out.println(d);
		}
		System.out.println("=========================");
		// 双向链表，迭代器遍历效率高
		// 这个方法中新建迭代器对象
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			String e = i.next();
			System.out.println(e);
		}
	}

	void first(LinkedList<String> s) {
		for (int i = 0; i < s.size(); i++) {
			String d = s.get(i);
			System.out.println(d);
		}
	}
}

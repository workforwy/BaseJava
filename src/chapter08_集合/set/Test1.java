package chapter08_集合.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		Set<Integer> set;
		// set = new HashSet<Integer>();// 无序
		set = new TreeSet<Integer>();// 有序
		/*
		 * set里面元素不能重复
		 */
		set.add(555);
		set.add(111);
		set.add(222);
		set.add(333);
		set.add(444);
		set.add(555);
		set.add(666);
		set.add(666);

		System.out.println(set);
		System.out.println(set.size() + 1);
		System.out.println(set.contains(444));
		System.out.println(set.remove(444));
		System.out.println(set);
		
		// 初步迭代器
		System.out.println("初步迭代器");
		for (Iterator<Integer> c = set.iterator(); c.hasNext();) {
			Integer index = c.next();
			System.out.println(index);
		}

		// foreach 循环
		System.out.println("foreach循环");
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		// 迭代器循环
		System.out.println("迭代器循环");
		Iterator<Integer> a = set.iterator();
		while (a.hasNext()) {
			Integer b = a.next();
			System.out.println(b);
		}
	}
}

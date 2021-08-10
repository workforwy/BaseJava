package chapter08_list.hashmap;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(198, "张三", "男", 20);
		Student s2 = new Student(198, "张三", "男", 20);
		/*
		 * 两个对象的哈希值相同，才能计算出相同的下标位置
		 */
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		/*
		 * 即使求出相同下标，equals（）必须相等才能覆盖
		 */
		System.out.println(s1.equals(s2));
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(s1, 97);
		map.put(s2, 88);
		System.out.println(map);
	}
}

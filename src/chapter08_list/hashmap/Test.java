package chapter08_list.hashmap;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(198, "����", "��", 20);
		Student s2 = new Student(198, "����", "��", 20);
		/*
		 * ��������Ĺ�ϣֵ��ͬ�����ܼ������ͬ���±�λ��
		 */
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		/*
		 * ��ʹ�����ͬ�±꣬equals����������Ȳ��ܸ���
		 */
		System.out.println(s1.equals(s2));
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(s1, 97);
		map.put(s2, 88);
		System.out.println(map);
	}
}

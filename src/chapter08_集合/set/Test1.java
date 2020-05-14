package chapter08_����.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		Set<Integer> set;
		// set = new HashSet<Integer>();// ����
		set = new TreeSet<Integer>();// ����
		/*
		 * set����Ԫ�ز����ظ�
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
		
		// ����������
		System.out.println("����������");
		for (Iterator<Integer> c = set.iterator(); c.hasNext();) {
			Integer index = c.next();
			System.out.println(index);
		}

		// foreach ѭ��
		System.out.println("foreachѭ��");
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		// ������ѭ��
		System.out.println("������ѭ��");
		Iterator<Integer> a = set.iterator();
		while (a.hasNext()) {
			Integer b = a.next();
			System.out.println(b);
		}
	}
}

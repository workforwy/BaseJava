package chapter08_����.list;

import java.util.Iterator;
import java.util.LinkedList;

public class link {
	public static void main(String[] args) {
		/*
		 * <>���� ���Ƽ����д�ŵ��������� ���Ͳ�֧�ֻ�������
		 */
		LinkedList<String> s = new LinkedList<>();// �ڶ���string����ʡ��

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
		// ˫����������������Ч�ʸ�
		// ����������½�����������
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

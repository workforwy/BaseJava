package chapter08_����.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		Point a = new Point(1, 19);
		Point b = new Point(2, 27);
		Comparator<Point> comp = new Comparator<Point>() {
			/*
			 * ����o1��o2�Ƚϴ�С o1�󣬷������� o1С�����ظ��� ��ͬ������0
			 */
			@Override
			public int compare(Point o1, Point o2) {
				// ���෴�Ĺ���ʵ��
				// ��С�ȽϽ��Ҳ���෴��
				return o2.getY() - o1.getY();
			}
		};
		TreeMap<Point, String> map = new TreeMap<Point, String>(comp);// ���Ƚ���
		map.put(a, "1.9��");
		map.put(b, "2.7��");
		System.out.println(map);
	}
}

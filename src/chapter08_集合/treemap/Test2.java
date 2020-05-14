package chapter08_集合.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		Point a = new Point(1, 19);
		Point b = new Point(2, 27);
		Comparator<Point> comp = new Comparator<Point>() {
			/*
			 * 参数o1和o2比较大小 o1大，返回正数 o1小，返回负数 相同，返回0
			 */
			@Override
			public int compare(Point o1, Point o2) {
				// 按相反的规则实现
				// 大小比较结果也是相反的
				return o2.getY() - o1.getY();
			}
		};
		TreeMap<Point, String> map = new TreeMap<Point, String>(comp);// 外界比较器
		map.put(a, "1.9亿");
		map.put(b, "2.7亿");
		System.out.println(map);
	}
}

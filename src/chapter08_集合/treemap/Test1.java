package chapter08_集合.treemap;

import java.util.TreeMap;

public class Test1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(555, "5");
		map.put(111, "1");
		map.put(222, "2");
		map.put(333, "3");
		map.put(444, "4");
		map.put(555, "5");
		map.put(666, "6");
		map.put(777, "8");
		map.put(888, "7");
		map.put(555, null);
		// TreeMap 的键值不能是null。例如map.put（null，“---”）
		System.out.println(map.size());
		System.out.print(map);
		System.out.println(map.get(222));
		System.out.println(map.containsKey(333)); 
		System.out.println(map.containsValue("9"));
		System.out.println(map.containsValue(null));
		System.out.println(map.remove(444));
		System.out.print(map);

	}
}

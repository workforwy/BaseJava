package c08_list.hashmap;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "��1��ү");
		map.put(2, "��2��ү");
		map.put(3, "��3��ү");
		map.put(4, "��4��ү");
		map.put(5, "��5��ү");
		map.put(6, "��6��ү");
		map.put(7, "��7��ү");
		
		map.put(9, "��9��ү");
		map.put(9, "��9��ү");
		map.put(8, "��8��ү");
		map.put(9, null);
		map.put(null, "------");
		map.put(11, "����ɶ");
		map.put(null, "++++");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		System.out.println(map.remove(5));
		System.out.println(map);
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("��8��ү"));
	}
}

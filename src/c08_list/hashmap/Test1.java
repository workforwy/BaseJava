package c08_list.hashmap;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "你1大爷");
		map.put(2, "你2大爷");
		map.put(3, "你3大爷");
		map.put(4, "你4大爷");
		map.put(5, "你5大爷");
		map.put(6, "你6大爷");
		map.put(7, "你7大爷");
		
		map.put(9, "你9大爷");
		map.put(9, "你9大爷");
		map.put(8, "你8大爷");
		map.put(9, null);
		map.put(null, "------");
		map.put(11, "这是啥");
		map.put(null, "++++");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		System.out.println(map.remove(5));
		System.out.println(map);
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("你8大爷"));
	}
}

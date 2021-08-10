package chapter08_list.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1111, "1");
		map.put(2222, "2");
		map.put(3333, "3");
		map.put(4444, "4");
		map.put(5555, "5");
		map.put(6666, "6");
		map.put(8888, "8");
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		Set<Entry<Integer, String>> entries = map.entrySet();
		Collection<String> values = map.values();
		for (Iterator<Integer> a = keys.iterator(); a.hasNext();) {
			Integer b = a.next();
			System.out.println(b);
		}
		
		System.out.println("============================================");
		for (Iterator<Entry<Integer, String>> c = entries.iterator(); c.hasNext();) {
			Entry<Integer, String> d = c.next();
			Integer e = d.getKey();
			String f = d.getValue();
			System.out.println(e + "=" + f);
		}
		
		System.out.println("============================================");
		for (Entry<Integer, String> d : entries) {
			Integer e = d.getKey();
			String f = d.getValue();
			System.out.println(e + "=" + f);
		}

		System.out.println("============================================");
		for (Iterator<String> g = values.iterator(); g.hasNext();) {
			String h = g.next();
			System.out.println(h);
		}
	}
}

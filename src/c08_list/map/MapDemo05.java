package c08_list.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo05 {

    public static void main(String[] args) {
        Map<String, Integer> map =
                new TreeMap<String, Integer>();

        map.put("B", 100);
        map.put("A", 200);
        map.put("C", 300);
        System.out.println(map);

        //多线程并发访问map
        ConcurrentHashMap<String, String>
                map01 =
                new ConcurrentHashMap<String, String>();
        map01.put("A", "001");
        map01.put("D", "002");
        map01.put("C", "003");
        System.out.println(map01);
    }
}

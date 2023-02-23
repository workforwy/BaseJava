package c08_list.map;

import java.util.LinkedHashMap;

public class MapDemo04 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map =
                new LinkedHashMap<String, Integer>();
        //保证元素添加顺序
        map.put("B", 100);
        map.put("A", 200);
        map.put("C", 300);
        System.out.println(map);

    }
}


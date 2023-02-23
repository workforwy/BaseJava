package c08_list.map;

import java.util.*;
import java.util.Map.Entry;


public class MapDemo01 {


    public static void main(String[] args) {
        Map<String, Object> map =
                //1.底层哈希表
                //2.key相同值覆盖
                //3.不保证添加顺序
                new HashMap<String, Object>();

        map.put("key01", "A");
        map.put("key01", "B");
        map.put("key02", true);
        map.put("key03", null);
        System.out.println(map);

        //遍历map
        //1.先转换为set
        Set<Entry<String, Object>> set = map.entrySet();
        //2.获得set对象的迭代器
        Iterator<Entry<String, Object>> iterator = set.iterator();
        //3.迭代set集合
        while (iterator.hasNext()) {
            Entry<String, Object> e = iterator.next();
            System.out.println(e.getKey() + "/" + e.getValue());
        }
        //==============
        map.values();//获得所有值
        map.keySet();//获得所有key
        //map.containsKey(key);
        //map.containsValue(value);
        map.size();
        map.isEmpty();
        map.clear();


//        //排序
//        Collections.sort(list);
//        //洗牌
//        Collections.shuffle(list);
//        //二分查找(集合中元素是有序的)
//        Collections.binarySearch(list, key);
//        // 添加数据
//        Collections.addAll(c, elements);
    }
}


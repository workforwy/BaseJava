package c08_list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> set01 = null;
        //不允许元素重复
        //不保证元素添加顺序
        set01 = new HashSet<String>();
        set01.add("A");
        set01.add("A");
        set01.add("B");
        set01.add("C");
        set01.add("D");
        System.out.println(set01);
        //迭代集合中的元素
        Iterator<String> it =
                set01.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
        //================
        set01.isEmpty();
        set01.size();
        set01.contains("A");
        set01.clear();

    }
}


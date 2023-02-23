package c08_list.set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("D");
        list.add("C");
        list.add("A");
        list.add("C");

        TreeSet<String> set = new TreeSet<String>(list);
        System.out.println(set);

        list.clear();//清空集合中元素
        list.addAll(set);
        System.out.println(list);
    }
}


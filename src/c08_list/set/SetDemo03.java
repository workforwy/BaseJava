package c08_list.set;

import java.util.LinkedHashSet;

public class SetDemo03 {

    public static void main(String[] args) {

        //不允许重复
        //能保证添加顺序
        LinkedHashSet<String> list =
                new LinkedHashSet<String>();

        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
    }
}


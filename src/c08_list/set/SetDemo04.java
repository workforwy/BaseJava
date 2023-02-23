package c08_list.set;

import java.util.TreeSet;

public class SetDemo04 {
    public static void main(String[] args) {
        //特点？
        //1.不允许重复
        //2.能够对元素进行排序
        TreeSet<String> set = new TreeSet<>();
        set.add("D");
        set.add("B");
        set.add("C");
        set.add("C");
        System.out.println(set);
    }
}

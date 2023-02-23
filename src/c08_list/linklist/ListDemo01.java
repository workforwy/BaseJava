package c08_list.linklist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo01 {
    public static void main(String[] args) {
        //容器中的<String>表示泛型
        //泛型是编译时的一种类型
        //相当于在类或接口上添加了一个标签
        List<CharSequence> list = null;
        //object[]+相关操作
        list = new ArrayList<CharSequence>();
        //向容器中添加数据
        list.add("A");//添加到数组
        list.add(0, "B");

        List<String>
                list01 = new ArrayList<String>();
        list01.add("C");
        list01.add("D");

        list.addAll(list01);
        //list.addAll(0,list01);

        int size = list.size();
        System.out.println(size);
        System.out.println(list);

        boolean isContains =
                list.contains("A");

        CharSequence s =
                list.get(list.size() - 1);

        for (CharSequence c : list) {
            System.out.println(c);
        }

        boolean f = list.isEmpty();
        System.out.println("===iterator===");
        //借助迭代器迭代元素
        Iterator<CharSequence>
                it = list.iterator();
        //判定有没有下一个元素，同时会移动指针
        while (it.hasNext()) {
            CharSequence c = it.next();
            System.out.println(c);
        }

        //======================
        System.out.println("===listiterator===");
        ListIterator<CharSequence>
                lit = list.listIterator();

        while (lit.hasNext()) {
            //取出当前位置的值，并移动指针
            CharSequence c = lit.next();
            System.out.println(c);
            lit.set("A");//修改某个位置的值
        }
        System.out.println(list);
    }
}

package c08_list.linklist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 写一个程序，实现List集合中元素的倒置
 */
public class ListDemo03 {

    public static void main(String[] args) {
        List<String> list =
                //有序集合(保证添加顺序)
                //允许元素重复
                new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        //System.out.println(list);
        //reverse01(list);
        //reverse02(list);
        reverse03(list);
    }

    /**
     * 实现集合中元素的倒置
     */
    static void reverse01(List<String> list) {
        for (int i = 0, mid = list.size() >> 1, j = list.size() - 1;
             i < mid; i++, j--) {
            swap(list, i, j);
        }
        System.out.println(list);
    }

    /**
     * 实现元素的交换
     */
    private static void swap(List<String> list, int i, int j) {
        String temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    static void reverse02(List<String> list) {
        ListIterator<String> ltnext =
                list.listIterator();//默认指针指向0位置
        ListIterator<String> ltpre =
                list.listIterator(list.size());
        for (int i = 0, mid = list.size() >> 1; i < mid; i++) {
            String temp = ltnext.next();
            ltnext.set(ltpre.previous());
            ltpre.set(temp);
        }
        //......
        System.out.println(list);
    }

    //list.set....
    static void reverse03(List<String> list) {
        for (int i = 0, mid = list.size() >> 1, j = list.size() - 1;
             i < mid; i++, j--) {
            list.set(i, list.set(j, list.get(i)));
        }
        System.out.println(list);
    }


}

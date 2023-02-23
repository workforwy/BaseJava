package c08_list.linklist;

import java.util.LinkedList;

public class LinkedListDemo02 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("A");//头
        list.addLast("B");//尾
        list.addFirst("C");

        boolean flag =
                list.offerFirst("D");
        //在头添加
        list.offerFirst("E");

        //list.offerLast(e);
        //list.offer(e);//默认添加在last

        System.out.println(list);

        String e0 =
                list.removeFirst();
        list.removeLast();
        System.out.println(list);

        String e1 = list.peek();//默认取第一个
        list.peekLast();
        list.peekFirst();

        //

        System.out.println(e1);
        System.out.println(list);

        String e2 = list.pop();//移除第一个
        list.pollFirst();
        System.out.println(e2);
        System.out.println(list);


    }
}


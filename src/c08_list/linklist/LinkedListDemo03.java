package c08_list.linklist;

import java.util.LinkedList;

/**
 * 借助LinkedList实现栈结构
 */
class MyStack {
    private LinkedList<Object> stack =
            new LinkedList<Object>();

    public void push(Object obj) {
        stack.addLast(obj);
    }

    public Object pop() {
        return stack.removeLast();
    }
}

public class LinkedListDemo03 {
    public static void main(String[] args) {
        MyStack stact = new MyStack();
        stact.push("A");
        stact.push("B");
        stact.push("C");
        System.out.println(stact.pop());
        System.out.println(stact.pop());
        System.out.println(stact.pop());
    }
}


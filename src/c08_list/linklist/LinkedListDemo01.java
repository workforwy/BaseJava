package c08_list.linklist;

class MyLinkedList {
    private Node header = new Node();

    public MyLinkedList() {
    }

    class Node {//代表一个节点类型
        Object element;
        Object next;//直接后继指针
        Object pre;//直接前驱指针
    }
}

public class LinkedListDemo01 {
    public static void main(String[] args) {

    }
}


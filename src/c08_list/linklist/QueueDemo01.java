package c08_list.linklist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo01 {
    //运行在主线程(是进程中的最小执行单位)
    public static void main(String[] args) throws InterruptedException {
        Queue<String> q0 =//单重队列
                new LinkedList<String>();
        //Deque继承Queue(双重队列)
        Deque<String> q1 =
                new LinkedList<String>();

        //阻塞式队列(提供了一些阻塞式方法)
        BlockingQueue<String> q2 =
                //new ArrayBlockingQueue<String>(2);
                new LinkedBlockingQueue<String>(2);

        q2.add("A");
        q2.add("B");
        //q2.add("C");//非阻塞方法(满会抛异常)
        System.out.println(q2);
        //q2.put("C");
        //阻塞式方法(满了则等待)
        //System.out.println(q2);

        q2.remove();
        q2.remove();
        //q2.remove();//没有元素了则抛出异常
        q2.take();//阻塞式方法，没有元素则等待
        System.out.println(q2);
    }
}


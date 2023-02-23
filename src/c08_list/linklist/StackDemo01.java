package c08_list.linklist;

import java.util.Stack;

public class StackDemo01 {
    public static void main(String[] args) {
        //栈结构(First in Last Out)
        Stack<String> s =
                new Stack<String>();
        s.push("A");
        s.push("B");
        //取走栈顶元素(栈中元素会删除)
		/*String e1=s.pop();
		String e2=s.pop();*/

        //取出栈顶元素(但不会从栈中移除)
        String e1 = s.peek();
        System.out.println(s);
    }
}

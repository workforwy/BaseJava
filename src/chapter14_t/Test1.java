package chapter14_t;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        fun1();
    }

    private static void fun3() {
        Holder<String> h1 = new Holder<String>();
        Holder<Double> h2 = new Holder<Double>();
        h1.setValue("abc");
        h2.setValue(2.0);
        String s = h1.getValue();
        double d = h2.getValue();
        System.out.println(s);
        System.out.println(d);
    }

    private static void fun2() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("aaaa");
        arrayList.add(100);

        for (Object o : arrayList) {
            String item = (String) o;
            System.out.println(item);
        }
    }

    private static void fun1() {
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("泛型测试类型相同");
        }else {
            System.out.println("泛型测试类型不同");
        }
    }
}

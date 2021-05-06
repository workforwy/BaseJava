package chapter21_reflect.pack1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        fun_list();


    }

    private static void fun_list() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<String> list = new ArrayList<String>();// object[]
        list.add("A");
        list.add("B");
        // list.add(100);
        // Ҫ�󣺽�������,�ڳ�������ʱ��100��ӵ�����
        Class<?> c = list.getClass();
        Method m = c.getDeclaredMethod("add", Object.class);
        m.invoke(list, 100);
        System.out.println(list);
    }
}

package chapter21_reflect.pack1;

import chapter21_reflect.pack2.Activity;

import java.lang.reflect.Constructor;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("chapter21_reflect.pack1.Point");
        Object a = null;
        Object b = null;
        try {
            // 无参构造方法创建对象
            a = c.newInstance();
        } catch (Exception e) {
            System.out.println("不存在无参构造方法");
        }
        System.out.println(a);
        try {
            Constructor<?> con = c.getConstructor(Activity.class);
            b = con.newInstance(new Activity());
        } catch (Exception e) {
            System.out.println("不存在int参数构造方法");
        }
        System.out.println(b);
    }
}

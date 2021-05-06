package chapter21_reflect.pack1;

import chapter21_reflect.pack2.Activity;

import java.lang.reflect.Constructor;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("chapter21_reflect.pack1.Point");
        Object a = null;
        Object b = null;
        try {
            // �޲ι��췽����������
            a = c.newInstance();
        } catch (Exception e) {
            System.out.println("�������޲ι��췽��");
        }
        System.out.println(a);
        try {
            Constructor<?> con = c.getConstructor(Activity.class);
            b = con.newInstance(new Activity());
        } catch (Exception e) {
            System.out.println("������int�������췽��");
        }
        System.out.println(b);
    }
}

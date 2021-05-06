package chapter21_reflect.pack1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //获得Point类的类对象
        Class<?> c1 = Point.class;//类对象

        Point p1 = new Point();//类的对象
        Class<?> c2 = p1.getClass();//类对象

        Class<?> c3 = Class.forName("chapter21_reflect.pack1.Point");
        //说明:类对象在内存中只有一份.
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);

        //=========================

        //获得类对象中的属性对象

        Field fx = c2.getDeclaredField("x");//任意属性
        //c2.getField(name)//public属性
        //c2.getDeclaredFields();//Field[]
        //设置私有属性可访问
        fx.setAccessible(true);
        //给p1对象的fx属性赋值为10
        fx.set(p1, 10);
        //获得p1属性fx的值。
        int x = (Integer) fx.get(p1);
        System.out.println(x);

        //=======================
        //获得类对象中的方法对象
        //c2.getDeclaredMethods();
        //c2.getMethods()
        Method m = c2.getDeclaredMethod("setX", int.class);//Class
        System.out.println(m);
        m.setAccessible(true);
        //执行p1对象的m方法,代表m方法的返回值
        Object result = m.invoke(p1, 100);
        System.out.println(p1);
        System.out.println(result);
    }
}

package chapter21_reflect.pack1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //���Point��������
        Class<?> c1 = Point.class;//�����

        Point p1 = new Point();//��Ķ���
        Class<?> c2 = p1.getClass();//�����

        Class<?> c3 = Class.forName("chapter21_reflect.pack1.Point");
        //˵��:��������ڴ���ֻ��һ��.
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);

        //=========================

        //���������е����Զ���

        Field fx = c2.getDeclaredField("x");//��������
        //c2.getField(name)//public����
        //c2.getDeclaredFields();//Field[]
        //����˽�����Կɷ���
        fx.setAccessible(true);
        //��p1�����fx���Ը�ֵΪ10
        fx.set(p1, 10);
        //���p1����fx��ֵ��
        int x = (Integer) fx.get(p1);
        System.out.println(x);

        //=======================
        //���������еķ�������
        //c2.getDeclaredMethods();
        //c2.getMethods()
        Method m = c2.getDeclaredMethod("setX", int.class);//Class
        System.out.println(m);
        m.setAccessible(true);
        //ִ��p1�����m����,����m�����ķ���ֵ
        Object result = m.invoke(p1, 100);
        System.out.println(p1);
        System.out.println(result);
    }
}

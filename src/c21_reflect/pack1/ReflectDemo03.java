package c21_reflect.pack1;

import java.lang.reflect.Constructor;

class Context {
}

class View {
    public View(Context context) {
    }
}

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        // 获得类对象
        Class<?> c = Class.forName("day21.View");
        // 借助类对象构建类的对象
        // 默认会调用view类的无参构造方法
        // View v=(View)c.newInstance();
        // System.out.println(v);

        // 通过类对象获得类中的构造方法对象
        Constructor<?> cst = c.getDeclaredConstructor(Context.class);
        // 通过构造方法对象构建类的对象
        View v = (View) cst.newInstance(new Context());
        System.out.println(v);

    }
}

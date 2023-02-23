package c02_enum.innerclass;

class Outer04 {
    int a = 10;
    static int b = 20;

    public void onClick(final String s) {
        final int c = 30;
        /**
         * 局部内部类 1)定义在方法内部(不能使用static修饰) 2)可以访问方法外部所有成员 3)只能访问方法内部的使用final修饰的变量
         * 4)方法内部定义的内部类只能在方法内部构建对象
         */
        class Inner04 {
            public void show() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(s);
            }
        }
        new Inner04().show();
    }
}

public class App04 {

    public static void main(String[] args) {
        Outer04 outer = new Outer04();
        outer.onClick("hello,world");
    }
}


package chapter06_对象;

public class Test1 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    int v1 = 1;
    static int v2 = 2;

    static {
        System.out.println("A静态初始化");
    }

    public A() {
        System.out.println("A()");
    }
}

class B extends A {
    int v3 = 3;
    static int v4 = 4;

    static {
        System.out.println("B静态初始化");
    }

    public B() {
        System.out.println("B()");
    }
}

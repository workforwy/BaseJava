package chapter11_innerclass.pack2;

public class Test1 {
    public static void main(String[] args) {
        A.Inner2 inner2 = new A.Inner2();
        System.out.println("创建了静态内部类");
        A a = new A();
        A.Inner1 inner1 = a.new Inner1();
        System.out.println("新建了内部类");
    }
}

class A {

    class Inner1 {
    }

    static class Inner2 {
    }
}
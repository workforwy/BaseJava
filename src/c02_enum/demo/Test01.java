package c02_enum.demo;

class A{
    static int a;
    /**静态代码块*/
    static{
        a=100;
    }
    int b;
    /**实例代码块(构建对象时执行)*/
    {
        b=200;
    }
}

public class Test01 {

}


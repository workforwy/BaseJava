package c02_enum.innerclass;

class Class01 {
    public void run() {

    }
}

// 具体类
abstract class Class02 {
    abstract void run();
}

interface Interface01 {
}

interface Interface02 {
    void run();
}

class Outer05 {
    private Class01 c01;
    private Class02 c02;
    private Interface01 i01;
    private Interface02 i02;

    public Outer05() {
        final int m = 10;
        // 构建Class01类型的对象
        c01 = new Class01();
        // 构建Class01的子类类型(匿名内部类类型)对象
        c01 = new Class01() {// 匿名内部类
            @Override
            public void run() {// 选择重写
                super.run();
            }
        };
        c02 = new Class02() {// 匿名内部类
            @Override
            void run() {// 必须重写
            }
        };
        i01 = new Interface01() {
        };
        i02 = new Interface02() {
            @Override
            public void run() {
                System.out.println(m);
            }
        };
    }
}

public class App05 {
    public static void main(String[] args) {

    }
}


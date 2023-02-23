package c02_enum.innerclass;

class Outer02 {
    int a = 10;
    static int b = 20;

    /**
     * 实例内部类 1)类的内部，方法外部，没有static修饰 2)允许方法外部类所有成员 3)其对象依托于外部类对象
     */
    class Inner02 {
        public void show() {
            System.out.println("a=" + a);
            System.out.println("b=" + b);
        }
    }
}

public class App02 {
    public static void main(String[] args) {
        Outer02 outer = new Outer02();
        // 构建实例内部类对象，需要
        // 先构建外部类对象
        Outer02.Inner02 inner = outer.new Inner02();
        inner.show();
        // 构建实例内部类对象
        new Outer02().new Inner02().show();
    }
}

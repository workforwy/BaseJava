package c02_enum.innerclass;

class Outer03 {
    static int a = 20;

    /**
     * 静态内部类 1)类的内部，方法外部，使用static修饰 2)只能访问外部类静态成员 3)对象不依托于外部类对象而存在
     */
    static class Inner03 {
        public void show() {
            System.out.println(a);
        }
    }
}

public class App03 {
    public static void main(String[] args) {
        new Outer03.Inner03().show();
    }
}


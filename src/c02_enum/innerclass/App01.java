package c02_enum.innerclass;

interface IOuter01 {
    void run();
}

class Outer01 {
    /** 实例内部类 */
    class Inner01 {
    }

    /** 静态内部类 */
    static class StaticInner01 {
    }

    public void execute() {
        /** 局部内部类 */
        class LocalInner {
        }
    }

    public void call() {
        IOuter01 outer01 = new IOuter01() {// 匿名内部类
            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        };
    }

    private IOuter01 outer02 = new IOuter01() {// 匿名内部类
        @Override
        public void run() {
        }
    };
}

public class App01 {
    public static void main(String[] args) {
        Outer01 outer01 = new  Outer01();

    }
}


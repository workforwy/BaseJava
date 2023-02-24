package c01_single;

/**
 * 单例
 */
class Singleton01 {//适合场合:小对象,频繁用

    private Singleton01() {
    }

    /**
     * 类加载时就会构建对象
     */
    private static Singleton01 instance =
            new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }
}

/**
 * 单例的另一种实现
 */
enum Singleton02 {
    INSTANCE;//public static

    private Singleton02() {
    }

    public void method() {
    }
}

/**
 * 单例的另一种实现
 */
class Singleton03 {//大对象，稀少用

    private Singleton03() {
        System.out.println("Singleton03()");
    }

    private static Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }//延迟对象的构建
        return instance;
    }

    public void method() {
    }

    public static void display() {
    }
}

/**
 * 单例的另外一种实现
 */
class Singleton04 {
    public Singleton04() {
        System.out.println("Singleton04()");
    }

    static class Inner {//Singleton04$Inner.class
        public static final Singleton04
                instance = new Singleton04();
    }

    public void method() {
    }

    public static void display() {
    }
}

public class SingletonDemo01 {
    public static void main(String[] args) {
        // Singleton02.INSTANCE.method();
//	   Singleton03.display();
//	   Singleton03.getInstance().method();
        Singleton04.display();
        Singleton04.Inner.instance.method();
        Singleton04.Inner.instance.method();
        Singleton04.Inner.instance.method();
    }
}

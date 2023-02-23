package c12_date;

class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * equals方法用于比较两个对象，默认
     * 比较对象地址，假如希望比较内容，
     * 则需要对其进行重写
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        //if(!(obj instanceof Point))return false;
        if (this.getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        //getClass().getName()+"@"+Integer.toHexString(hashCode());
        //System.out.println("toString");
        //return "x="+x+";y="+y;
        return super.toString();
    }

}

public class ObjectDemo01 {


    public static void main(String[] args) throws CloneNotSupportedException {
        //method01();
        //method02();
        method03();
    }

    public static void method03() throws CloneNotSupportedException {
        Point p1 = new Point(10, 20);
        //希望克隆p1对象
        Object p2 = p1.clone();
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }

    public static void method02() {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        System.out.println(p1 == p2);//比较地址
        boolean flag = p1.equals(p2);//比较内容
        System.out.println(flag);
        System.out.println("p1.hashCode()=" + p1.hashCode());
        System.out.println("p2.hashCode()=" + p2.hashCode());
    }

    //alt+shift+m
    private static void method01() {
        Point p1 = new Point(10, 20);
        System.out.println(p1);
        //默认会调用point对象的toString方法

        Point p2 = new Point(30, 40);
        System.out.println(p2);
        //p1,p2指向的是不同的类的对象(new Point)
        System.out.println(p1 == p2);//false

        Class<?> c1 = p1.getClass();//类对象
        Class<?> c2 = p2.getClass();//类对象
        //类对象，在类加载时创建，任何一个类，它的类对象只有一个
        System.out.println(c1);//toString
        System.out.println(c2);
        //C1,C2指向的是同一个类对象
        System.out.println(c1 == c2);//true
    }
}


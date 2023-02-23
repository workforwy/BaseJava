package c08_list.set;

import java.util.HashSet;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }

    /**
     * 当将一个对象存储到set集合时
     * 首先会调用对象的hashCode方法
     * 根据对象的hashCode方法的返回值
     * 绝对对象在哈希表中的一个存储位置
     * 假如对象的hashCode值相同，则会
     * 调用对象的equals方法进行比较，
     * 假如equals方法的返回值也相同，
     * 对象则不进行存储，假如equals方法
     * 返回值不同，则在相同位置进行
     * 链状存储？
     * <p>
     * hashCode方法重写规则：
     * 对象不同，hashCode尽量也不要相同
     */
    @Override
    public int hashCode() {
        final int prime = 31;//经验值
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        System.out.println("hashCode");
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

}

public class SetDemo02 {

    public static void main(String[] args) {
        HashSet<Point> set =
                new HashSet<Point>();

        set.add(new Point(1, 2));
        set.add(new Point(1, 2));
        set.add(new Point(3, 4));

        System.out.println(set.size());
        System.out.println(set);

    }
}


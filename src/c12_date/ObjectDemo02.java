package c12_date;

/**
 * 试题
 */
class Question implements Cloneable {
    /**
     * 试题的标题
     */
    //字符串比较时调用equals方法
    private String title;
    /**
     * 试题分数
     */
    private int score;

    public Question() {
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Question(String title, int score) {
        this.title = title;
        this.score = score;
    }

    @Override
    protected Object clone() {
        Question q = new Question();
        q.title = this.title;
        q.score = this.score;
        return q;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return title + "/" + score;
    }

    /**
     * 方法如何重写由业务决定
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass())
            return false;
        Question other = (Question) obj;
        if (this.score != other.score)
            return false;
        if (this.title == null) {
            return false;
        }
        return this.title.equals(other.title);
    }

    //回调函数，当JVM回收此对象占用的内存时，会调用此方法
    @Override
    protected void finalize() {
        //super.finalize();
        System.out.println("finalize()");
    }
}

public class ObjectDemo02 {
    static Question staticQ;

    public static void main(String[] args) {
        //1.重写Object类的toString方法，输出内容
        //2.重写Object类的equals方法用于比较内容
        //3.重写Object类的clone方法允许对象克隆
        // method01();
        method02();
        //通知垃圾回收器，内存有垃圾了
        System.gc();
        //while(true);
    }

    static void method02() {
        Question q =
                new Question();
        staticQ = q;
        //staticQ=null;
    }

    public static void method01() {
        Question q1 = new Question();
        Question q2 = new Question("titleA", 5);
        System.out.println(q1 == q2);
        q1.setScore(5);
        System.out.println(q1.equals(q2));

        Question q3 = (Question)
                q2.clone();
        System.out.println(q2.equals(q3));
    }

}


package chapter01;

public class Test3 {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            double d = Math.random();// 系统随机产生的数据
            if (d > 0.9) {
                System.out.println("第" + i + "次" + d);
                return;
            }
            System.out.println("第" + i + "次" + d);
        }
    }
}

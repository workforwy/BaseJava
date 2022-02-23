package c03_for.pack1;

public class Test3 {
    public static void main(String[] args) {
//        for (int i = 1; ; i++) {
//            double d = Math.random();// 系统随机产生的数据
//            if (d > 0.9) {
//                System.out.println("第" + i + "次" + d);
////                return;
//                break;
////                continue;
//            }
////            System.out.println("第" + i + "次" + d);
//        }

        double d;
        int i = 1;
        do {
            d = Math.random();// 系统随机产生的数据
            System.out.println("第" + i + "次" + d);
            i++;
        } while (d < 0.9);
    }
}

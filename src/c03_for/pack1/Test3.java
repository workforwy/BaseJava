package c03_for.pack1;

public class Test3 {
    public static void main(String[] args) {
//        for (int i = 1; ; i++) {
//            double d = Math.random();// ϵͳ�������������
//            if (d > 0.9) {
//                System.out.println("��" + i + "��" + d);
////                return;
//                break;
////                continue;
//            }
////            System.out.println("��" + i + "��" + d);
//        }

        double d;
        int i = 1;
        do {
            d = Math.random();// ϵͳ�������������
            System.out.println("��" + i + "��" + d);
            i++;
        } while (d < 0.9);
    }
}

package chapter01;

public class Test4 {
    public static void main(String[] args) {
        for (int t = 1; t <= 100; t++) {
            if (t % 10 == 3 || t % 10 == 5 || t % 10 == 7) {
//                continue;
//                 return;
                 break;
            }
            System.out.println(t);
        }
    }
}

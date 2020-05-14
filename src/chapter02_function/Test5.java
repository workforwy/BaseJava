package tarena_day0303;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("输入半径：");
        double r = new Scanner(System.in).nextInt();
        double π = 3.14;
        double l = 2 * π * r;
        double s = π * r * r;
        System.out.println("周长是：" + l);
        System.out.println("面积是：" + s);
    }
}

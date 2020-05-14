package chapter02_function;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("年份：");
        int y = new Scanner(System.in).nextInt();
        System.out.println("月份 ：");
        int m = new Scanner(System.in).nextInt();
        int x = jiasuan(m, y);
        System.out.println(x);
    }

    private static int jiasuan(int m, int y) {
        int x = 0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                x = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                x = 30;
                break;
            case 2:
                if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                    x = 29;
                } else {
                    x = 28;
                }
                break;
        }
        return x;
    }
}

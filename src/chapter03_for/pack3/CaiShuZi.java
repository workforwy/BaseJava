package tarena.day0408;

import java.util.Random;
import java.util.Scanner;

public class CaiShuZi {
    public static void main(String[] args) {
        int r = 1 + new Random().nextInt(1000);// 产生0到1000（不包括1000）的整数
        /*
         * 显示提示 无限死循环 提示猜 获得输入的值赋给变量c- 如果c>r, 显示大 如果c<r,显示小 否则 显示对 break
         */
        System.out.println("已经随机产生了一个数,请猜一猜这个数");
        while (true) {
            System.out.println("请输入你猜的数：");
            int c = new Scanner(System.in).nextInt();
            if (c > r) {
                System.out.println("猜大了，再猜.....");
            } else if (c < r) {
                System.out.println("猜小了，再猜.....");
            } else {
                System.out.println("恭喜你猜对啦~~~~~");
                break;
            }
        }
    }
}

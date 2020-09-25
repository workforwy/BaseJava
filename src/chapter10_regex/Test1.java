package chapter10_regex;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        fun1();
    }

    /**
     * 12345678
     * 1234567
     * （010）12345678
     * （0101）1234567
     * 010-12345678
     * 0101-12345678
     * <p>
     * (\\d{3,4}-|\\d{3,4}\\))? \\d{7,8}
     */
    private static void fun1() {
        System.out.println("输入固定电话号码：");
        String s = new Scanner(System.in).nextLine();
        String r = "(\\d{3,4}-|\\( \\d{3,4} \\) )? \\d{7,8}";
        // 判断当前字符串，能否与正则表达式匹配
        if (s.matches(r)) {
            System.out.println("格式正确");
        } else {
            System.out.println("格式错误");
        }
    }
}

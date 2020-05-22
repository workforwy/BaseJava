package chapter08_jihe.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("生成一个数组:");
        Collections.addAll(list, "162", "62", "12", "92", "112", "132", "122", "1612");
        System.out.println(list);

        System.out.println("按字符第一个数字大小排列数组：");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("按一定规则（大小）排列数组:");
        Collections.sort(list, new Comparator<String>() {

            @Override // 匿名类
            public int compare(String o1, String o2) {
                int a = Integer.parseInt(o1);
                int b = Integer.parseInt(o2);
                if (a > b) {
                    return 1;
                } else if (a < b) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(list);
    }
}

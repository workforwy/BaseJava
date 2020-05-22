package chapter08_jihe.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("����һ������:");
        Collections.addAll(list, "162", "62", "12", "92", "112", "132", "122", "1612");
        System.out.println(list);

        System.out.println("���ַ���һ�����ִ�С�������飺");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("��һ�����򣨴�С����������:");
        Collections.sort(list, new Comparator<String>() {

            @Override // ������
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

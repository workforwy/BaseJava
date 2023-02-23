package c09_string;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.UUID;

public class StringDemo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char c[] = {'A', 'B', 'C'};
        String str = new String(c);
        System.out.println(str);
        //获得字符串的字节
        byte buf[] = str.getBytes();
        System.out.println(buf.length);

        String s1 = "中";//GBK
        System.out.println(s1.getBytes().length);//2

        System.out.println(s1.getBytes("utf-8")//3
                .length);

        String s2 = "abcdb";
        s2.toUpperCase();
        s2.toLowerCase();
        char bf[] = s2.toCharArray();
        $(s2.toLowerCase(Locale.CHINESE));
        char c1 = s2.charAt(0);
        System.out.println(c1);
        boolean f = s2.contains("ab");
        System.out.println(f);
        //查找
        int n1 = s2.indexOf("b");
        System.out.println(n1);
        int n2 = s2.lastIndexOf("b");
        System.out.println(n2);
        //取子串
        String s3 = s2.substring(s2.lastIndexOf("d"));
        System.out.println(s3);
        //s2.substring(beginIndex, endIndex)
        String fileName = "abc.jpeg";
        fileName = UUID.randomUUID().toString() + fileName.substring(fileName.lastIndexOf("."));
        System.out.println(fileName);
    }

    static void $(String s) {
        System.out.println(s);
    }
}

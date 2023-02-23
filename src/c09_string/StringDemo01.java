package c09_string;

public class StringDemo01 {
    public static void main(String[] args) {
        //父类引用指向子类对象
        CharSequence cs =
                new String("helloworld");
        //String
        //字符串本身是一个常量，此常量会存储
        //在一个字符串池中
        String s1 = "ABC";
        //获得字符串中字符的个数
        int len = s1.length();
        String s2 = "ABC";
        System.out.println(s1 == s2);

        String s3 = "A";//常量(不可变)
        String s4 = "B";
        String s5 = "A" + "B";//"AB" (编译器会自动进行优化)
        String s6 = "AB";
        String s7 = s3 + s4;//"AB" (此时并不会池中取)
        //s7相当于执行了new String("AB");
        System.out.println(s5 == s6);//true
        System.out.println(s6 == s7);//false
    }
}

package c01;

public class Test3 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 97;
        char c5 = '\u0061';
        // char����16����ǰ׺
        char c3 = '��';
        char c4 = 20013;
        // ����16����ǰ׺
        char c6 = 0x4e2d;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c5);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c6);
    }
}

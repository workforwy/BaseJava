package c09_string;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuffer s=
                new StringBuffer();
        s.append("A")
                .append(true)
                .append(100);
        System.out.println(s);

    }
}

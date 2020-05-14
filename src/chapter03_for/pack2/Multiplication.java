package chapter03_for.pack2;

public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
        ceshi();
    }

    static void ceshi() {
        String aString = "0.8T";
        double a = Double.parseDouble(aString.substring(0, aString.indexOf("T")));
        System.out.println(a);
    }
}

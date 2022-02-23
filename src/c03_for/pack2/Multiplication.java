package c03_for.pack2;

public class Multiplication {


    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >=1; j--) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }

    }
    static void ceshi() {
        String aString = "66666666T";
        double a = Double.parseDouble(aString.substring(0, aString.indexOf("T")));
        System.out.println(a);
    }
}

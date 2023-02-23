package c01.api;

class Box01 {
    byte t0;
    Byte t1;
    boolean flag01;//false
    Boolean flag02;//null
}

public class BoxDemo01 {
    public static void main(String[] args) {
        Box01 b01 = new Box01();
        System.out.println(b01.t0);
        System.out.println(b01.t1);
        System.out.println("b01.flag01=" + b01.flag01);
        System.out.println("b01.flag02=" + b01.flag02);
		/*if(b01.flag02){
			System.out.println(b01.flag02);
		}*/

    }
}


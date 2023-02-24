package c01_single.api;

public class BoxDemo04 {
    public static void main(String[] args) {
        String str01 = "123";
        String str02 = "123A";
        //将字符串转换为整数
        int n1 = Integer.parseInt(str01);
        //n1=Integer.valueOf(str01);

        //有异常
        //int n2=Integer.parseInt(str02);
        String str03 = String.valueOf(n1);
        //整数转换为字符串
        str03 = Integer.toString(n1);
        System.out.println(str03);
        String str04 = "false";
        boolean flag = Boolean.valueOf(str04);
        System.out.println(flag);
        //....


    }
}

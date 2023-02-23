package c12_date;

import java.io.IOException;

public class RuntimeDemo01 {
    public static void main(String[] args) throws IOException {
        //退出虚拟机
        //Runtime.getRuntime().exit(0);
        //启动其它程序
        Process pro =
                Runtime.getRuntime()
                        .exec("C:\\Windows\\System32\\notepad.exe");
        //在java中可以通过Runtime对象启动一个进程
        System.out.println(pro.getClass().getName());

        //pro.destroy();//用于杀死进程
    }
}

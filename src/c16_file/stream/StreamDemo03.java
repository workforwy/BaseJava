package c16_file.stream;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;

public class StreamDemo03 {

    public static void main(String[] args) throws Exception {
        FileInputStream in =
                new FileInputStream(new File("lyfa.jpg"));
        System.out.println("in.available()=" + in.available());
        //字节数组输出流
        //可以借助此对象临时存储从外界读到程序的数据
        ByteArrayOutputStream bos =
                new ByteArrayOutputStream();
        int len = -1;
        byte buf[] = new byte[2048];
        while ((len = in.read(buf)) != -1) {
            //System.out.println("in.available()="+in.available());
            bos.write(buf, 0, len);
        }
        byte data[] = bos.toByteArray();
        System.out.println(data.length);
        bos.close();
        in.close();


    }
}


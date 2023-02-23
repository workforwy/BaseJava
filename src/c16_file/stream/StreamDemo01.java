package c16_file.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class StreamDemo01 {

    public static void main(String[] args) {
        File file =
                new File("a1.txt");
        //write(file);
        read(file);

    }

    /**
     * 读数据
     */
    private static void read(File file) {
        InputStream in = null;
        int data = -1;
        byte buf[] = new byte[5];
        //1.构建输入流对象
        try {
            in = new FileInputStream(file);
            //2.读数据
	    /*while((data=in.read())!=-1){
	    System.out.println((char)data);
	    }*/
            while ((data = in.read(buf)) != -1) {//data表示读取的字节的个数
                for (int i = 0; i < data; i++) {
                    System.out.print((char) buf[i] + ",");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.释放资源
            if (in != null) try {
                in.close();
            } catch (IOException e) {
            }
            ;
        }
    }

    /**
     * 写数据
     */
    private static void write(File file) {
        OutputStream out = null;
        try {
            //1.构建输出流对象
            out = new FileOutputStream(file, true);//true表示追加
            //2.向文件写入数据
            out.write(100);//一次写一个字节
            out.write("helloworld".getBytes());
            out.write('A');
            System.out.println("write OK!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //System.err.println("file not found");
            //System.err.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {//最终执行代码块
            //3.释放资源
            if (out != null)
                try {
                    out.close();
                } catch (IOException e) {
                }
        }
    }
}

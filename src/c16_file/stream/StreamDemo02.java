package c16_file.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 写一个方法实现文件复制
 */
public class StreamDemo02 {
    static void copy01(File src, File dest) {
        InputStream in = null;
        OutputStream out = null;
        int data = -1;
        try {
            //1.构建流对象
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            //2.读写数据
            long startTime = System.nanoTime();
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            long endTime = System.nanoTime();
            long time = endTime - startTime;
            System.out.println("copy ok!time=" + time);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.释放资源
            if (in != null) try {
                in.close();
            } catch (Exception e) {
            }
            if (out != null) try {
                out.close();
            } catch (Exception e) {
            }
        }
    }

    static void copy02(File src, File dest) {
        InputStream in = null;
        OutputStream out = null;
        int len = -1;
        byte buf[] = new byte[1024];
        try {
            //1.构建流对象
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            //2.读写数据
            long startTime = System.nanoTime();
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            long endTime = System.nanoTime();
            long time = endTime - startTime;
            System.out.println("copy ok!time=" + time);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.释放资源
            if (in != null) try {
                in.close();
            } catch (Exception e) {
            }
            if (out != null) try {
                out.close();
            } catch (Exception e) {
            }
        }
    }

    static void copy03(File src, File dest) {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        byte[] buf = new byte[1024];
        int len = -1;
        //1.构建流对象(用缓冲流套接文件流)
        try {
            in = new BufferedInputStream(
                    new FileInputStream(src));
            out = new BufferedOutputStream(
                    new FileOutputStream(dest));
            //2.读写数据
            long startTime = System.nanoTime();
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);//将数据写到缓冲区
            }//缓冲区满了以后会自动刷新(将数据会写到文件)
            //out.flush();
            long endTime = System.nanoTime();
            System.out.println("拷贝ok,time=" + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //3.释放资源
            if (in != null) try {
                in.close();
            } catch (Exception e) {
            }
            if (out != null) try {
                out.close();
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        File src = new File("lyfa.jpg");
        File dest = new File("cp01.jpg");
        //copy01(src, dest);
        copy03(src, dest);
    }
}


package c16_file.rw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 * 通过FileWriter/FileReader实现文件的拷贝
 * 例如：文件放在项目的根目录
 */
public class ReaderWriterDemo01 {
    static void copy01(File src, File dest) {
        FileReader in = null;
        FileWriter out = null;
        char buf[] = new char[1024];
        int len = -1;
        try {
            //1.构建流对象
            in = new FileReader(src);//按系统默认编码读
            out = new FileWriter(dest);
            //2.读写文件
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            System.out.println("copy ok");
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

    static void copy02(File src, File dest) {
        BufferedReader in = null;
        BufferedWriter out = null;
        char buf[] = new char[1024];
        int len = -1;
        try {
            //1.构建流对象
            in = new BufferedReader(new FileReader(src));
            out = new BufferedWriter(new FileWriter(dest));
            //2.读写文件
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            System.out.println("copy ok");
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

    static void copy03(File src, File dest) {
        BufferedReader in = null;
        PrintWriter out = null;
        char buf[] = new char[1024];
        int len = -1;
        try {
            //1.构建流对象
            in = new BufferedReader(new FileReader(src));
            out = new PrintWriter(new FileWriter(dest));
            //2.读写文件
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            System.out.println("copy ok");
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

    /**
     * 要求以指定编码实现文件复制
     */
    static void copy04(File src, File dest) {
        InputStreamReader in = null;
        OutputStreamWriter out = null;
        char buf[] = new char[1024];
        int len = -1;
        //1.构建流对象
        try {
            in = new InputStreamReader(
                    new FileInputStream(src),
                    Charset.forName("utf-8"));
            out = new OutputStreamWriter(
                    new FileOutputStream(dest),
                    Charset.forName("utf-8"));
            //2.读写数据
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            out.flush();
            System.out.println("copy ok");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //3.释放资源
            //....
        }
    }

    static void copy05(File src, File dest) {
        BufferedReader in = null;
        PrintWriter out = null;
        String content = null;
        //1.构建流对象
        try {
            in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(src),
                            Charset.forName("utf-8")));

            out = new PrintWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(dest),
                            Charset.forName("utf-8")), true);//true表示自动刷新

            //2.读写数据
            while ((content = in.readLine()) != null) {
                out.println(content);//读一行写一行
            }
            System.out.println("copy ok");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //3.释放资源
            //....
        }
    }

    public static void main(String[] args) {
        File src = new File("src/day18/ReaderWriterDemo01.java");
        File dest = new File("ReaderWriterDemo01.java");
        //copy01(src, dest);
        //copy02(src, dest);
        //copy03(src, dest);
        copy04(src, dest);
    }
}



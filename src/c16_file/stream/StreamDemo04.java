package c16_file.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class StreamDemo04 {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream p = System.out;
        p.println("helloworld");

        p = new PrintStream(
                new File("a.txt"));
        p.println("hello");
        p.println("world");
        p.close();

        p = new PrintStream(
                new FileOutputStream(
                        new File("a.txt")),
                false, "GBK");//utf-8

        p.println("中国");

        p.close();


    }
}


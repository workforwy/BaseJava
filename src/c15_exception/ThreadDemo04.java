package c15_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.management.RuntimeErrorException;

class C {
    public void method() {
        InputStream in = null;
        try {
            in = new FileInputStream("f");
            in.read();
        } catch (IOException ignored) {
        }
    }
}

public class ThreadDemo04 {

    static void method()
            throws FileNotFoundException, IOException {
        InputStream in = null;
        try {
            in = new FileInputStream("a.txt");
            int n = in.read();
        } finally {
            if (in != null) in.close();
        }
    }

    static int method02(int a) {
        try {
            if (a < 10) {
                throw new RuntimeException("ep");
            }
            return 100;
        } catch (Exception e) {
            return 200;
        } finally {
            System.out.println("finally");
            //return 300;
        }
    }

    public static void main(String[] args) {
        int result = method02(8);
        System.out.println(result);
    }
}


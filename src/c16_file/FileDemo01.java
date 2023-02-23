package c16_file;

import java.io.File;

public class FileDemo01 {

    public static void main(String[] args) {
        //File类型的对象代表了磁盘中的目录或文件
        //它会根据具体路径进行相关判定
        File f1 = new File("D:\\qlwork1511");
        //判定此file对象对应的是否是目录
        if (f1.isDirectory()) {
            System.out.println("f1是目录!");
        }
        File f2 = new File("D:\\qlwork1511\\Day17\\Day17.txt");
        if (f2.isFile()) {
            System.out.println("f2是文件!");
        }
        System.out.println(f2.isHidden());//false
        System.out.println(f2.isAbsolute());//true

        File f3 = new File("src/day17/FileDemo01.java");
        //判定文件是否存在
        if (f3.exists()) {
            System.out.println(f3.getPath());//相对路径
            System.out.println(f3.getAbsolutePath());//绝对路径
            System.out.println(f3.isAbsolute());//false
        }
    }
}


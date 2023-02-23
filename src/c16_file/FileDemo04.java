package c16_file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo04 {
    public static void main(String[] args) {
        File f = new File("D:\\qlwork1511");
        //获得目录中所有文件
        File fs[] = f.listFiles();
        //获得目录中指定文件
        fs = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir,
                                  String name) {
                //判定文件名是否是以".zip"结尾
                return name.endsWith(".zip");
            }
        });
        for (File f1 : fs) {
            System.out.println(f1.getAbsolutePath());
        }
        fs = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(
                    File file) {
                return file.isFile() &&
                        file.getName()
                                .endsWith(".txt");
            }
        });
        for (File f1 : fs) {
            System.out.println(
                    f1.getAbsolutePath());
        }
    }
}


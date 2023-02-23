package c16_file;

import java.io.File;

public class FileDemo05 {
    /*递归删除指定目录中的所有file*/
    public static void main(String[] args) {
        //找到要删除的目录
        File file =
                new File("d:/files");
        //删除此目录中的file
        delete(file);
    }

    private static void delete(File file) {
        //获得指定目录中所有file
        File fs[] = file.listFiles();
        if (fs == null) return;
        //遍历所有file
        for (File f : fs) {
            //判定此file是目录还是文件
            if (f.isDirectory()) {
                //假如是目录要递归找到目录中的文件
                delete(f);
            }
            //假如是文件则直接删除
            f.delete();
        }
        //删除当前目录(最外层的)
        file.delete();
    }
}

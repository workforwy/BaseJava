package c16_file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileDemo03 {
    //对于一个URI而言通常有三部分构成
    //schema:/权威(例如www.baidu.com)/path
    //例如: http://www.baidu.com/index.html
    //ftp://code.tarena.com.cn/
    //file://files/a.txt
    //content://notes/note;
    public static void main(String[] args) throws URISyntaxException, IOException {
        // URI uri=new URI("file:/a4.txt");
        //统一资源标识
        URI uri = URI.create("file:/a5.txt");
        File file =
                new File(uri);
        System.out.println(file.getAbsolutePath());
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println(file.getName());
        //file.setReadOnly();
        //file.setWritable(true);
        //file.delete();
        //file.renameTo(dest);
    }
}


package c16_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

//文件或目录的创建
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //构建一个File对象
        File file =
                new File("d:/files/day17");
        //判定File是否存在，不存在则创建目录
        if (!file.exists()) {
            //file.mkdir();//只能创建一级目录
            file.mkdirs();
        }
        //构建一个File对象
        file = new File("d:/files/day17/a.jpg");
        //判定File是否存在，不存在则创建文件
        if (!file.exists()) {
            boolean flag = file.createNewFile();
            System.out.println(flag ? "创建OK" : "创建失败");
        }
        //获得系统使用的分隔符
        String s = File.separator;

        file = new File("d:" + s + "images" + s + "day17/m.jpg");
        //获得文件所在目录
        File dir = file.getParentFile();
        //判定目录是否存在
        if (!dir.exists()) {
            dir.mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        //根据当前日期创建目录

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd");
        String str =
                sdf.format(new Date());//2015/12/21
        file = new File(str);//相对路径
        if (!file.exists())
            file.mkdirs();
        file = new File(file,
                UUID.randomUUID().toString()
                        + ".jpg");
        System.out.println(file.getPath());
        if (!file.exists())
            file.createNewFile();
    }
}
//

package c16_file.rw;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读写工具类
 */
public class RandomAccessFileDemo01 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile r =
                new RandomAccessFile(
                        "r1.txt",//文件不存在则创建
                        "rw");
        print(r);
        r.writeInt(65);
        print(r);//4
        r.writeBoolean(true);
        print(r);//5
        System.out.println("r.length()=" + r.length());
        r.seek(0);

        int n = r.readInt();
        System.out.println(n);
        System.out.println(
                r.readBoolean());
        r.writeChar('C');
        print(r);
        r.seek(0);
        r.skipBytes(5);
        System.out.println(
                r.readChar());
        //释放资源
        r.close();
    }

    private static void print(RandomAccessFile r) throws IOException {
        long point =
                r.getFilePointer();
        System.out.println(
                "pointer=" + point);
    }
}


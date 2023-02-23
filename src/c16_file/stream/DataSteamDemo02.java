package c16_file.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/***
 * DataInputStream
 * DataOutputStream
 * @author pjy
 */
public class DataSteamDemo02 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos =
                new ByteArrayOutputStream();
        DataOutputStream out =
                new DataOutputStream(bos);

        out.writeInt(1000);
        out.writeBoolean(true);
        out.writeChar('A');//2个字节
        out.writeUTF("china");

        System.out.println(
                Arrays.toString(bos.toByteArray()));

        DataInputStream in =
                new DataInputStream(
                        new ByteArrayInputStream(
                                bos.toByteArray()));

        int num = in.readInt();
        boolean flag = in.readBoolean();
        char c = in.readChar();
        String s = in.readUTF();

        System.out.println(num + "/" + flag + "/" + c + "/" + s);

        out.close();
        in.close();
    }
}


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
public class DataSteamDemo03 {
    public static void main(String[] args) throws IOException {

        DataOutputStream out =
                new DataOutputStream(
                        System.out);

        out.writeInt(1000);
        out.writeBoolean(true);
        out.writeChar('A');//2个字节
        out.writeUTF("china");
        out.close();
    }
}

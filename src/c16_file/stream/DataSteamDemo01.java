package c16_file.stream;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * DataInputStream
 * DataOutputStream
 * @author pjy
 */
public class DataSteamDemo01 {
    public static void main(String[] args) throws IOException {
        DataOutputStream out =
                new DataOutputStream(
                        new FileOutputStream(
                                new File("a1.txt")));

        out.writeInt(1000);
        out.writeBoolean(true);
        out.writeChar('A');
        out.writeUTF("china");

        DataInputStream in =
                new DataInputStream(
                        new FileInputStream(
                                new File("a1.txt")));

        int num = in.readInt();
        boolean flag = in.readBoolean();
        char c = in.readChar();
        String s = in.readUTF();

        System.out.println(num + "/" + flag + "/" + c + "/" + s);

        out.close();
        in.close();


    }
}

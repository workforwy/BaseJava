package chapter17_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 数据读取规则
 * @author 1
 *
 */
public class Test5 {
	public static void main(String[] args) throws Exception {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("d:/abc/f5"));
		out.write(356);
		out.writeInt(356);
		out.writeDouble(356.0);
		out.writeChar('t');
		out.writeChars("安卓");
		out.writeUTF("安卓");
		out.close();
		DataInputStream in = new DataInputStream(new FileInputStream("d:/abc/f5"));
		System.out.println(in.read());
		System.out.println(in.readInt());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());
		System.out.println(in.readChar());
		System.out.println(in.readChar());
		System.out.println(in.readUTF());
	}
}
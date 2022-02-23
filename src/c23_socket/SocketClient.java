package c23_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 客户端程序
 */
public class SocketClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 7777);
			System.out.println("客户端连接成功");
			
			// 接收服务端的应答
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String str = dis.readUTF();
			System.out.println("service说:" + str);
			
			// 输出内容给服务端
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			Scanner sc = new Scanner(System.in);
			while (true) {
				String line = sc.nextLine();
				dos.writeUTF(line);
				dos.flush();
				// 读取服务端的应答
				String str2 = dis.readUTF();
				System.out.println("service说:" + str2);
				if (str2.equals("回见")) {
					break;
				}
			}
			dis.close();
			dos.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}

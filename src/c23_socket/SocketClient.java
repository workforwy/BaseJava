package c23_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * �ͻ��˳���
 */
public class SocketClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 7777);
			System.out.println("�ͻ������ӳɹ�");
			
			// ���շ���˵�Ӧ��
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String str = dis.readUTF();
			System.out.println("service˵:" + str);
			
			// ������ݸ������
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			Scanner sc = new Scanner(System.in);
			while (true) {
				String line = sc.nextLine();
				dos.writeUTF(line);
				dos.flush();
				// ��ȡ����˵�Ӧ��
				String str2 = dis.readUTF();
				System.out.println("service˵:" + str2);
				if (str2.equals("�ؼ�")) {
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

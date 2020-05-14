package chapter23_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����˳���
 */
public class SocketService {
	public static void main(String[] args) {
		try {
			// ����˿ں�:0~65535
			int p = 7777;
			ServerSocket ss = new ServerSocket(p);
			while (true) {
				Socket socket = ss.accept();
				new WorkThread(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class WorkThread extends Thread {
		private Socket socket;

		public WorkThread(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				// ���տͻ������� "����ʽ"
				System.out.println(socket.getInetAddress());

				// ʹ����������ͻ���д����
				DataOutputStream dos = new DataOutputStream(
						socket.getOutputStream());
				dos.writeUTF("�͹�,��Ҫ��ʲô?");

				// �ȴ���ȡ�ͻ��˵Ļش�
				DataInputStream dis = new DataInputStream(
						socket.getInputStream());
				while (true) {
					String str = dis.readUTF();
					if (str.equals("ûǮ��")) {
						break;
					}
					dos.writeUTF("�Բ���,���" + str + "û����");
					dos.flush();
				}
				dos.writeUTF("����");
				dos.flush();
				dos.close();
				dis.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

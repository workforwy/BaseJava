package chapter23_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端程序
 */
public class SocketService {
	public static void main(String[] args) {
		try {
			// 服务端口号:0~65535
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
				// 接收客户端请求 "阻塞式"
				System.out.println(socket.getInetAddress());

				// 使用输出流给客户端写数据
				DataOutputStream dos = new DataOutputStream(
						socket.getOutputStream());
				dos.writeUTF("客官,你要点什么?");

				// 等待读取客户端的回答
				DataInputStream dis = new DataInputStream(
						socket.getInputStream());
				while (true) {
					String str = dis.readUTF();
					if (str.equals("没钱了")) {
						break;
					}
					dos.writeUTF("对不起,这个" + str + "没有了");
					dos.flush();
				}
				dos.writeUTF("不送");
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

package chapter27_junit;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天服务端
 */
public class ChatServer {
	private List<Socket> sockets = new ArrayList<>();

	/**
	 * 启动群聊天服务端
	 * 
	 * @throws IOException
	 */
	public void startServer() throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		// 不断接受客户端请求
		Socket socket = ss.accept();
		System.out.println("服务器已经连接,客户端的IP:" + socket.getInetAddress());
		sockets.add(socket);
		
		// 启动工作线程
		new workThread(socket).start();
	}

	/**
	 * 工作线程:不断接受客户端发来的信息,然后转发给每一个连接上的客户端
	 */
	class workThread extends Thread {
		private Socket socket;

		public workThread(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				DataInputStream dis = new DataInputStream(
						socket.getInputStream());
				//将输入流读取成utf格式
				String str = dis.readUTF();
				// 给每一个单独的客户端发送信息
				for (int i = 0; i < sockets.size(); i++) {
					//循环每一个端口
					Socket s = sockets.get(i);
					//新建输出流
					DataOutputStream dos = new DataOutputStream(
							socket.getOutputStream());
					//将输入流转化成输出流
					dos.writeUTF(str);
					//清空输出流
					dos.flush();
				}
			} catch (IOException e) {
				// 当dis读取不到内容的时候.连接被重置,出现异常
				e.printStackTrace();
				// 循环完毕后将集合中的socket对象移除(省内存)
				sockets.remove(socket);
			}
		}
	}

	public static void main(String[] args) {
		ChatServer server = new ChatServer();
		System.out.println("服务器已经启动");
		try {
			server.startServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

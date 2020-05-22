package chapter27_junit;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * ��������
 */
public class ChatServer {
	private List<Socket> sockets = new ArrayList<>();

	/**
	 * ����Ⱥ��������
	 * 
	 * @throws IOException
	 */
	public void startServer() throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		// ���Ͻ��ܿͻ�������
		Socket socket = ss.accept();
		System.out.println("�������Ѿ�����,�ͻ��˵�IP:" + socket.getInetAddress());
		sockets.add(socket);
		
		// ���������߳�
		new workThread(socket).start();
	}

	/**
	 * �����߳�:���Ͻ��ܿͻ��˷�������Ϣ,Ȼ��ת����ÿһ�������ϵĿͻ���
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
				//����������ȡ��utf��ʽ
				String str = dis.readUTF();
				// ��ÿһ�������Ŀͻ��˷�����Ϣ
				for (int i = 0; i < sockets.size(); i++) {
					//ѭ��ÿһ���˿�
					Socket s = sockets.get(i);
					//�½������
					DataOutputStream dos = new DataOutputStream(
							socket.getOutputStream());
					//��������ת���������
					dos.writeUTF(str);
					//��������
					dos.flush();
				}
			} catch (IOException e) {
				// ��dis��ȡ�������ݵ�ʱ��.���ӱ�����,�����쳣
				e.printStackTrace();
				// ѭ����Ϻ󽫼����е�socket�����Ƴ�(ʡ�ڴ�)
				sockets.remove(socket);
			}
		}
	}

	public static void main(String[] args) {
		ChatServer server = new ChatServer();
		System.out.println("�������Ѿ�����");
		try {
			server.startServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

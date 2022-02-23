package c25_http.http;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �����������֧��Ⱥ��,�൱��openfire
 * 
 * ��һ�����û����Ὠһ��socket���ӣ� ����һ���߳� socket����ֻ�����û��˳���ʱ��Ż�رա�
 * 
 * @author pjy
 * 
 */
public class SocketServer {
	/**
	 * ÿ����ֻ����һ�ݣ�Eclipse run as -->java Application
	 * �������\���п��������\����͹��ܣ�����telnet�ͻ��� ����ͬѧ��dos��ִ�� telnet �鳤ip 15898
	 * 0-1023���˿ں����ֵ65535
	 */
	private List<Socket> socketList = new ArrayList<Socket>();
	private ServerSocket server = null;
	private ExecutorService threadPool = null; // thread pool

	public static void main(String[] args) {
		new SocketServer();
	}

	public SocketServer() {
		try {
			// ����пͻ��˷���Ϣ��15898����˿ڣ�
			// ����ϵͳ�����Ϣ�����������������
			server = new ServerSocket(15898);
			threadPool = Executors.newCachedThreadPool(); // create a thread
															// pool
			System.out.println("server start ...");
			// socketClient����������ĳһ���ͻ��˵�����
			Socket socketClient = null;
			while (true) {
				// �ͻ��˸����Ƿ������˽�������֮�� ����socketClient����
				socketClient = server.accept();
				socketList.add(socketClient);
				// System.out.println("��"+mList.size()+"������ ");
				System.out.println("������ ");
				// start a new thread to handle the connection
				threadPool.execute(new Service(socketClient));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class Service implements Runnable {
		private Socket socketClient;
		private BufferedReader in = null;
		private String msg = "";

		public Service(Socket socketClient) {
			this.socketClient = socketClient;
			try {
				in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

				msg = "user" + this.socketClient.getInetAddress() + "�ͻ��˸���:" + socketList.size() + "�߳�id:"
						+ Thread.currentThread().getId();
				this.sendmsg();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			try {
				while (true) {
					if ((msg = in.readLine()) != null) {
						if (msg.equals("exit")) {
							System.out.println("�пͻ����˳�");
							socketList.remove(socketClient);
							in.close();
							msg = "user:" + socketClient.getInetAddress() + "exit total:" + socketList.size();
							socketClient.close();
							this.sendmsg();
							break;
						} else {
							// ״̬��|��Ϣ����|��Ϣjson����
							msg = "{'user ip':'" + socketClient.getInetAddress() + "','msg':'" + msg + "'} ";
							System.out.println("sever �յ�" + msg);
							this.sendmsg();
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/**
		 * socket�������ڴ��С��ͻ��˲������󣬷�������Ҳ����������ͻ��˷����ݡ� http���ص��Ǳ����ǿͻ����ȷ����󣬷������˲��ܷ������ݡ�
		 */
		public void sendmsg() {
			int socketClinetNumber = socketList.size();
			// �����еĿͻ��˷�����,˵��1������ 2����Ⱥ��
			for (int index = 0; index < socketClinetNumber; index++) {
				// Socket����һ��ip[tcp[msg]]
				Socket socketClient = socketList.get(index);
				PrintWriter pout = null;
				try {
					pout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream())),
							true);
					pout.println(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
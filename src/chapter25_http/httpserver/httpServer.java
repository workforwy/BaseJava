package chapter25_http.httpserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class httpServer {
	// ʵ����tomcat�Ĺ���
	public static void main(String args[]) {
		int port;
		ServerSocket server_socket;

		try {
			// �����������˿ڣ��ȴ���������
			server_socket = new ServerSocket(8080);
			System.out.println("httpServer running on port "
					+ server_socket.getLocalPort());
			// ��ʾ������Ϣ
			while (true) {
				// �ͻ������ϲ���socket
				Socket socket = server_socket.accept();
				System.out.println("New connection accepted "
						+ socket.getInetAddress() + ":" + socket.getPort());
				// �������߳�
				try {
					httpRequestHandler request = new httpRequestHandler(socket);
					Thread thread = new Thread(request);
					// �����߳�
					thread.start();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

class httpRequestHandler implements Runnable {
	final static String CRLF = "\r\n";
	Socket socket;
	InputStream input;
	OutputStream output;
	BufferedReader br;

	// ���췽��
	public httpRequestHandler(Socket socket) throws Exception {
		this.socket = socket;
		this.input = socket.getInputStream();
		this.output = socket.getOutputStream();
		this.br = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
	}

	// ʵ��Runnable �ӿڵ�run()����
	public void run() {
		try {

			while (true) {
				// ��ȡ����ʾWeb ������ύ��������Ϣ
				String headerLine = br.readLine();
				System.out.println("The client request is " + headerLine);
				if (headerLine.equals(CRLF) || headerLine.equals(""))
					break;
				StringTokenizer s = new StringTokenizer(headerLine);
				String temp = s.nextToken();
				if (temp.equals("GET")) {
					String fileName = s.nextToken();
					fileName = "." + fileName;
					// ����������ļ�
					FileInputStream fis = null;
					boolean fileExists = true;
					try {
						System.out.println("fileName=" + fileName);
						fileName = fileName.substring(2);
						fileName = "d:/webapps/tlbs/" + fileName;
						fis = new FileInputStream(fileName);
					} catch (FileNotFoundException e) {
						fileExists = false;
					}
					// ��ɻ�Ӧ��Ϣ
					String serverLine = "Server: a simple java httpServer";
					String statusLine = null;
					String contentTypeLine = null;
					String entityBody = null;
					String contentLengthLine = "error";
					if (fileExists) {
						statusLine = "HTTP/1.0 200 OK" + CRLF;
						contentTypeLine = "Content-type: "
								+ contentType(fileName) + CRLF;
						contentLengthLine = "Content-Length: "
								+ (new Integer(fis.available())).toString()
								+ CRLF;
					} else {
						statusLine = "HTTP/1.0 404 Not Found" + CRLF;
						contentTypeLine = "text/html";
						entityBody = "<HTML>"
								+ "<HEAD><TITLE>404 Not Found</TITLE></HEAD>"
								+ "<BODY>1510��Ʒ web������ 404 Not Found"
								+ "<br>usage:http://yourHostName:port/"
								+ "fileName.html</BODY></HTML>";
					}
					// ���͵���������Ϣ
					output.write(statusLine.getBytes());
					output.write(serverLine.getBytes());
					output.write(contentTypeLine.getBytes());
					output.write(contentLengthLine.getBytes());
					output.write(CRLF.getBytes());
					// ������Ϣ����
					if (fileExists) {
						sendBytes(fis, output);
						fis.close();
					} else {
						output.write(entityBody.getBytes());
					}
				}
			}
			// �ر��׽��ֺ���
			try {
				output.close();
				br.close();
				socket.close();
			} catch (Exception e) {
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void processRequest() throws Exception {
	}

	private static void sendBytes(FileInputStream fis, OutputStream os)
			throws Exception {
		// ����һ�� 1K buffer
		byte[] buffer = new byte[1024];
		int bytes = 0;
		// ���ļ�������׽����������
		while ((bytes = fis.read(buffer)) != -1) {
			os.write(buffer, 0, bytes);
		}
	}

	private static String contentType(String fileName) {
		if (fileName.endsWith(".htm") || fileName.endsWith(".html")) {
			return "text/html";
		}

		return "fileName";
	}
}
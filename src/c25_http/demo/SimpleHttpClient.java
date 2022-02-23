package c25_http.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 * һ���򵥵�HTTP�ͻ��ˣ������� ��httpUrlConnection,HttpClient ,AsycnHttpClient,
 * xutils��httpUtils��һ���ġ� ����HTTP����ģ������� �ɴ�ӡ���������͹�����HTTP��Ϣ
 */
public class SimpleHttpClient {
	private static String encoding = "GBK";

	public void send(String ip, int port, String url, String sendData) {
		try {

			Socket socket = new Socket(ip, port);
			OutputStreamWriter osw = new OutputStreamWriter(
					socket.getOutputStream());
			StringBuffer sb = new StringBuffer();
			// httpЭ����������
			sb.append("GET " + url + " HTTP/1.1\r\n");

			// httpЭ��������ͷ
			sb.append("Host: " + ip + "\r\n");
			sb.append("Connection: Keep-Alive\r\n");
			sb.append("user-agent: simpleHttpClinet zhangjiujun 1510\r\n");
			// ע�����ǹؼ��Ĺؼ��������������Ҹ��˰��Сʱ������һ��Ҫһ���س����У���ʾ��Ϣͷ�꣬��Ȼ��������ȴ�
			sb.append("\r\n");
			osw.write(sb.toString());
			osw.flush();
 
			// --������������ص���Ϣ��ͷ��Ϣ
			InputStream is = socket.getInputStream();
			String line = null;
			int contentLength = 0;// ���������ͻ�������Ϣ����
			// ��ȡ���з��������͹������������ͷ����Ϣ
			do {
				line = readLine(is, 0);
				// �����Content-Length��Ϣͷʱȡ��
				if (line.startsWith("Content-Length")) {
					contentLength = Integer.parseInt(line.split(":")[1].trim());
				}
				// ��ӡ������Ϣ
				System.out.print(line);
				// ���������һ�������Ļس����У����ʾ����ͷ����
			} while (!line.equals("\r\n"));

			// --����Ϣ����
			System.out.print(readLine(is, contentLength));

			// �ر���
			is.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SimpleHttpClient httpClient = new SimpleHttpClient();
		// Զ�� 124.207.192.18
		// ���ذ�172.60.5.100
		httpClient.send("172.60.5.100", 8080, "/allRunServer/login.html", null);
	}

	/*
	 * ���������Լ�ģ���ȡһ�У���Ϊ���ʹ��API�е�BufferedReaderʱ�����Ƕ�ȡ��һ���س����к�
	 * �ŷ��أ��������û�ж�ȡ����һֱ������ֱ�ӷ�������ʱ�Զ��ر�Ϊֹ�������ʱ��ʹ��BufferedReader
	 * ����ʱ����Ϊ�������һ��ʱ�����һ�к󲻻��лس����з������Ծͻ�ȴ������ʹ�÷��������ͻ�����
	 * ��Ϣͷ���Content-Length����ȡ��Ϣ�壬�����Ͳ�������
	 * 
	 * contentLe ���� ���Ϊ0ʱ����ʾ��ͷ����ʱ���ǻ���һ��һ�еķ��أ������Ϊ0����ʾ����Ϣ�壬
	 * ʱ���Ǹ�����Ϣ��ĳ�����������Ϣ��󣬿ͻ����Զ��ر��������������ȵ���������ʱ���رա�
	 */
	private static String readLine(InputStream is, int contentLe)
			throws IOException {
		ArrayList lineByteList = new ArrayList();
		byte readByte;
		int total = 0;
		if (contentLe != 0) {
			do {
				readByte = (byte) is.read();
				lineByteList.add(Byte.valueOf(readByte));
				total++;
			} while (total < contentLe);// ��Ϣ�����δ����
		} else {
			do {
				readByte = (byte) is.read();
				lineByteList.add(Byte.valueOf(readByte));
			} while (readByte != 10);
		}

		byte[] tmpByteArr = new byte[lineByteList.size()];
		for (int i = 0; i < lineByteList.size(); i++) {
			tmpByteArr[i] = ((Byte) lineByteList.get(i)).byteValue();
		}
		lineByteList.clear();

		return new String(tmpByteArr, encoding);
	}
}
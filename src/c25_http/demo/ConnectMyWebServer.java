package c25_http.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 * һ���򵥵�HTTP�ͻ��ˣ�
 * ����HTTP����ģ�������
 * �ɴ�ӡ���������͹�����HTTP��Ϣ
 */
public class ConnectMyWebServer {
	private static String encoding = "GBK";

	public static void main(String[] args) {
		try {
			//���ذ�124.207.192.18�ĳ�172.60.5.100
			Socket socket = new Socket("172.60.50.243", 8080);
			OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			StringBuffer sb = new StringBuffer();
			sb.append("GET /1509.html HTTP/1.1\r\n");
			sb.append("Host: 172.60.50.243\r\n");
			sb.append("Connection: Keep-Alive\r\n");
			sb.append("user-agent: simpleHttpClinet zhangjiujun\r\n");
			//ע�����ǹؼ��Ĺؼ��������������Ҹ��˰��Сʱ������һ��Ҫһ���س����У���ʾ��Ϣͷ�꣬��Ȼ��������ȴ�
			sb.append("\r\n");
			osw.write(sb.toString());
			osw.flush();

			//--������������ص���Ϣ��ͷ��Ϣ
			InputStream is = socket.getInputStream();
			String line = null;
			int contentLength = 0;//���������ͻ�������Ϣ����
			// ��ȡ���з��������͹������������ͷ����Ϣ
			do {
				line = readLine(is, 0);
				//�����Content-Length��Ϣͷʱȡ��
				if (line.startsWith("Content-Length")) {
					contentLength = Integer.parseInt(line.split(":")[1].trim());
				}
				//��ӡ������Ϣ
				System.out.print(line);
				//���������һ�������Ļس����У����ʾ����ͷ����
			} while (!line.equals("\r\n"));

			//--����Ϣ����
			System.out.print(readLine(is, contentLength));

			//�ر���
			is.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
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
	private static String readLine(InputStream is, int contentLe) throws IOException {
		ArrayList lineByteList = new ArrayList();
		byte readByte;
		int total = 0;
		if (contentLe != 0) {
			do {
				readByte = (byte) is.read();
				lineByteList.add(Byte.valueOf(readByte));
				total++;
			} while (total < contentLe);//��Ϣ�����δ����
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
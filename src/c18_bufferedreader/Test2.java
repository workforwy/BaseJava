package c18_bufferedreader;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * print
 * @author 1
 *
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("d:/abc/f5")));
		String string;
		while ((string = reader.readLine()) != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = sdf.format(new Date());
			writer.println(time + " " + string);
			if (string.equalsIgnoreCase("exit") || string.equalsIgnoreCase("quit")) {
				System.out.println("zaijian");
				reader.close();
				writer.close();
				System.exit(0);
			}
		}
	}
}

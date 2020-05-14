package tarena.day2001;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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

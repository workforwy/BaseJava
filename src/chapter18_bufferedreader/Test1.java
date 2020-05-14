package tarena.day2001;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream("D:/workspace_WY/day1501_³óÊý/src/tarena/day1501/Test1.java")));
		String string;
		while ((string = reader.readLine()) != null) {
			System.out.println(string);
		}
		reader.close();
	}
}

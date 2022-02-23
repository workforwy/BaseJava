package c16_file;

import java.io.File;

public class Test5 {
	public static void main(String[] args)throws Exception {
		File f=File.createTempFile("a", "txt");
		System.out.println(f.getAbsolutePath());
	}
}

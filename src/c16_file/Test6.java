package c16_file;

import java.io.File;

public class Test6 {
	public static void main(String[] args) {
		File dir=new File("c:/windows");
		String[] names = dir.list();
		File[] Files = dir.listFiles();
		for(String n:names){
			System.out.println(n);
		}
		System.out.println("========================");
		for(File f:Files){
			System.out.println(f.getName()+"-"+f.length());	
		}
	}
}

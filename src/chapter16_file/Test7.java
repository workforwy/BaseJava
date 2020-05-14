package tarena.day1702;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Test7 {
	public static void main(String[] args) {
		File dir=new File("c:/windows/");

		String[] names = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, //正在列表的目录
					String name) {//目录文件的名字
			    				//是不是exe后缀
				return name.toLowerCase().endsWith(".exe");
			}
		});
		File[] files = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File f) {
				if(f.isDirectory())return false;
				return f.length()>=1024*1024;
			}
		});
		for(String n:names){
			System.out.println(n);
		}
		System.out.println("---------------------------------------");
		for(File f:files){
			System.out.println(f.getName()+"-"+f.length());
		}
	}
}

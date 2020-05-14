package tarena.day1702;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Test7 {
	public static void main(String[] args) {
		File dir=new File("c:/windows/");

		String[] names = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, //�����б��Ŀ¼
					String name) {//Ŀ¼�ļ�������
			    				//�ǲ���exe��׺
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

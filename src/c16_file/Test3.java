package c16_file;

import java.io.File;

public class Test3 {
	public static void main(String[] args) {
		File f=new File("d:/abc/a/b/c/");
		if(f.exists()){
			boolean b=f.delete();
			System.out.println("删除成功"+b);//删除的必须是空目录
		}else{
			boolean b=f.mkdirs();
			System.out.println("创建成功"+b);
		}
	}
}

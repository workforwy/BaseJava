package c16_file;

import java.io.File;

public class Test3 {
	public static void main(String[] args) {
		File f=new File("d:/abc/a/b/c/");
		if(f.exists()){
			boolean b=f.delete();
			System.out.println("ɾ���ɹ�"+b);//ɾ���ı����ǿ�Ŀ¼
		}else{
			boolean b=f.mkdirs();
			System.out.println("�����ɹ�"+b);
		}
	}
}

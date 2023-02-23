package c12_date;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;

public class SystemDemo01 {

    public static void main(String[] args) {
        InputStream in = System.in;
        PrintStream pm = System.out;
		/*Scanner sc=new Scanner(in);
		pm.println(sc.nextLine());
		sc.close();*/
        long time =
                System.currentTimeMillis();
        System.out.println(time);
        //输出错误信息时采用如下形式
        System.err.println(time);

        //System.exit(0);//退出虚拟机(0表示正常退出)

        //System.out.println("系统退出了");

        //获得系统的属性信息
	/*	Properties pro=
		System.getProperties();

		Enumeration es=
		pro.elements();

		while(es.hasMoreElements()){
			Object obj=es.nextElement();
			System.out.println(obj);
		}*///不要掌握
    }
}


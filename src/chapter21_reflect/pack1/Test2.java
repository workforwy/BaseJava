package chapter21_reflect.pack1;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		Class c = Class.forName(s);
		Object a = null;
		Object b = null;
		
		try {
			// 无参构造方法创建对象
			a = c.newInstance();
		} catch (Exception e) {
			System.out.println("不存在无参构造方法");
		}
		try {
			// 接收int参数的的构造方法
			Constructor con = c.getConstructor(int.class);
			b = con.newInstance(10);
		} catch (Exception e) {
			System.out.println("不存在int参数构造方法");
		}
		
		System.out.println(a);
		System.out.println(b);
	}
}

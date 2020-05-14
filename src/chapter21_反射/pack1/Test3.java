package chapter21_反射.pack1;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		
		Integer a = Integer.valueOf(10);
		Class c = a.getClass();
		Field f = c.getDeclaredField("value");// 访问成员变量·
		f.setAccessible(true);// 调用私有方法
		f.set(a, 1000);
		Object v = f.get(a);

		System.out.println(v);
		Integer b = Integer.valueOf(100);
		System.out.println(b.intValue());
	}
}

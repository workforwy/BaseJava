package chapter21_����.pack1;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		
		Integer a = Integer.valueOf(10);
		Class c = a.getClass();
		Field f = c.getDeclaredField("value");// ���ʳ�Ա������
		f.setAccessible(true);// ����˽�з���
		f.set(a, 1000);
		Object v = f.get(a);

		System.out.println(v);
		Integer b = Integer.valueOf(100);
		System.out.println(b.intValue());
	}
}

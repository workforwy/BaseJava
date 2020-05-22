package chapter21_reflect.pack2;

import chapter21_reflect.pack1.Activity;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		String path = Test1.class.getResource("config.xml").getPath();
		SAXReader reader = new SAXReader();
		Document doc = reader.read(path);
		String className = doc.valueOf("/cfg/Activity/@name");
		String methodName = doc.valueOf("/cfg/Button/@onClick");
		// System.out.println(className);
		// System.out.println(methodName);
		Class c = Class.forName(className);
		Activity activity = (Activity) c.newInstance();
		activity.onCreate();
		Button btn = new Button();
		Method m = c.getMethod(methodName, View.class);
		System.out.println("请点击按钮（用回车模拟）");
		new Scanner(System.in).nextLine();
		m.invoke(activity, btn);
	}
}

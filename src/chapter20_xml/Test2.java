package chapter20_xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Test2 {
	public static void main(String[] args) throws Exception {
		String path = Test2.class.getResource("/email.xml").getPath();
		// System.out.println(path);
		// 创建解析器
		SAXReader reader = new SAXReader();
		// 读取解析xml文件，生成dom树
		// Document对象是dom树的树根对象
		Document doc = reader.read(path);
		Test1(doc);
	}

	private static void Test1(Document doc) {
		// /email/from
		// /email//to-email
		// /email/subject
		// /email/body
		// /email/@date
		// /email/@time
		String from = doc.selectSingleNode("/email/from").getText();
		String subject = doc.selectSingleNode("/email/subject").getText();
		String body = doc.selectSingleNode("/email/body").getText();

		List<Element> list = doc.selectNodes("/email//to-email");

		String date = doc.valueOf("/email/@date");
		String time = doc.valueOf("/email/@time");

		System.out.println(date);
		System.out.println(time);
		System.out.println(from);

		for (Element e : list) {
			System.out.println(e.getText());
		}

		System.out.println(subject);
		System.out.println(body);
	}
}

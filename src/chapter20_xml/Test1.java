package chapter20_xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.List;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//��һ�����߿��������·����ʽ����ô�������·�� "/"��ʾ�������е�Ŀ¼ eclipse�����У�����Ŀ"\bin\"Ŀ¼
		String path = Test1.class.getResource("./res/books.xml").getPath();
		System.out.println(path);
		SAXParser p = SAXParserFactory.newInstance().newSAXParser();
		BookHandler h = new BookHandler();
		p.parse(path, h);
		List<Book> list = h.getList();
		for (Book b : list) {
			System.out.println(b);
		}
	}
}

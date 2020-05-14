package chapter20_xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.List;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//有一个工具可以用相对路径格式来获得磁盘完整路径 "/"表示程序运行的目录 eclipse环境中，是项目"\bin\"目录
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

package c20_xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.创建图书对象，放入集合 startElement（）方法中，判断标签名是Book
 * 2.文本填入图书对象 endElement()方法中，将完整文本填入Book对象
 */
public class BookHandler extends DefaultHandler {
	// 三种方法
	// 1.startElemennt
	// 2.endElemennt 拼完文本
	// 3.characters 拼接文本
	private StringBuilder text = new StringBuilder();
	private List<Book> list = new ArrayList<Book>();
	private Book Book;

	public List<Book> getList() {
		return list;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("books")) {
			Book = new Book();
			list.add(Book);
			Book.setIsbn(attributes.getValue(0));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		String s = text.toString().trim();
		if (!s.equals("")) {
			// 完整文本
			if ("name".equals(qName)) {
				Book.setName(s);
			} else if ("author".equals(qName)) {
				Book.getAuthors().add(s);
			} else if ("pubisher".equals(qName)) {
				Book.setPublisher(s);
			} else if ("pages".equals(qName)) {
				Book.setPages(s);
				;
			} else if ("price".equals(qName)) {
				Book.setPrice(s);
			}
			System.out.println(s);
		}
		text.delete(0, text.length());
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		text.append(ch, start, length);
	}
}

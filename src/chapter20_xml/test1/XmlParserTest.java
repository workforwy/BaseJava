package chapter20_xml.day2004;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * ����SAXParser������email.xml
 * 
 * @author tarena
 *
 */
public class XmlParserTest {
	public static void main(String[] args) throws Exception {
		// ����Java�ṩ��SAXParse�����࣬����ȡSAXParser����
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		MyHandler dh = new XmlParserTest().new MyHandler();
		parser.parse("D:/workspace_WY_1/day2004_xml/src/day2004/email.xml", dh);
	}

	/*
	 * 1.�����ı���ƴ�� ��characters���������У��õ��ı�Ƭ�Σ�����ƴ�� 2.����������ı�
	 * ��endElement���������У�����ƴ����ɵ��ı�
	 */
	class MyHandler extends DefaultHandler {
		StringBuilder text = new StringBuilder();

		private void StartDocument() throws SAXException {
			System.out.println("���Կ�ʼ�����ĵ���");
		}

		@Override
		public void endDocument() throws SAXException {
			System.out.println("������~���ǲ�����...");
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes)
				throws SAXException {
			System.out.println("һ��Ԫ�ؿ�ʼ��" + qName);
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			String s = text.toString().trim();
			if (!s.equals("")) {
				System.out.println(s);
			}
			text.delete(0, text.length());
			System.out.println("һ��Ԫ�ؽ�����" + qName);
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			text.append(ch, start, length);
			System.out.println(text);
		}
	}
}

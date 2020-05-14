package chapter20_xml;

import chapter20_xml.res.Url;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * 利用SAXParser来解析email.xml
 *
 * @author tarena
 */
public class XmlParserTest {

    public static void main(String[] args) throws Exception {
        // 利用Java提供的SAXParse工厂类，来获取SAXParser对象
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        MyHandler dh = new MyHandler();
        parser.parse(Url.EMAIL, dh);
    }

    /**
     * 1.完整文本的拼接 在characters（）方法中，得到文本片段，进行拼接
     * 2.获得完整的文本 在endElement（）方法中，处理拼接完成的文本
     */
    static class MyHandler extends DefaultHandler {
        StringBuilder text = new StringBuilder();

        private void StartDocument() throws SAXException {
            System.out.println("可以开始解析文档了");
        }

        @Override
        public void endDocument() throws SAXException {
            System.out.println("结束吧~咱们不合适...");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {
            System.out.println("一个元素开始了" + qName);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            String s = text.toString().trim();
            if (!s.equals("")) {
                System.out.println(s);
            }
            text.delete(0, text.length());
            System.out.println("一个元素结束了" + qName);
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            text.append(ch, start, length);
            System.out.println(text);
        }
    }
}

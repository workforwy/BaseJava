package chapter20_xml.day2101_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

public class Test3 {
	public static void main(String[] args) throws Exception {
		String path=Test3.class.getResource("/email.xml").getPath();
		//System.out.println(path);
		//����������
		SAXReader reader=new SAXReader();
		//��ȡ����xml�ļ�������dom��
		//Document������dom������������
		Document doc= reader.read(path);
		Test1(doc);
	}
	private static void Test1(Document doc) {
		//������doc����²�ĸ�Ԫ��
		Element email=doc.getRootElement();
		//email���²�Ԫ�ص���
		for(Iterator <Element>it = email.elementIterator();it.hasNext();){
			Element e=it.next();
			if(e.isTextOnly()){
				System.out.println(e.getText());
			}
		}
		for(Iterator <Element>it = email.element("to").elementIterator("to-email");it.hasNext();){
			Element e=it.next();
			System.out.println(e.getText());
		}
		for(Iterator<Attribute>it=email.attributeIterator();it.hasNext();){
			Attribute att=it.next();
			System.out.println(att.getName()+"="+att.getValue());
		}
	}
}


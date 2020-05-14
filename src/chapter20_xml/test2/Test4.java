package chapter20_xml.day2101_xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Test4 {
	public static void main(String[] args) throws Exception {
		String path=Test4.class.getResource("/email.xml").getPath();
		//System.out.println(path);
		//����������
		SAXReader reader=new SAXReader();
		//��ȡ����xml�ļ�������dom��
		//Document������dom������������
		Document doc= reader.read(path);
		Test1(doc);
	}
	private static void Test1(Document doc) {
		Element email = doc.getRootElement();
		Print(email);
	}
	private static void Print(Element email) {
		// TODO Auto-generated method stub
		for(int i=0;i<email.nodeCount();i++){
			Node node=email.node(i);
			if(node instanceof Element){
				Element ele=(Element) node;
				if(ele.isTextOnly()){
					System.out.println(ele.getText());
				}else{
					Print(ele);
				}
			}			
		}
	}
}


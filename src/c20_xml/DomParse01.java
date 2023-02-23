package c20_xml;


import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//DOM解析(最原生的解析方案)
public class DomParse01 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //1.构建解析器对象(DocumentBuilder)
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        //2.解析xml
        //此时会将xml由外存读到内存，
        //并且构建一棵倒置的节点树
        Document doc =//此文档为一个文档节点
                builder.parse("bin/day19/books.xml");
        //3.处理数据
        Element root =//book节点
                doc.getDocumentElement();
        System.out.println(root.getNodeName());
        //3.1获得xml root元素下的子元素
        NodeList childs = root.getChildNodes();
        System.out.println(childs.getLength());

        for (int i = 0; i < childs.getLength(); i++) {
            Node node = childs.item(i);
            //System.out.println(node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) node;
			/*System.out.println(
			e.getTextContent())*/
                ;
                System.out.println(e.getFirstChild().getNodeValue());
            }
        }

        //3.2 获得book根元素中属性节点
        NamedNodeMap map = root.getAttributes();

        for (int i = 0; i < map.getLength(); i++) {
            Attr node =//属性节点
                    (Attr) map.item(i);
            System.out.println(node.getNodeName() + "=" + node.getNodeValue());
        }
        //取某一个属性的值
		/*Attr type=
		root.getAttributeNode("type");
		System.out.println(type.getNodeValue());
		*/
    }
}

//Document
//book
//name
//android



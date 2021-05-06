package chapter21_reflect.pack1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import chapter21_reflect.pack2.MainActivity;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReflectDemo04 {

    public static void main(String[] args) throws Exception {
        // 1.½âÎöfest.xmlÎÄ¼þ
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse("src/day21/fest.xml");
        NodeList list = doc.getElementsByTagName("activity");
        Element e = (Element) list.item(0);

        String className = e.getAttribute("android:name");

        Class<?> c = Class.forName(className);
        MainActivity ma = (MainActivity) c.newInstance();
        System.out.println(ma);

    }
}

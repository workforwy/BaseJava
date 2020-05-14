package chapter20_xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;

public class Test5 {
    public static void main(String[] args) throws Exception {
        Document doc = DocumentHelper.createDocument();
        Element email = doc.addElement("email");
        email.addElement("from").setText("aaa@aaa.com");
        Element to = email.addElement("to");
        email.addElement("suject").setText("hello");
        email.addElement("body").setText("hello,nidaye");
        to.addElement("to-email").setText("sss@sss");
        to.addElement("to-email").setText("ccc@ccc");
        to.addElement("to-email").setText("aaa@aaa");
        email.addAttribute("date", "2015-12-28");
        email.addAttribute("time", "15:12:28");
        FileOutputStream out = new FileOutputStream("d:/nidaye.xml");
        //OutputFormat fmt=OutputFormat.createCompactFormat();
        OutputFormat fmt = OutputFormat.createPrettyPrint();
        fmt.setEncoding("GBK");
        XMLWriter writer = new XMLWriter(out, fmt);
        writer.write(doc);
        writer.flush();
        writer.close();
    }
}

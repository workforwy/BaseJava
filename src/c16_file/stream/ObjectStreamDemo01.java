package c16_file.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Contact implements Serializable {
    private static final long serialVersionUID = 1006569131338925699L;
    String name;
    /**
     * 当属性使用此关键字修饰时，表示此属性不会被序列化
     */
    transient String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phone=" + phone + "]";
    }

}

public class ObjectStreamDemo01 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream out =
                new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(
                                        new File("a2.dat"))));

        out.writeUTF("china");
        System.out.println("write ok!");
        Contact c =
                new Contact("AA", "133");
        //对象序列化(将对象转换为字节)
        out.writeObject(c);
        out.flush();
        out.close();

        ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream(
                                new File("a2.dat")));

        String s = in.readUTF();
        Contact c1 = (Contact)
                //对象的反序列化
                in.readObject();
        System.out.println(c1);

        in.close();
    }
}


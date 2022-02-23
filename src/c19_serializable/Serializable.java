package c19_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 进行序列化的条件：
 * 1.对象序列化须实现Serializable接口
 * 2.使用序列化的对象时，需要本地必须有对象对应的类型
 * 3.序列化对象时，对象的所有属性（不包括基本类型）都必须也实现了Serializable借口才行
 */
public class Serializable {
    public static void main(String[] args) throws Exception {
        Person person = new Person("张三", 23);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/abc/f9"));
        out.writeObject(person);
        Person person2 = new Person("李四", 26);
        out.writeObject(person2);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:/abc/f9"));
        Person p = (Person) in.readObject();
        System.out.println(p);
        Person p2 = (Person) in.readObject();
        System.out.println(p2);
        in.close();
    }
}

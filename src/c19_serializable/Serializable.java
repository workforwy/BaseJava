package c19_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * �������л���������
 * 1.�������л���ʵ��Serializable�ӿ�
 * 2.ʹ�����л��Ķ���ʱ����Ҫ���ر����ж����Ӧ������
 * 3.���л�����ʱ��������������ԣ��������������ͣ�������Ҳʵ����Serializable��ڲ���
 */
public class Serializable {
    public static void main(String[] args) throws Exception {
        Person person = new Person("����", 23);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/abc/f9"));
        out.writeObject(person);
        Person person2 = new Person("����", 26);
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

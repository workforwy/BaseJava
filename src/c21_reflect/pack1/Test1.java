package c21_reflect.pack1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("c21_reflect.pack1.Point");
        String name = c.getName();
        String pkg = c.getPackage().getName();
        String simple = c.getSimpleName();
        String modifier = Modifier.toString(c.getModifiers());
        System.out.println("��������:" + name);
        System.out.println("����:" + pkg);
        System.out.println("����:" + simple);
        System.out.println("��Ȩ��:" + modifier);
        test1(c);
        test2(c);
        test3(c);
    }

    private static void test3(Class c) {
        System.out.println("==============����==================");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            String m = Modifier.toString(method.getModifiers());
            Class returnType = method.getReturnType();
            String n = method.getName();
            Class[] params = method.getParameterTypes();
            Class[] excps = method.getExceptionTypes();
            System.out.println(m + " " + returnType.getSimpleName() +" "+ n + " (" + Arrays.toString(params) + ") throws"
                    + Arrays.toString(excps));
        }
    }

    private static void test2(Class c) {
        System.out.println("=======���췽��==================");
        Constructor[] cons = c.getDeclaredConstructors();
        for (Constructor con : cons) {
            String m = Modifier.toString(con.getModifiers());
            String n = c.getSimpleName();
            Class[] params = con.getParameterTypes();// �����б�����
            Class[] excps = con.getExceptionTypes();// �쳣����
            System.out.println(m + " " + n + "(" + Arrays.toString(params) + ")throws" + Arrays.toString(excps));
        }
    }

    private static void test1(Class c) {
        System.out.println("==============��Ա����============");
        // ��װc����ĳ�Ա������Ϣ������fields
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            String m = Modifier.toString(f.getModifiers());
            Class t = f.getType();
            String n = f.getName();
            System.out.println(m + " " + t.getSimpleName() + "" + n);
        }
    }
}

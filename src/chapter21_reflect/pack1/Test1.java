package chapter21_reflect.pack1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入类名：");
        String s = new Scanner(System.in).nextLine();
        Class c = Class.forName(s);
        String name = c.getName();
        String pkg = c.getPackage().getName();
        String simple = c.getSimpleName();
        String modifier = Modifier.toString(c.getModifiers());
        System.out.println(name);
        System.out.println(pkg);
        System.out.println(simple);
        System.out.println(modifier);
        test1(c);
        test2(c);
        test3(c);
    }

    private static void test3(Class c) {
        System.out.println("==============方法==================");
        Method[] cons = c.getDeclaredMethods();
        for (Method con : cons) {
            String m = Modifier.toString(con.getModifiers());
            Class returnType = con.getReturnType();
            String n = con.getName();
            Class[] params = con.getParameterTypes();
            Class[] excps = con.getExceptionTypes();
            System.out.println(m + " " + returnType.getSimpleName() + n + "(" + Arrays.toString(params) + ")throws"
                    + Arrays.toString(excps));
        }
    }

    private static void test2(Class c) {
        System.out.println("=======构造方法==================");
        Constructor[] cons = c.getDeclaredConstructors();
        for (Constructor con : cons) {
            String m = Modifier.toString(con.getModifiers());
            String n = c.getSimpleName();
            Class[] params = con.getParameterTypes();// 参数列表类型
            Class[] excps = con.getExceptionTypes();// 异常类型
            System.out.println(m + " " + n + "(" + Arrays.toString(params) + ")throws" + Arrays.toString(excps));
        }
    }

    private static void test1(Class c) {
        System.out.println("==============成员变量============");
        Field[] fields = c.getDeclaredFields();// 封装c类里的成员变量信息到数组fields
        for (Field f : fields) {
            String m = Modifier.toString(f.getModifiers());
            Class t = f.getType();
            String n = f.getName();
            System.out.println(m + " " + t.getSimpleName() + "" + n);
        }
    }
}

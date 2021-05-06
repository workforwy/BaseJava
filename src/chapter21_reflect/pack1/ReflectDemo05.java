package chapter21_reflect.pack1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * ����ע��ʱ 1)Ҫ����ע��Ӧ�õķ�Χ 2)Ҫ����ע���ʱ��Ч
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Permission {
    String value() default "";

    String model() default "";
}

class Utils {
    @Permission(value = "update")
    public void save() {
    }
}

public class ReflectDemo05 {
    public static void main(String[] args) throws Exception {
        Class<?> c1 = Utils.class;
        Method m = c1.getDeclaredMethod("save");
        boolean flag = m.isAnnotationPresent(Permission.class);
        System.out.println(flag);
        if (flag) {
            Permission p = m.getAnnotation(Permission.class);
            String value = p.value();
            System.out.println(value);
            if ("update".equals(value)) {
                System.out.println("�û�����ִ�д˷���");
            }
        }
    }
}

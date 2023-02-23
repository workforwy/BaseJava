package c02_enum.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UiThread {//UiThread.class

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface permession {

}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Column {
    boolean flag() default true;
}

@UiThread
class MyView {//MyView.class

    @permession
    public void method() {
    }

    @Column(flag = false)
    int age;
}

/**
 * 注解的使用
 */
public class AnnotationDemo {

}


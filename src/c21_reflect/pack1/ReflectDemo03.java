package c21_reflect.pack1;

import java.lang.reflect.Constructor;

class Context {
}

class View {
    public View(Context context) {
    }
}

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        // ��������
        Class<?> c = Class.forName("day21.View");
        // ��������󹹽���Ķ���
        // Ĭ�ϻ����view����޲ι��췽��
        // View v=(View)c.newInstance();
        // System.out.println(v);

        // ͨ������������еĹ��췽������
        Constructor<?> cst = c.getDeclaredConstructor(Context.class);
        // ͨ�����췽�����󹹽���Ķ���
        View v = (View) cst.newInstance(new Context());
        System.out.println(v);

    }
}

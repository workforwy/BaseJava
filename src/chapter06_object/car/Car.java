package chapter06_object.car;

/*
 * ��װ��
 * ���������ԡ���������
 * ��װ��һ���������
 */
public class Car {
    String color;
    String brand;
    int speed;

    public Car(String color, String brand, int speed) {
        // ����ֲ��������Ա����ͬ�� ��this.xxx�����ó�Ա
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        System.out.println("�½�һ���˳�" + brand + " " + color + "���ʱ���ǣ�" + speed);
    }

    public void go() {
        System.out.println(color + "��" + brand + "����ǰ����ʱ�٣�" + speed);
    }

    public void stop() {
        System.out.println(color + "��" + brand + "����ֹͣ");

    }
}

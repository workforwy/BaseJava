package chapter06_object.car;

/*
 * 封装：
 * 汽车的属性、方法代码
 * 封装在一个类组件中
 */
public class Car {
    String color;
    String brand;
    int speed;

    public Car(String color, String brand, int speed) {
        // 如果局部变量与成员变量同名 用this.xxx来引用成员
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        System.out.println("新建一个了车" + brand + " " + color + "最高时速是：" + speed);
    }

    public void go() {
        System.out.println(color + "的" + brand + "汽车前进，时速：" + speed);
    }

    public void stop() {
        System.out.println(color + "的" + brand + "汽车停止");

    }
}

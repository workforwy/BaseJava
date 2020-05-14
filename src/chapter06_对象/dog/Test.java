package chapter06_object.dog;

public class Test {
	public static void main(String[] args) {
		Dog b = new Dog();

		b.name = "小旺财";
		b.happy = 100;
		b.hungry = 50;
		System.out.println("b的欢乐度是:" + b.happy + "  饥饿度是：" + b.hungry);
		b.feed();
		b.punish();
		b.play();
	}
}

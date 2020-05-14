package chapter06_对象.dog;

//封装： 成员（狗）的属性、方法封装在一个类组件中
public class Dog {
	String name;
	int hungry;
	int happy;

	public void feed() {
		System.out.println("给" + name + "喂食");
		hungry -= 10;
		System.out.println("饥饿度为" + hungry);
	}

	public void play() {
		System.out.println("陪" + name + "玩耍");
		happy += 10;
		System.out.println("欢乐度为" + happy);
	}

	public void punish() {
		System.out.println("打" + name + "屁屁");
		happy -= 10;
		System.out.println("欢乐度为" + happy);
	}
}

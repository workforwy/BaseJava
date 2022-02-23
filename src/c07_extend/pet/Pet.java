package c07_extend.pet;

public abstract class Pet {
	String name;
	int hungry;
	int happy;

	public void feed() {
		System.out.println("给" + name + "喂食");
		hungry -= 10;
	}

	public void play() {
		System.out.println("陪" + name + "玩耍");
		hungry += 10;
		happy += 10;
	}

	public void punish() {
		System.out.println("打" + name + "的PP");
		happy -= 10;
		// 执行子类中实现的方法
		cry();
	}

	public void cry() {

	}
}

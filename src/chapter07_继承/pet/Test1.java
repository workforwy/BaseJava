package chapter07_extend.pet;

public class Test1 {
	public static void main(String[] args) {
		Dog a=new Dog();
		Cat b=new Cat();
		Bug c=new Bug();
		a.name="Íú²Æ";
		b.name="kitty";
		c.name="Ð¡Ç¿";
		
		f(a);
		f(b);
		f(c);
		
	}
	public static void f(Pet p){
		p.feed();
		p.play();
		p.punish();
	}
}

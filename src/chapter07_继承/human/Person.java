package chapter07_继承.human;

public class Person {
	String name;
	String gender;
	int age;

	public Person() {
		System.out.println("Person");
	}

	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {
		return "\n姓名" + name + "\n性别" + gender + "\n年龄" + age;
	}
}

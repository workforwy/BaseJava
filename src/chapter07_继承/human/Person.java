package chapter07_�̳�.human;

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
		return "\n����" + name + "\n�Ա�" + gender + "\n����" + age;
	}
}

package c07_extend.human;

public class Student extends Person {
	String school;

	public Student() {
		// super Ĭ�ϵ���
		System.out.println("Student");
	}

	public Student(String name, String gender, int age, String school) {
		super(name, gender, age);
		this.school = school;
		System.out.println("School()");
	}

	public String toString() {
		return super.toString() + "\nѧУ" + school;
	}
}
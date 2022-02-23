package c07_extend.human;

public class Employee extends Person {
	String company;

	public String toString() {
		return "\n姓名" + name + "\n性别" + gender + "\n年龄" + age + "\n公司" + company;
	}
}

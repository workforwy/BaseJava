package c07_extend.human;

public class Employee extends Person {
	String company;

	public String toString() {
		return "\n����" + name + "\n�Ա�" + gender + "\n����" + age + "\n��˾" + company;
	}
}

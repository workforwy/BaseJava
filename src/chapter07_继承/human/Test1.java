package chapter07_�̳�.human;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("����", "��", 50);
		Student s = new Student();
		s.name = "����";
		s.gender = "��";
		s.age = 30;
		s.school = "SSSSS";
		Employee e = new Employee();
		e.name = "����";
		e.gender = "��";
		e.age = 20;
		e.company = "fffff";
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
	}
}

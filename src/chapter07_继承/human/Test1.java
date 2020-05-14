package chapter07_继承.human;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("张三", "男", 50);
		Student s = new Student();
		s.name = "李四";
		s.gender = "男";
		s.age = 30;
		s.school = "SSSSS";
		Employee e = new Employee();
		e.name = "王五";
		e.gender = "男";
		e.age = 20;
		e.company = "fffff";
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
	}
}

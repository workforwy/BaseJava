package chapter07_extend.human;

public class Test3 {
	public static void main(String[] args) {
		Person p = new Person("����", "��", 50);
		Student s = new Student("����", "��", 52, "����");
		Employee e = new Employee();
		e.name = "haha";
		e.gender = "Ů";
		e.age = 23;
		e.company = "qqq";
		f(p);
		f(s);
		f(e);
	}

	private static void f(Person p) {
		// ��ִ���ڼ� ��̬����to string��������
		System.out.println(p.toString());
	}
}

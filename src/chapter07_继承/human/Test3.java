package chapter07_extend.human;

public class Test3 {
	public static void main(String[] args) {
		Person p = new Person("张三", "男", 50);
		Student s = new Student("神弓手", "男", 52, "哈哈");
		Employee e = new Employee();
		e.name = "haha";
		e.gender = "女";
		e.age = 23;
		e.company = "qqq";
		f(p);
		f(s);
		f(e);
	}

	private static void f(Person p) {
		// 在执行期间 动态查找to string（）方法
		System.out.println(p.toString());
	}
}

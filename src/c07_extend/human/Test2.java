package c07_extend.human;

public class Test2 {
	public static void main(String[] args) {
		Student a = new Student();
		System.out.print(a);

		Student b = new Student("xiaoming", "nan", 20, "123");
		System.out.print(b);
	}
}

package c06_object.student;

public class Student {
	int id;
	String name;
	String gender;
	int age; // 类里面的项

	public Student() {
	}

	public Student(int id, String name) {
		this(id, name, null);// 从构造方法，调用另一个构造方法，目的是减少代码的重复
	}

	public Student(int id, String name, String gender) {
		this(id, name, gender, 0);
	}

	public Student(int id, String name, String gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age; // 类里的项目直接引用到方法里的项目
	}

	public String toString() {
		return "学号" + id + "\n姓名" + name + "\n性别" + gender + "\n年龄" + age;
	}
}

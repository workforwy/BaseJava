package c08_list.hashmap;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;

	public Student() {
		super();
	}

	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\n学号" + id + "\n姓名" + name + "\n性别" + gender + "\n年龄" + age;
	}

	@Override
	public int hashCode() {
		/*
		 * 不同的属性值，尽量产生不同的哈希值 是一种惯用的有效算法
		 */
		int p = 31;
		int r = 1;
		r = r * p + id;
		r = r * p + name.hashCode();
		r = r * p + gender.hashCode();
		r = r * p + age;
		return r;
	}

	@Override
	public boolean equals(Object a) {
		if (!(a instanceof Student))
			return false;// 判断a是不是student的实例
		if (a == null)
			return false;// 判断a是不是一个空值
		if (a == this)
			return true;// 判断a的值是不是它本身的值
		Student s = (Student) a;// 将Object a的值强转成student类赋值给s
		return id == s.id && // 将s的id属性和a的id属性对比返回true或者false
				name.equals(s.name) && // 将s的name属性和a的name属性对比返回true或者false
				gender.equals(s.gender) && // 将s的gender属性和a的gender属性对比返回true或者false
				age == s.age;// 将s的age属性和a的age属性对比返回true或者false
	}
}

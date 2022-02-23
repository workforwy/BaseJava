package c06_object.student;

public class Student {
	int id;
	String name;
	String gender;
	int age; // ���������

	public Student() {
	}

	public Student(int id, String name) {
		this(id, name, null);// �ӹ��췽����������һ�����췽����Ŀ���Ǽ��ٴ�����ظ�
	}

	public Student(int id, String name, String gender) {
		this(id, name, gender, 0);
	}

	public Student(int id, String name, String gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age; // �������Ŀֱ�����õ����������Ŀ
	}

	public String toString() {
		return "ѧ��" + id + "\n����" + name + "\n�Ա�" + gender + "\n����" + age;
	}
}

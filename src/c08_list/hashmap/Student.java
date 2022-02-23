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
		return "\nѧ��" + id + "\n����" + name + "\n�Ա�" + gender + "\n����" + age;
	}

	@Override
	public int hashCode() {
		/*
		 * ��ͬ������ֵ������������ͬ�Ĺ�ϣֵ ��һ�ֹ��õ���Ч�㷨
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
			return false;// �ж�a�ǲ���student��ʵ��
		if (a == null)
			return false;// �ж�a�ǲ���һ����ֵ
		if (a == this)
			return true;// �ж�a��ֵ�ǲ����������ֵ
		Student s = (Student) a;// ��Object a��ֵǿת��student�ำֵ��s
		return id == s.id && // ��s��id���Ժ�a��id���ԶԱȷ���true����false
				name.equals(s.name) && // ��s��name���Ժ�a��name���ԶԱȷ���true����false
				gender.equals(s.gender) && // ��s��gender���Ժ�a��gender���ԶԱȷ���true����false
				age == s.age;// ��s��age���Ժ�a��age���ԶԱȷ���true����false
	}
}

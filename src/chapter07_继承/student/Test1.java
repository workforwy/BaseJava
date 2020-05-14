package chapter07_extend.student;

public class Test1 {
	public static void main(String[] args) {
		Student s = new Student();// 初始化子类
		s.setId(888888);// 单独写入
		System.out.println(s.getId());// 单独取出
	}
}


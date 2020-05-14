package chapter06_object.car;

public class Test1 {
	public static void main(String[] args) {
		// 新建car对象赋给变量a
		Car a = new Car("红色", "保时捷", 200);// 对局部变量赋值定义
		Car b = new Car("蓝色", "兰博基尼", 250);
		// 让a汽车，执行go（）方法
		a.go();
		b.go();
		a.stop();
		b.stop();
	}

}

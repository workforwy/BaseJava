package chapter06_object.soldier;

public class Test1 {
	public static void main(String[] args) {
		//新建一个soldier对象  初始化对象
		Soldier a=new Soldier();
		Soldier b=new Soldier();
		//用a，b找到第一个士兵对象的内存空间，访问它的id变量并命名
		a.id=9527;
		b.id=9528;
		//用a找到第一个士兵，让她执行go等成员方法
		a.go();
		a.standby();
		b.attcak();
		b.attcak();
		b.attcak();
		b.attcak();
		b.attcak();
		b.attcak();
	}
}

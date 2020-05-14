package chapter06_object.soldier;

import java.util.Random;

/*
 * 封装：
 * 将相关属性、运算代码
 * 封装在一个类组件
 */
public class Soldier {// 属性变量、成员变量
	int id;// 成员变量有默认值
	int blood = 100;// 成员变量可以赋值
	static int count;// 静态成员变量count士兵计数d变量

	public Soldier() {// 构造方法Soldier
		System.out.println("新建了一个士兵对象");
		Soldier.count++;
		System.out.println("目前共有" + count + "个士兵");
	}

	// 成员方法 go standby attack
	public void go() {
		System.out.println(id + "号士兵前进");
	}

	public void standby() {
		System.out.println(id + "号士兵待命");
	}

	public void attcak() {
		if (blood == 0) {
			System.out.println("这是" + id + "号士兵的尸体");
			return;
		}
		System.out.println(id + "号士兵攻击");
		int b = new Random().nextInt(10);
		if (blood < b) {// 血量不足时，有多少减多少
			b = blood;
		}
		blood -= b;// 持续以B血量减血
		System.out.println("减血：" + b);
		System.out.println("当前血量：" + blood);
		if (blood == 0) {
			System.out.println(id + "号士兵阵亡");
			Soldier.count--;
			System.out.println("目前共有" + count + "个士兵");
		}
	}
}
